package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    List<WasRun> tests = new ArrayList<>();

    public void add(WasRun test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        for (WasRun test : tests) {
            test.run(result);
        }
    }
}
