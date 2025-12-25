package tests;

import config.AppConfiguration;
import org.junit.jupiter.api.Test;

public class Serg {

    @Test
    void test() {
        AppConfiguration config = AppConfiguration.getInstance();
        String url = config.getAppUrl();
        System.out.println("Hello"+url);
    }
}
