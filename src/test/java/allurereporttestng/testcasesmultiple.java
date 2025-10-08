package allurereporttestng;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class testcasesmultiple {


    @Test
    public void testcase1valid(){

        String Pincode = "110048";
        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/" + Pincode).log().all().get()
                .then().log().all().statusCode(200);

    }
        @Test
    public void testcase2invalid(){

        String Pincode = "@";
        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/" + Pincode).log().all().get()
                .then().log().all().statusCode(200);

    }
    @Test
    public void testcase3invalid(){

        String Pincode = " ";
        RestAssured.given().baseUri("https://api.zippopotam.us/").basePath("/IN/" + Pincode).log().all().get()
                .then().log().all().statusCode(200);

    }

}
