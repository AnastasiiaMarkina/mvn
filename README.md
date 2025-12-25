# Maven Test Automation Project

This is a test automation project built with Java, Selenide, and JUnit5.

## Technologies Used

- **Java 24**
- **Selenide 7.2.0** - Browser automation framework
- **JUnit 5.11.0** - Testing framework
- **Allure 2.29.1** - Test reporting
- **Rest Assured 5.3.0** - REST API testing
- **Maven** - Build and dependency management

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── config/
│   │   │   ├── AppConfiguration.java
│   │   │   └── BrowserConfig.java
│   │   └── utils/
│   │       └── RestHelper.java
│   └── resources/
│       └── application.properties
└── test/
    ├── java/
    │   ├── base/
    │   ├── pages/
    │   ├── suits/
    │   └── tests/
    └── resources/
```

## Prerequisites

- JDK 24 or higher
- Maven 3.6+

## Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd mvn
```

2. Install dependencies:
```bash
mvn clean install
```

## Running Tests

Execute all tests:
```bash
mvn test
```

## Generate Allure Report

```bash
mvn allure:serve
```

## Configuration

Application settings can be configured in `src/main/resources/application.properties`

## License

This project is licensed under the MIT License.

