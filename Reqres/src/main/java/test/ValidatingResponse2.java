package test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatingResponse2 {

    @Test
    void GetWhetherDetails(){

        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/Astoria");

        String responseBody = response.getBody().asString();
        System.out.println("Response body is :" + responseBody);

        Assert.assertEquals(responseBody.contains("Astoria"),true);

        Headers allheaders = response.headers();

        for (Header header:allheaders){
            System.out.println(header.getName() + "    " + header.getValue());
        }

    }
}
