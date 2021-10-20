package ru.netology;
import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void shouldTestPost() {
        // Given - When - Then

// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("user id") // отправляемые данные (заголовки и query можно выставлять аналогично)

// Выполняемые действия
                .when()
                .post("/post")

// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("user"))
        ;
    }
}
