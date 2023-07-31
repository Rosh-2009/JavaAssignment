package restAssured_Assignments;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Assignment3 {



        @Test
        public void testGetUserDetails() {
            RestAssured.baseURI = "https://petstore.swagger.io";

            given()
                    .when()
                    .get("v2/user/Uname001")
                    .then()
                    .assertThat()
                    //.statusCode(200)
                    .body("username", equalTo("Uname001"))
                    .body("email", equalTo("Positive@Attitude.com"))
                    .body("userStatus", equalTo(1));
        }
    }

