package org.example;

import java.lang.reflect.Method;

public class TestCase {
    protected final String name;

    protected TestCase(String name) {
        this.name = name;
    }

    public TestResult run() {
        TestResult result = new TestResult();
        setUp();

        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        tearDown();
        return result;
    }

    public void setUp() {
    }

    public void tearDown() {
    }
}
