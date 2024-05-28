package org.kolo246.taxi.passenger.api;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.jboss.resteasy.reactive.RestPath;

@Path(value = "/passengers")
public class PassengerApi {

    @GET
    @Path(value = "/{passenger-id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPassengerOrderHistory(
            @RestPath(value = "passenger-id") final String id
    ) {
        return Response.ok(id).status(Response.Status.OK).build();
    }

    @POST
    @Path(value = "/order-taxi")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response orderTaxi(
            @RequestBody final PassengerOrderTaxiDTO passengerOrderTaxiDTO) {
        return Response.ok(passengerOrderTaxiDTO).status(Response.Status.OK).build();
    }

}
