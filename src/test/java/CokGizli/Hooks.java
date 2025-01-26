package CokGizli;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;

public class Hooks {

    @BeforeScenario
    public void BeforeTest(){
        BaseTest.launchBrowser();
    }

    @AfterScenario
    public void AfterTest(){
        BaseTest.tearDown();
    }
}
