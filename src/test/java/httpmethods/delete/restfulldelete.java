package httpmethods.delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class restfulldelete {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void deletebooking(){

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/1");
        r.contentType("application/json");

        r.cookie("token","2c9f774e4574497");


        response = r.when().log().all().delete();


        vr = response.then().log().all();

        vr.statusCode(201);

    }




}

