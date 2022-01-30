package com.interview.utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BookItUtils {
    public static String getToken(String email, String password) {
        Response response = RestAssured.given().accept(ContentType.JSON).
                queryParam("email", email).
                queryParam("password", password).
                when()
                .get(ConfigurationReader.getProperty("apiUrl") + "/sign");

        String token = response.path("accessToken");
        String finalToken = "Bearer " + token;
        return finalToken;
    }
    public static String[] getMYInfo(String email, String password) {

        String[] myInfo = new String[3];

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                Response response = given().accept(ContentType.JSON)
                        .and().header("Authorization",getToken(email,password))
                        .when()
                        .get(ConfigurationReader.getProperty("apiUrl")+"/api/teams/my");

                JsonPath jsonPath = response.jsonPath();
                myInfo[i] = jsonPath.getString("name");
            }
            if (i == 1) {

                Response response = given().accept(ContentType.JSON)
                        .and().header("Authorization",getToken(email,password))
                        .when()
                        .get(ConfigurationReader.getProperty("apiUrl")+"/api/batches/my");

                JsonPath jsonPath = response.jsonPath();
                myInfo[i] = "#"+jsonPath.getString("number");
            }
            if(i==2){
                Response response = given().accept(ContentType.JSON)
                        .and().header("Authorization",getToken(email,password))
                        .when()
                        .get(ConfigurationReader.getProperty("apiUrl")+"/api/campuses/my");

                JsonPath jsonPath = response.jsonPath();
                myInfo[i] = jsonPath.getString("location");
            }

        }
        return myInfo;
    }

}
