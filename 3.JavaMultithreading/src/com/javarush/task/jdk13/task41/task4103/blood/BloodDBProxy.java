package com.javarush.task.jdk13.task41.task4103.blood;

import com.javarush.task.jdk13.task41.task4103.security.SecuritySystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BloodDBProxy implements DB {
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

    public BloodDBProxy() {
        this.security = new SecuritySystem();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        security.authorize(login, password);
        if (security.isAuthorized()) {
            this.db = new BloodDB();
        }
    }

    @Override
    public BloodSample getById(int id) {
        BloodSample result;
        if (security.isAuthorized()) {
            result = db.getById(id);
        } else {
            result = denied;
        }
        return result;
    }

    @Override
    public List<BloodSample> find(String request) {
        if (security.isAuthorized()) {
            return db.find(request);
        } else {
            return Collections.singletonList(denied);
        }
    }
}
