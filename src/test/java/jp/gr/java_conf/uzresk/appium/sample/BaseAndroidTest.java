package jp.gr.java_conf.uzresk.appium.sample;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class BaseAndroidTest {

    protected static AndroidDriver driver;

    /**
     * initialization.
     */
    @BeforeAll
    public static void beforeClass() throws MalformedURLException, URISyntaxException {

        final String APK = "apps/ApiDemos-debug.apk";
        File app = new File(ClassLoader.getSystemResource(APK).toURI());

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("Android Emulator")
                .setApp(app.getAbsolutePath())
                .eventTimings();

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), options);
    }

    /**
     * finishing.
     */
    @AfterAll
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
