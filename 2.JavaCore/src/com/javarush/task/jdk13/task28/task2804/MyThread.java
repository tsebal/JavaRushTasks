package com.javarush.task.jdk13.task28.task2804;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private static volatile AtomicInteger priority = new AtomicInteger(1);

    private synchronized void tunePriority() {
        int newPriority = priority.getAndIncrement();
        newPriority = getThreadGroup() != null && newPriority > getThreadGroup().getMaxPriority() ? getThreadGroup().getMaxPriority() : newPriority;
        setPriority(newPriority);
        if (priority.intValue() > MAX_PRIORITY) {
            priority.set(1);
        }
    }

    public MyThread() {
        super();
        tunePriority();
    }

    public MyThread(Runnable target) {
        super(target);
        tunePriority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        tunePriority();
    }

    public MyThread(String name) {
        super(name);
        tunePriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        tunePriority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        tunePriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        tunePriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        tunePriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
    }
}
