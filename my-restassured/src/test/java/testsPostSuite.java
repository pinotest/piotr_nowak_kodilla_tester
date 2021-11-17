import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.simple.JSONObject;
import org.junit.experimental.theories.DataPoints;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class testsPostSuite {
    @Test
    public void test1_forPost(){
 /*       Map<String, Object> map = new HashMap<>();
        map.put("name","Peter");
        map.put("job","tester");
      */ // System.out.println(map);

  //      JSONPObject request  = new JSONPObject();
  //      System.out.println(request);
            JSONObject req = new JSONObject();
            req.put("name", "Peter");
            req.put("job","tester");

        System.out.println(req);
        System.out.println(req.toJSONString());

        given().
            body(req.toJSONString()).
        when().
            post("https://reqres.in/api/users").
        then().
            statusCode(201).log().all();

    }
    @Test
    public void test2_forDelete(){
        given().
                when().
                delete("https://reqres.in/api/users?page=2").
                then().
                statusCode(204).log().all();

    }
    @Test //(dataProvider = "")
    public void test3_dataDriven(String name, String job){
        baseURI = ("https://reqres.in/");
        JSONObject req = new JSONObject();
        req.put("name", name);
        req.put("job",job);

        System.out.println(req);
        System.out.println(req.toJSONString());

        given().
                body(req.toJSONString()).
                when().
                post("api/users").
                then().
                statusCode(201).log().all();

    }
    //@DataProvider(name = "aaa") in tesnng
    @Parameterized.Parameters
    public Object[][] dataForPost(){
        Object[][] testData = new Object[2][2];
        testData[0][0] = "Peter";
        testData[0][1] = "tester";

        testData[1][0] = "John";
        testData[1][1] = "master";
        return testData;

    }
}
