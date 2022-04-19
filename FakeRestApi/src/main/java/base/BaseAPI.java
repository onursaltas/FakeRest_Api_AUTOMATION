package base;

import config.Var;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;


public abstract class BaseAPI extends Var {



    public Response post(String path, Object body) {

        return given()
                .log().method()
                .log().uri()
                .log().body()
                .baseUri(baseURL)
                .contentType(ContentType.JSON)
                .when()
                .body(body)
                .post(path)
                .then()
                .log().body()
                .extract().response();
    }
    public Response delete(String path) {

        return given()
                .log().method()
                .log().uri()
                .log().body()
                .baseUri(baseURL)
                .contentType(ContentType.JSON)
                .when()
                .post(path)
                .then()
                .log().body()
                .extract().response();
    }
    public Response put(String path, Object body) {

        return given()
                .log().method()
                .log().uri()
                .log().body()
                .baseUri(baseURL)
                .contentType(ContentType.JSON)
                .when()
                .body(body)
                .post(path)
                .then()
                .log().body()
                .extract().response();
    }


    public Response get(String path) {

        return given()
                .log().method()
                .log().uri()
                .log().body()
                .baseUri(baseURL)
                .contentType(ContentType.JSON)
                .when()
                .get(path)
                .then()
                .statusCode(200)
                .log().body()
                .extract().response();
    }


    public Response getWithQueryParameters(String path, Map<String, Integer> query) {

        return given()
                .log().method()
                .log().uri()
                .baseUri(baseURL)
                .contentType(ContentType.JSON)
                .when()
                .queryParams(query)
                .get(path)
                .then()
                .log().body()
                .extract().response();
    }

}
