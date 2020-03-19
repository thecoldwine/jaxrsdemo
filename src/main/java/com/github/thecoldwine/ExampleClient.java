package com.github.thecoldwine;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

public interface ExampleClient {
    @Path("")
    @GET
    Response invokeApiEndpoint();
}
