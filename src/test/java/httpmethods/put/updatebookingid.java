package httpmethods.put;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class updatebookingid {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void updatebooking(){

    r = RestAssured.given();
    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/booking/1");
    r.contentType("application/json");
    r.accept("application/json");
    r.cookie("token","fbfdba0aa12016b");
    r.body("{\n" +
            "    \"firstname\" : \"kylo\",\n" +
            "    \"lastname\" : \"ren\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}");

     response = r.when().log().all().put();


    vr = response.then().log().all();

    vr.statusCode(200);

    }




}
