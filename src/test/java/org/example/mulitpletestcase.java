package org.example;

import io.restassured.RestAssured;


public class mulitpletestcase {
    public static void main(String[] args) {


        Object Pincode = 100111;

        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/" + Pincode).log().all().get()
                .then().log().all().statusCode(200);

        Pincode = "@";

        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/" + Pincode).log().all().get()
                .then().log().all().statusCode(200);

        Pincode = " ";

        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/" + Pincode).log().all().get()
                .then().log().all().statusCode(200);
    }
}