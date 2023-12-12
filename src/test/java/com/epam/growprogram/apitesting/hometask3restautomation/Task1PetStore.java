package com.epam.growprogram.apitesting.hometask3restautomation;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class Task1PetStore {
    @Test
    public void validatePet() {
        createPet();
        getPet();
    }

    public void createPet() {
        given().baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .log().all()
                .body("{\n" +
                        "    \"id\": 12345,\n" +
                        "    \"category\": {\n" +
                        "        \"id\": 1,\n" +
                        "        \"name\": \"dog\"\n" +
                        "    },\n" +
                        "    \"name\": \"snoopie\",\n" +
                        "    \"photoUrls\": [\n" +
                        "        \"string\"\n" +
                        "    ],\n" +
                        "    \"tags\": [\n" +
                        "        {\n" +
                        "            \"id\": 0,\n" +
                        "            \"name\": \"string\"\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"status\": \"pending\"\n" +
                        "}")
                .when()
                .post("/pet")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }

    public void getPet() {
        Response resp = given().baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .log().all()
                .when()
                .get("/pet/12345");

        // validate the status code is equal to ‘200’
        assertEquals(200, resp.getStatusCode());

        // validate the content type is ‘application/json’
        assertEquals("application/json", resp.contentType());

        // validate if the pet is a ‘dog’, its name is ‘snoopie’
        String respJson = resp.asString();
        JsonPath jp = new JsonPath(respJson);
        if (jp.get("category.name").equals("dog")) {
            assertEquals("snoopie", jp.get("name"));
        }
        //validate its current status is ‘pending’
        assertEquals("pending", jp.get("status"));
    }
}