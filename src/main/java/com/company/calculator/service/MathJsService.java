package com.company.calculator.service;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class MathJsService {

    static final String ENDPOINT = "http://api.mathjs.org/v4/";

    public static String sendGetRequest(String expression){
        Response response = given().
                queryParam("expr", expression).
                when().
                get(ENDPOINT);
        return response.asString();
    }

    public static String sendPostRequest(String expression) {
        String postBody = "  {\"expr\": [\"" + expression + "\"], \"precision\": 14}";
        Response response = given().contentType(ContentType.JSON).
                body(postBody).
                when().
                post(ENDPOINT);
        //Use jsonPath to get JSON elements.
        // Getting the first element from "result" array: { result: ["10", "22"], "error": null }
        return response.jsonPath().get("result[0]");
    }
}
