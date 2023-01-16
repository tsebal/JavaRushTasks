package com.javarush.task.sql.task15.task1504;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Client extends Person {

    @Column(name = "bank", nullable = false, length = 100)
    private String bank;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
