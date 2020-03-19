package com.github.thecoldwine;

import org.glassfish.jersey.client.proxy.WebResourceFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class Application {
    public static void main(String argv[]) {
        // first approach
        final Client client = ClientBuilder.newClient();

        ExampleClient exampleClient = WebResourceFactory.newResource(ExampleClient.class, client.target("https://google.com"));
        System.out.println(exampleClient.invokeApiEndpoint().getStatus());

        // second approach
        System.out.println(ClientBuilder.newClient().target("https://google.com").request().get().getStatus());
    }
}
