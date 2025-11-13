package payload_management.map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class ex_01linkedhashmap {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    LinkedHashMap<String,Object>  payload = new LinkedHashMap<>();




    @Test
    public void bookingmap(){

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType("application/json");
payload.put("firstname","jimo");
payload.put( "lastname" , "Brown");
        payload.put( "totalprice" , 111);
        payload.put("depositpaid", true);

     Map<String,Object> bookingdatess = new LinkedHashMap<>();

     bookingdatess.put("checkin", "2018-01-01");
     bookingdatess.put("checkout", "2019-01-01");

     payload.put("bookingdates",bookingdatess);

        payload.put( "additionalneeds","Breakfast");

        r.body(payload);

        System.out.println(payload);

        response = r.when().log().all().post();

        vr = response.then();
        vr.log().all();
        vr.statusCode(200);



    }


}
