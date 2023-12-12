package com.epam.growprogram.apitesting.hometask3restautomation;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2JsonPlaceholder {
    public void validateUser() {
        String baseURL = "https://jsonplaceholder.typicode.com";
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri(baseURL).setContentType("application/json").build();
        RequestSpecification requestSpec = builder.build();

        Response resp = given().spec(requestSpec)
                .log().all()
                .when()
                .get("/users");
        JsonPath jsonPathEvaluator = resp.jsonPath();

        // validate there more than 3 users in the list
        List<String> allUsers = jsonPathEvaluator.getList("name");
        assertTrue(allUsers.size() > 3, "There are more than 3 users in the list");

        //validate one of the users has a name of “Ervin Howell”
        int flag = 0;
        for (String user : allUsers) {
            if (user.equalsIgnoreCase("Ervin Howell")) {
                flag = 1;
                break;
            }
        }
        assertEquals(1, flag, "Is Ervin Howell present?");
    }
}