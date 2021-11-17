import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class myFirstTest {

    @Test
    public void test_FirstTest(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        assertEquals(200, response.getStatusCode());

    }

    @Test
    public void test2_FirstTest(){
                given()
                    .get("https://reqres.in/api/users?page=2").
                then().
                    statusCode(200).
                    body("data.id[0]",equalTo(7));
    }
    @Test
    public void test3_FirstTest(){
        given()
                .get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
                log().
                all();
    }
    @Test
    public void test4_FirstTest(){
        given()
//                .header("Content-type","Application json").
  //              params(paramName, parameValue)

                .get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
                body("data.first_name", hasItems("Michael", "Lindsay"));
    }
}
