package com.javarush.task.jdk13.task41.task4121.support;

import static java.util.Objects.nonNull;

public abstract class TechSupport {

    private TechSupport nextLevel;

    public TechSupport setNextLevel(TechSupport nextLevel) {
        this.nextLevel = nextLevel;
        return nextLevel;
    }

    public abstract void solve(String problem);

    protected void passAlongTheChain(String problem) {
        if (nonNull(nextLevel)) {
            nextLevel.solve(problem);
        }
    }
}
