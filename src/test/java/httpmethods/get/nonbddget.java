package httpmethods.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class nonbddget {


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

String Pincode;

@Test
    public void testcasenonbddvalid(){
Pincode = "110011";
     r = RestAssured.given();

     r.baseUri("https://api.zippopotam.us/");
            r.basePath("/IN/" + Pincode);

     response = r.when().log().all().get();

     vr = response.then().log().all();

     vr.log().all().statusCode(200);
}

    @Test
    public void testcasenonbddinvalid(){
        Pincode = " ";
        r = RestAssured.given();

        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/IN/" + Pincode);

        response = r.when().log().all().get();

        vr = response.then().log().all();

        vr.log().all().statusCode(200);
    }



}
