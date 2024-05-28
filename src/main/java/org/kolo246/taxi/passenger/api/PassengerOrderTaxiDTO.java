package org.kolo246.taxi.passenger.api;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalTime;

public record PassengerOrderTaxiDTO(
        String passengerId,
        String fromAddress,
        String destinationAddress,
        @JsonIgnore
        LocalTime orderTimestamp
) {
}
