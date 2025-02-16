package org.example;

import org.springframework.core.annotation.AnnotationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test {
    List<Test> tests = new ArrayList<>();

    public TestSuite(Class<? extends Test> testClass) {
        Arrays.stream(testClass.getMethods())
                .filter(m -> AnnotationUtils.findAnnotation(m, org.example.annotation.Test.class) != null)
                .forEach(m -> {
                    try {
                        add(testClass.getConstructor(String.class).newInstance(m.getName()));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public TestSuite() {

    }

    public void add(Test test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        for (Test test : tests) {
            test.run(result);
        }
    }
}
