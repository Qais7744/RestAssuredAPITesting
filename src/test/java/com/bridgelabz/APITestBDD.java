package com.bridgelabz;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.junit.Test;

public class APITestBDD {
    //    Behaviour Driven Development
    @Test
    public void getTest() {
        RestAssured.given()
                .when().get(" http://localhost:3000/posts")
                .then().assertThat().statusCode(200);

    }

    @Test
    public void postTest() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 12);
        jsonObject.put("title", "Title value");
        jsonObject.put("author", "Jack");
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toJSONString())
                .when()
                .post("http://localhost:3000/posts")
                .then()
                .statusCode(201);
    }

    @Test
    public void postTest1() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 12);
        jsonObject.put("title", "Title value");
        jsonObject.put("author", "Jack");
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toJSONString())
                .when()
                .post("http://localhost:3000/posts")
                .then()
                .statusCode(201);
    }

    @Test
    public void putTest() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "JavaDeveloper");
        jsonObject.put("author", "Shailesh");
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toJSONString())
                .when()
                .put("http://localhost:3000/posts/12")
                .then()
                .statusCode(200);
    }

    @Test
    public void deleteTest() {

        JSONObject jsonObject = new JSONObject();
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toJSONString())
                .when()
                .delete("http://localhost:3000/posts/11")
                .then()
                .statusCode(200);
    }
}
