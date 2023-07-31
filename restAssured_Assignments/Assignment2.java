package restAssured_Assignments;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class Assignment2 {
    @Test

        public void validate_envt() {

            try {

                putCallTesting("DEV");
                putCallTesting("QA");
                putCallTesting("PROD");


            }

            catch (Exception e) {
                System.out.println(e);
            }

        }

        public void putCallTesting(String Env)
        {
            HashMap<String, String> map =new HashMap<>();
            map.put("DEV","available_DEV");
            map.put("QA","available_QA");
            map.put("PROD","available_PROD");
            String status=map.get(Env);
            System.out.println(status);
            String txt_body="{\n" +
                    " \"id\": 9223372036854295000,\n" +
                    " \"category\": {\n" +
                    " \"id\": 20021,\n" +
                    " \"name\": \"string\"\n" +
                    " },\n" +
                    " \"name\": \"doggie\",\n" +
                    " \"photoUrls\": [\n" +
                    " \"string\"\n" +
                    " ],\n" +
                    " \"tags\": [\n" +
                    " {\n" +
                    " \"id\": 0,\n" +
                    " \"name\": \"string\"\n" +
                    " }\n" +
                    " ],\n" +
                    " \"status\": \""+status+"\"\n" +
                    "}";

            given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .when()
                    .body(txt_body)
                    .put("https://petstore.swagger.io/v2/pet")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .body("category.id", equalTo(20021))
                    .body("status",equalTo(status));

        }


}
