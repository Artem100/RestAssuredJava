package apiTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import apiTests.common.EndPoint;

public class tryApi {

    @Test
    public void getMethod(){
        given().get("https://swapi.co/api/people/1/").then().statusCode(200).log().all();
    }

    @Test(groups = "demo")
    public void getMethodPath(){
        given().get(EndPoint.GET_PEOPLE).then().statusCode(200).log().all();
    }

}
