package apiTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class tryApi {

    @Test
    public void getMethod(){
        given().get("https://swapi.co/api/people/1/").then().statusCode(200).log().all();
    }
}
