package REST_API;

import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.containsString;

public class educ {

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

}
