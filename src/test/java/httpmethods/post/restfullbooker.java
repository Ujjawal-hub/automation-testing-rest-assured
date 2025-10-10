package httpmethods.post;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class restfullbooker {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;



    @Test
    public void postrequest(){

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");

        r.header("Content-Type","application/json");
        r.body(
                "{\"username\" : \"admin\" , \"password\" : \"password123\"}");

        response = r.when().log().all().post();

        vr = response.then().log().all();
        vr.statusCode(200);




    }
}
