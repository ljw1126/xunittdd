package org.example;

public class TestResult {
    int runCount = 0;
    int errorCount = 0;

    public void testStarted() {
        runCount += 1;
    }

    public void testFailed() {
        errorCount += 1;
    }

    public String getSummary() {
        return runCount + " run, " + errorCount + " failed";
    }
}
