package reqres.test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewEmployees {
    @Test
    void postNewEmployees(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

        RequestSpecification httpReqeust = RestAssured.given();


        //Here we created data that we can send along with teh post request.
        JSONObject requestParams = new JSONObject();

        requestParams.put("name", "Rana");
        requestParams.put("salary", "2000");
        requestParams.put("age", "33");

        //Add a header stating the request body is a JSON
        httpReqeust.header("Content-Type", "application/json");

        //Add the JSON to the body of the request
        httpReqeust.body(requestParams.toJSONString());

        //Post Request
        Response response = httpReqeust.request(Method.POST,"/create");

        //Capturing the response body ot perform validation
        String responseBody= response.getBody().asString();

        Assert.assertEquals(responseBody.contains("Rana"), true);
        Assert.assertEquals(responseBody.contains("2000"), true);
        Assert.assertEquals(responseBody.contains("33"), true);

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }


//    @DataProvider(name ="empdataprovider")
//    String[][] getEmpData()
//    {
//        String empdata [][] = {{"abc123", "3000", "34"}, {"xyz123", "4000", "35"}, {"pqe123", "4300", "32"}};
//        return (empdata);
//    }

}
