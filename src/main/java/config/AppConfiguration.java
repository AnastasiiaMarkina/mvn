package config;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

public class AppConfiguration {
    private static AppConfiguration instance;
    private Properties properties;

    // Private constructor
    private AppConfiguration() {
        properties = new Properties();
        loadProperties();
    }

    // Thread-safe singleton
    public static synchronized AppConfiguration getInstance() {
        if (instance == null) {
            instance = new AppConfiguration();
        }
        return instance;
    }

    private void loadProperties() {
        try (InputStream input = getClass()
                .getClassLoader()
                .getResourceAsStream("application.properties")) {

            if (input == null) {
                throw new RuntimeException("Unable to find application.properties");
            }

            properties.load(input);
            System.out.println("Configuration loaded successfully");

        } catch (IOException ex) {
            throw new RuntimeException("Failed to load configuration", ex);
        }
    }

    // Generic getter with default value
    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public String getAppUrl() {
        return getProperty("app.url");
    }

}
