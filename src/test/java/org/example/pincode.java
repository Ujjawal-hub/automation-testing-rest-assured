package org.example;

import io.restassured.RestAssured;

import java.util.Scanner;

public class pincode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the pincode");

        Integer Pincode = scanner.nextInt();


        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/" + Pincode).log().all().get()
                .then().log().all().statusCode(200);
    }
}
