package com.javarush.task.jdk13.task41.task4109;

import java.util.Date;

public abstract class AbstractEntity {
    public int id;
    public Date createdTime;
    public Date updatedTime;

    public AbstractEntity() {
    }

    public AbstractEntity(AbstractEntity target) {
        this.id = target.id;
        this.createdTime = target.createdTime;
        this.updatedTime = target.updatedTime;
    }

    public abstract AbstractEntity clone();
}
