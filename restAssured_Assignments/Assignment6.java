package restAssured_Assignments;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

public class Assignment6 {
        @Test
        public void testLogoutUser() {
            RestAssured.baseURI = "https://petstore.swagger.io";
            RestAssured.given()
                    .when()
                    .get("/v2/user/logout")
                    .then()
                    .assertThat()
                    .body("code", equalTo(200))
                    .body("message", equalTo("ok"));

        }

    }


