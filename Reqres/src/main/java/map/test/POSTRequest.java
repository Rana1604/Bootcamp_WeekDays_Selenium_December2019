package map.test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POSTRequest {

    @Test
    void RegistrationSuccessful(){

        //Specify base URI
        RestAssured.baseURI = "http://restapi.demoqa.com/customer";

        //Request object
        RequestSpecification httpRequest = RestAssured.given();

        //Response Object

        //Request payload sending along with post request
        JSONObject requestParam = new JSONObject();

        requestParam.put("FirstName", "Tofayel");
        requestParam.put("LastName", "Rana");
        requestParam.put("UserName", "Rana1604");
        requestParam.put("Password", "12345");
        requestParam.put("Email", "aabc2625@gmail.com");

        httpRequest.header("Content-Type", "application/json");

        httpRequest.body(requestParam.toJSONString()); //Attach above data to the request

        //Response object
        Response response = httpRequest.request(Method.POST, "/register");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response body is:" + responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        Assert.assertEquals(statusCode, 200);

        //Success code validation
        String successCode = response.jsonPath().get("Successcode");
        Assert.assertEquals(successCode,"OPERATION_SUCCESS");

    }
}
