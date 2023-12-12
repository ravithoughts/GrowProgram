package com.epam.growprogram.apitesting.hometask4restautomation;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherDetails {
    String baseURL = "http://api.openweathermap.org/data/2.5";
    String apiKEY = "81c90bd8ecfb3d4605bb23cb626a4144";
    float latitude = 0;
    float longitude = 0;

    public void openWeather() {
        getWeather();
        validateWeather();
    }

    public void getWeather() {
        String city = "hyderabad";
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri(baseURL)
                .setContentType("application/json")
                .addQueryParam("q", city)
                .addQueryParam("appid", apiKEY)
                .build();

        Response resp = given().spec(requestSpec)
                .log().all()
                .when()
                .get("/weather");

        // validate the status code is ‘200’
        assertEquals(200, resp.getStatusCode());

        // get the value of latitude and longitude
        JsonPath jp = new JsonPath(resp.asString());
        latitude = jp.get("coord.lat");
        longitude = jp.get("coord.lon");
        System.out.println("lat: " + latitude);
        System.out.println("lon: " + longitude);
    }

    public void validateWeather() {
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri(baseURL)
                .setContentType("application/json")
                .addQueryParam("lat", latitude)
                .addQueryParam("lon", longitude)
                .addQueryParam("appid", apiKEY)
                .build();

        Response resp = given().spec(requestSpec)
                .log().all()
                .when()
                .get("/weather");

        // validate the status code is ‘200’
        assertEquals(200, resp.getStatusCode());

        // validate the name is 'Hyderabad'
        JsonPath jp = new JsonPath(resp.asString());
        assertEquals("Hyderabad", jp.get("name"));

        // validate the sys.country is 'IN'
        assertEquals("IN", jp.get("sys.country"));

        // validate the temp_max and temp_min is 'greater than 0'
        assertTrue(jp.getFloat("main.temp_max") > 0);
        assertTrue(jp.getFloat("main.temp_min") > 0);
    }
}