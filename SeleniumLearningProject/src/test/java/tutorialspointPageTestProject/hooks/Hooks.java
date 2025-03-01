package tutorialspointPageTestProject.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tutorialspointPageTestProject.utilities.Driver;

public class Hooks {
    @Before
    public void setUp() { Driver.getDriver(); }

    @After
    public void tearDown() { Driver.quitDriver(); }
}
