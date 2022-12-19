package jp.gr.java_conf.uzresk.appium.sample;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;

import java.io.File;

public class FirstTest extends BaseAndroidTest {

    @Test
    public void test() throws Exception {
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshot.jpg");
        FileUtils.copyFile(screenshot, dest);
    }
}
