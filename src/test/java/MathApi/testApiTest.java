package MathApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.io.File;
import java.util.Random;

import io.restassured.response.Response;
import org.hamcrest.Matchers;

import org.json.JSONObject;
import org.junit.*;

import static io.restassured.RestAssured.*;

//    File file = new File("C:\\Users\\gkazarkin\\Downloads\\Auto\\Json\\test1.json");
//    String content = null;

//    protected ExtractableResponse postRequest(String requestPayload, String endpoint, int expectedStatus){
//        return
//                given().
//                        auth().basic("login", "password").
//                        cookies("sessionId", session).
//                        contentType(ContentType.JSON).
//                        body(requestPayload).
//                        relaxedHTTPSValidation().
//                        when().
//                        post(endpoint).
//                        then().
//                        statusCode(expectedStatus).
//                        body(containsString("www")).
//                        extract();
//
//        Блок given описывает предусловия, такие как авторизация и параметры запроса. Обратите внимание: отдельно можно провести
//        базовую http-авторизацию (auth().basic(«login», «password»)) и пользовательскую авторизацию, передав нужные куки
//        (cookies(«sessionId», session)). Очень удобно использовать опцию relaxedHTTPSValidation(), чтобы избежать хлопот
//        с подтверждением сертификатов.
//        Блок when() описывает требуемое действие – запрос какого типа и на какой адрес следует отправить.
//        Блок then() включает проверки, которые необходимо произвести (их может быть несколько одновременно).
//
//        Например, вы можете проверить, соответствует ли статус ответа ожидаемому (statusCode(expectedStatus)) и содержит ли тело ответа
//        определенный фрагмент текста (body(containsString(«www»))). Команда extract() позволяет получить ответ и использовать его,
//        например, для извлечения определенных значений.

//        ExtractableResponse response = postRequest(session, payload, endpoint, 200);
//        int numberOfResults = response.path("results.total");
//
//        Здесь команда path(«results.total») позволяет извлечь значение, используя JsonPath

public class testApiTest {

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
    public void testResponseCodeTest() {
        Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22");
        int  code=resp.getStatusCode();
        System.out.println("Status code is " + code);
        Assert.assertEquals(code, 200);
    }

    @Test
    public void testGetTimeTest() {
        Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22");
        String  data=resp.asString();
        System.out.println("Status is " + data);
        System.out.println("Response time " + resp.getTime());
    }

    @Test
    //Get через логин и пароль
    public void testGetWithAuthTest() throws Exception {
             given().auth().preemptive().basic("mail.for.testbase@yandex.ru", "DtOicrRY5u42GABqagFB1BCB")
                     .baseUri("https://testbase.atlassian.net/rest/api").basePath("/3/issue/14962")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().get()
                .then().statusCode(404)
//                .body("id",equalTo("14962"))
//                .body("key", equalTo("TEST-1215"))
                .extract()
                .response()
                .prettyPrint();
    }

    @Ignore
    @Test
    //Если простые, ключ:значение
    public void testSimplePostTest() {
        JSONObject jsonObj = new JSONObject()
                .put("email_owner","manager@mail.ru")
                .put("task_id","2233")
                .put("task_id", "2234")
                .put("hours", "10")
                .put("minutes", "10")
                .put("month", "10")
                .put("days", "10")
                .put("day_weeks", "5");

        given()
//                .param("username", "simpleUserName")
//                .param("password", "pa$$w0rd")
                .header("Authorization", "Bearer  DtOicrRY5u42GABqagFB1BCB")
                .baseUri("http://users.bugred.ru/tasks/rest").basePath("/AddTaskInCron")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().log().body().body(jsonObj.toString()).post()
                .then().log().body().statusCode(200)
                .body("type", Matchers.equalTo("success"))
                .body("message", Matchers.equalTo("Расписание успешно добавлено в задачу 2234 Следущая дата запуска 10.10.2025 10:10"));
    }

    @Test
    public void testPostFileTest() throws Exception {
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

    @Ignore
    @Test
    public void testPostTest() throws Exception {
        Random rnd = new Random(System.currentTimeMillis());
        int number = 12 + rnd.nextInt(1000 - 12 + 1);

        JSONObject jsonObj = new JSONObject()
                .put("email","qq" +number+ "@gmail.com")
                .put("name","qq" +number+ "")
                .put("password", "2234");

        given().header("Authorization", "Bearer  DtOicrRY5u42GABqagFB1BCB")
                .baseUri("http://users.bugred.ru/tasks/rest").basePath("/doregister")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().body(jsonObj.toString()).post()
                .then().log().body().statusCode(200)
                .body("name", Matchers.equalTo("qq" +number+ ""))
                .body("email", Matchers.equalTo("qq" +number+ "@gmail.com"))
                .body("avatar", Matchers.equalTo("http://users.bugred.ru//tmp/default_avatar.jpg"));
    }
}

//Matchers.hasItem (коллекции)
//hasItemInArray
//notNullValue
//equalToIgnoringCase
//equalToIgnoringWhiteSpace
//containsString, endsWith, startsWith