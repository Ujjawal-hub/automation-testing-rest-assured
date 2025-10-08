package org.example;

import io.restassured.RestAssured;

public class restassuredhelloworld {
    public static void main(String[] args) {

        RestAssured.given()

                .baseUri("https://restful-booker.herokuapp.com")
        .basePath("/ping")

                .when()
                .log().all().get()

                .then()
                .log().all().statusCode(201);


    }



}
