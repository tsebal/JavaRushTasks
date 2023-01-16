package com.javarush.task.sql.task15.task1504;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Employee extends Person {

    @Column(name = "company", nullable = false, length = 100)
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
