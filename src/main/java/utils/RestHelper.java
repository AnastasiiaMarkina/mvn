package utils;

import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;

public class RestHelper {
    public static ValidatableResponse get(String endpoint) {
        String baseUrl = "http://app:" + OrchestratorHelper.getDynamicPort("app");  // Из оркестратора
        return given().baseUri(baseUrl).when().get(endpoint).then();
    }
}
