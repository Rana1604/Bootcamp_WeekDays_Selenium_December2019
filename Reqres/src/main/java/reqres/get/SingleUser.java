package reqres.get;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SingleUser {


    public void AuthorizationTest() {

        RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";

        //Basic authentication
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("ToolsQA");
        authScheme.setPassword("TestPassword");

        RestAssured.authentication = authScheme;


        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/");


        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
//        Assert.assertEquals(statusCode, 200);

        String statusLine = response.getStatusLine();
        System.out.println("status line is:" + statusLine);
//        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

    }
}
