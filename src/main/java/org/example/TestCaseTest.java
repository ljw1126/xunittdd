package org.example;

public class TestCaseTest extends TestCase {
    protected TestCaseTest(String name) {
        super(name);
    }

    WasRun wasRun;

    @Override
    public void setUp() {
        wasRun = new WasRun("testMethod");
    }

    public void testTemplateMethod() {
        wasRun.run();
        Assert.assertEquals("setUp testMethod", wasRun.log);
    }
}
