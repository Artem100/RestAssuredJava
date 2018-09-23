package framework;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class RestConfiguration {

    @BeforeSuite(alwaysRun = true)
    public void configure(){
        RestAssured.baseURI= "https://swapi.co/api";
        //RestAssured.port =;
        RestAssured.basePath="/people";
    }

}
