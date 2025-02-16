package org.example;

import java.lang.reflect.Method;

public class TestCase {
    protected final String name;

    protected TestCase(String name) {
        this.name = name;
    }

    public void run() {
        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
