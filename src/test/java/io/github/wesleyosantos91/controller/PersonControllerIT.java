package io.github.wesleyosantos91.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class PersonControllerIT {


    @Test
    @DisplayName("Deve validar se o response está integra com contrato da API")
    void getInsurancePerson() {

        Map<String,Object> headerMap = new HashMap<>();
        headerMap.put("Authorization", "string");
        headerMap.put("x-fapi-auth-date", "string");
        headerMap.put("x-fapi-customer-ip-address", "string");
        headerMap.put("x-fapi-interaction-id", "string");
        headerMap.put("x-customer-user-agent", "string");

        given()
                .headers(headerMap)
                .when().get("/insurance-person")
                .then()
                .statusCode(501)
                .body(matchesJsonSchemaInClasspath("schemas/ResponseInsurancePerson.json"));
    }

}