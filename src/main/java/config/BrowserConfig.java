package config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserConfig {
    public enum Browser {
        CHROME, FIREFOX, EDGE, SAFARI
    }

    public static void setupBrowser(Browser browser) {
        switch (browser) {
            case CHROME:
                setupChrome();
                break;
            case FIREFOX:
                setupFirefox();
                break;
            case EDGE:
                setupEdge();
                break;
            case SAFARI:
                setupSafari();
                break;
        }
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    private static void setupChrome() {
        Configuration.browser = "chrome";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        Configuration.browserCapabilities = options;
    }

    private static void setupFirefox() {
        Configuration.browser = "firefox";
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("dom.webnotifications.enabled", false);
        Configuration.browserCapabilities = options;
    }

    private static void setupEdge() {
        Configuration.browser = "edge";
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-notifications");
        Configuration.browserCapabilities = options;
    }

    private static void setupSafari() {
        Configuration.browser = "safari";
    }
}
