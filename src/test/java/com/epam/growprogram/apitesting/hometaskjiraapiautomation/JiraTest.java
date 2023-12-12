package com.epam.growprogram.apitesting.hometaskjiraapiautomation;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class JiraTest {
    @Test
    public void jiraDefectTest() {
        // login to Jira
        RestAssured.baseURI = "http://localhost:8080";
        SessionFilter session = new SessionFilter();
        given().relaxedHTTPSValidation()
                .log().all()
                .filter(session)
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"username\": \"ravikumar_sankaranarayanan\",\n" +
                        "    \"password\": \"Welcome@123\"\n" +
                        "}")
                .when()
                .post("/rest/auth/1/session")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);

        //create the defect in Jira
        String resp = given().relaxedHTTPSValidation()
                .log().all()
                .filter(session)
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"fields\": {\n" +
                        "        \"project\": {\n" +
                        "            \"key\": \"GROW\"\n" +
                        "        },\n" +
                        "        \"issuetype\": {\n" +
                        "            \"name\": \"Bug\"\n" +
                        "        },\n" +
                        "        \"summary\": \"new defect creating from rest api automation\",\n" +
                        "        \"description\": \"Creating of an issue using rest api automation\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("/rest/api/2/issue")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201)
                .extract()
                .response().asString();
        JsonPath js = new JsonPath(resp);
        String defectid = js.get("key");
        System.out.println(defectid);

        //update the defect using defect ID
        given().relaxedHTTPSValidation()
                .log().all()
                .filter(session)
                .pathParam("bugid", defectid)
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"fields\": {\n" +
                        "        \"project\": {\n" +
                        "            \"key\": \"GROW\"\n" +
                        "        },\n" +
                        "        \"issuetype\": {\n" +
                        "            \"name\": \"Bug\"\n" +
                        "        },\n" +
                        "        \"summary\": \"new defect creating from rest api automation - updated summmary.\",\n" +
                        "        \"description\": \"Creating of an issue using rest api automation - updated descp\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .put("/rest/api/2/issue/{bugid}")
                .then()
                .log().all()
                .assertThat()
                .statusCode(204);

        //Add an attachment to the defect
        given().log().all()
                .filter(session)
                .pathParam("bugid", defectid)
                .header("X-Atlassian-Token", "no-check")
                .header("Content-Type", "multipart/form-data")
                .multiPart("file", new File("C:\\Users\\ravikumar_sankaranar\\Desktop\\JiraAttachmentTest.txt"))
                .when()
                .post("/rest/api/2/issue/{bugid}/attachments")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);

        //Delete the defect which is newly created
        given().log().all()
                .filter(session)
                .pathParam("bugid", defectid)
                .header("Content-Type", "application/json")
                .when()
                .delete("rest/api/2/issue/{bugid}")
                .then()
                .log().all()
                .assertThat()
                .statusCode(204);
    }
}