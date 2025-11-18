package Testassertion;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class alltypeofassertion {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void restassuredassertion() {
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


        //Rest Assured Assertion
        vr.body("booking.firstname",Matchers.equalTo("Jimy boy"));

        String first = vr.extract().path("booking.firstname");



        // Testng assertion
        Assert.assertEquals(first,"Jimy boy");


        String last = vr.extract().path("booking.lastname");

        Integer bookingId = vr.extract().path("bookingid");


        // AssertJ( 3rd- Lib to Assertions)
        assertThat(bookingId).isNotZero().isNotNull().isPositive();


    }


}