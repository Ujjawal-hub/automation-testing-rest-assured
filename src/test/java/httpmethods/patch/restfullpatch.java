package httpmethods.patch;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class restfullpatch {
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
        r.cookie("token","201ed955cf7d28b");
        r.body("{\n" +
                "    \"firstname\" : \"k\",\n" +
                "    \"lastname\" : \"ren\"\n" +

                "}");

        response = r.when().log().all().patch();


        vr = response.then().log().all();

        vr.statusCode(200);

    }




}


