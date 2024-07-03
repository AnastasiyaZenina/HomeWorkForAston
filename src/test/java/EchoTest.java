

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;


public class EchoTest {
    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    public void testGetRequest() {
        given()
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("url", equalTo("https://postman-echo.com/get"));
    }

    @Test
    public void testPostRequest1() {
        String requestBody = "test=value";
        given().log().body()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void testPostRequest2() {
        given().log().body()
                .header("content-type", "application/json")
                .body("{\"foo1\":\"bar1\", \"foo2\":\"bar2\"}")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("url", equalTo("https://postman-echo.com/post"));

    }

    @Test
    public void testPutRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";
        given().log().body()
                .body(requestBody)
                .header("content-type", "text/plain")
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/put"));

    }

    @Test
    public void testPatchRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";
        given().log().body()
                .body(requestBody)
                .header("Content-Type", "text/plain")
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .body("headers.host", equalTo("postman-echo.com")) // Проверка заголовков
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/patch"));

    }

    @Test
    public void testDeleteRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";
        given().log().body()
                .body(requestBody)
                .header("Content-Type", "text/plain")
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody)) //
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/delete"));
    }

}






