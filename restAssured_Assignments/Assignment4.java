package restAssured_Assignments;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

public class Assignment4 {
    @Test
    public void do_Authentication_Validation_Ass_004() {

        try {


            given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .auth().basic("Uname001", "@tt!tude")
                    .when()
                    .get("https://petstore.swagger.io/v2/user/login")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .body("$", hasKey("code"))
                    .body("$", hasKey("message"))
                    .body("code", equalTo(200));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
