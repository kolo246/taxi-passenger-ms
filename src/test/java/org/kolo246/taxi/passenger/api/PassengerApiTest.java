package org.kolo246.taxi.passenger.api;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.jboss.resteasy.reactive.RestResponse;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(PassengerApi.class)
public class PassengerApiTest {

    private static final String PASSENGER_ID_TEST = UUID.randomUUID().toString();

    @Test
    public void testResolvePassengerOrders() {
        RestAssured.given()
                .pathParam("passenger-id", PASSENGER_ID_TEST)
                .when().get("{passenger-id}")
                .then()
                .statusCode(RestResponse.StatusCode.OK)
                .body(is(PASSENGER_ID_TEST));
    }

}