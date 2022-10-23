package com.javarush.task.jdk13.task41.task4109;

public class CguRequisition extends RequisitionWithPhone {
    public String requestedSubscriptionType;
    public String language;

    public CguRequisition() {
    }

    public CguRequisition(CguRequisition target) {
        super(target);
        this.requestedSubscriptionType = target.requestedSubscriptionType;
        this.language = target.language;
    }

    @Override
    public AbstractEntity clone() {
        return new CguRequisition(this);
    }
}
