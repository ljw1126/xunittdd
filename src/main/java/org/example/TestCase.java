package org.example;

import java.lang.reflect.Method;

public class TestCase implements Test {
    protected final String name;

    protected TestCase(String name) {
        this.name = name;
    }

    public void run(TestResult result) {
        result.testStarted();

        setUp();

        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
            result.testFailed();
        }

        tearDown();
    }

    public void setUp() {
    }

    public void tearDown() {
    }
}
