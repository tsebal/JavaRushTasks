package com.javarush.task.jdk13.task41.task4109;

public class User extends AbstractEntity {
    public String socialKey;
    public String secretKey;
    public String displayName;
    public String pictureUrl;
    public String sessionId;
    public String referenceKey;
    public int level;
    public int lesson;
    public int darkMatter;
    public int rating;
    public String email;
    public String country;
    public String city;
    public String statusMessage;

    public User() {
    }

    public User(User target) {
        super(target);
        this.socialKey = target.socialKey;
        this.secretKey = target.secretKey;
        this.displayName = target.displayName;
        this.pictureUrl = target.pictureUrl;
        this.sessionId = target.sessionId;
        this.referenceKey = target.referenceKey;
        this.level = target.level;
        this.lesson = target.lesson;
        this.darkMatter = target.darkMatter;
        this.rating = target.rating;
        this.email = target.email;
        this.country = target.country;
        this.city = target.city;
        this.statusMessage = target.statusMessage;
    }

    @Override
    public AbstractEntity clone() {
        return new User(this);
    }
}
