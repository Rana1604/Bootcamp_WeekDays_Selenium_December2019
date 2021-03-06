package map.test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETValueOfEachNode {

    @Test
    void GetWhetherDetails(){

        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/New York");


        JsonPath jsonpath = response.jsonPath();

        jsonpath.get("City");
        jsonpath.get("Temperature");
        jsonpath.get("Humidity");
        jsonpath.get("WeatherDescription");
        jsonpath.get("WindSpeed");
        //System.out.println(jsonpath.get("Temperature"));
        //System.out.println(jsonpath.get("Humidity"));
        //System.out.println(jsonpath.get("WeatherDescription"));

        //Assert.assertEquals(jsonpath.get("Temperature"), "19 Degree celsius");

    }

}
