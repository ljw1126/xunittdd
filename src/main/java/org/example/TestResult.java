package org.example;

public class TestResult {
    int runCount = 0;

    public void testStarted() {
        runCount += 1;
    }

    public String getSummary() {
        return runCount + " run, 0 failed";
    }
}
