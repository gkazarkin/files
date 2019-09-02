package REST_API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.io.File;

import org.hamcrest.Matchers;
import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class testsApi {

    private String usersUrl = "http://users.bugred.ru/tasks/rest/";

    @Before
    public void setUp() {
        RestAssured.authentication = basic("mail.for.testbase@yandex.ru","DtOicrRY5u42GABqagFB1BCB");
    }

    @After
    public void down() {
        RestAssured.reset();
    }

    @Test
    //Get через логин и пароль
    public void testGetWithAuth() throws Exception {
             given().auth().preemptive().basic("mail.for.testbase@yandex.ru", "DtOicrRY5u42GABqagFB1BCB")
                     .baseUri("https://testbase.atlassian.net/rest/api").basePath("/3/issue/14962")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().get()
                .then().statusCode(200)
                .body("id",equalTo("14962"))
                .body("key", equalTo("TEST-1215"))
                .extract()
                .response()
                .prettyPrint();
    }

    @Test
    //Если простые, ключ:значение
    public void testSimplePost() {
        JSONObject jsonObj = new JSONObject()
                .put("email_owner","manager@mail.ru")
                .put("task_id","2233")
                .put("task_id", "2234")
                .put("hours", "10")
                .put("minutes", "10")
                .put("month", "10")
                .put("days", "10")
                .put("day_weeks", "5");

        given().header("Authorization", "Bearer  DtOicrRY5u42GABqagFB1BCB")
                .baseUri("http://users.bugred.ru/tasks/rest").basePath("/AddTaskInCron")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().log().body().body(jsonObj.toString()).post()
                .then().log().body().statusCode(200)
                .body("type", Matchers.equalTo("success"))
                .body("message", Matchers.equalTo("Расписание успешно добавлено в задачу 2234 Следущая дата запуска 10.10.2025 10:10"));
    }

    @Test
    public void testPostFile() throws Exception {
        File file = new File("C:\\Users\\gkazarkin\\Downloads\\Auto\\Json\\test2.json");
        String content = null;

        given().header("Authorization", "Bearer  DtOicrRY5u42GABqagFB1BCB")
                .baseUri("https://reqres.in/api").basePath("users/2")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().body(file).post()
                .then().log().body().statusCode(201)
                .body("name", Matchers.equalTo("morpheus"))
                .body("job", Matchers.hasItem("zion resident"))
                .body("job", Matchers.hasItem("zion resident2"));
    }

    @Test
    public void testPost() throws Exception {
        String a = "9";
        JSONObject jsonObj = new JSONObject()
                .put("email","qq" +a+ "@gmail.com")
                .put("name","qq" +a+ "")
                .put("password", "2234");

        given().header("Authorization", "Bearer  DtOicrRY5u42GABqagFB1BCB")
                .baseUri("http://users.bugred.ru/tasks/rest").basePath("/doregister")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().body(jsonObj.toString()).post()
                .then().log().body().statusCode(200)
                .body("name", Matchers.equalTo("qq" +a+ ""))
                .body("email", Matchers.equalTo("qq" +a+ "@gmail.com"))
                .body("avatar", Matchers.equalTo("http://users.bugred.ru//tmp/default_avatar.jpg"));
    }


}

//Matchers.hasItem (коллекции)
//hasItemInArray
//notNullValue
//equalToIgnoringCase
//equalToIgnoringWhiteSpace
//containsString, endsWith, startsWith