package tests;

import config.AppConfiguration;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

public class TestMyTest {
    //private static final Logger logger = LoggerFactory.getLogger(Serg.class);


    @Test
    void Test() {
        //logger.info("Test is started");
        AppConfiguration config = AppConfiguration.getInstance();
        String url = config.getAppUrl();
        System.out.println("Hello"+url);
        //logger.info("Test successfully completed");
        Allure.step("Verify URL", () -> {
            assert url != null && !url.isEmpty() : "URL should not be null or empty";
        });
    }
}
