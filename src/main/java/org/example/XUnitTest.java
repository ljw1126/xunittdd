package org.example;

public class XUnitTest {
    public static void main(String[] args) {
       new TestCaseTest("testTemplateMethod").run();
       new TestCaseTest("testResult").run();
       new TestCaseTest("testFailedResultFormatting").run();
    }
}
