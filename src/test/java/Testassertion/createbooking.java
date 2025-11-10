package Testassertion;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.hamcrest.text.MatchesPattern;
import org.testng.annotations.Test;

public class createbooking {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void createbooking(){

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType("application/json");
        r.body("{\n" +
                "    \"firstname\" : \"Jimy boy\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}");

        response = r.when().log().all().post();

        vr = response.then();
        vr.log().all();
        vr.statusCode(200);
        vr.body("booking", Matchers.notNullValue());
        vr.body("booking.firstname",Matchers.equalTo("Jimy boy"));
        vr.body("booking.bookingdates.checkin",Matchers.equalTo("2018-01-01"));




    }


}
