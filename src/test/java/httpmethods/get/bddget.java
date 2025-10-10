package httpmethods.get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class bddget {

    @Test
    public void testgetbdd(){
       String Pincode = "10048";
        RestAssured.given().baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" + Pincode).when().log().all().get()
                .then().log().all().statusCode(200);

    }
}
