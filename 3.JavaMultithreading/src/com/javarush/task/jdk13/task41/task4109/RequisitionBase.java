package com.javarush.task.jdk13.task41.task4109;

public abstract class RequisitionBase extends AbstractEntity {
    public User user;
    public String name;
    public String mail;
    public String utmMark;
    public String webinarType;
    public String promoCode;

    public RequisitionBase() {
    }

    public RequisitionBase(RequisitionBase target) {
        super(target);
        this.user = (User) target.user.clone();
        this.name = target.name;
        this.mail = target.mail;
        this.utmMark = target.utmMark;
        this.webinarType = target.webinarType;
        this.promoCode = target.promoCode;
    }
}
