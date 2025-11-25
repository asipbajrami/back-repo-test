package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.dto.Version;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/ping")
public class PingResource {

    @ConfigProperty(name = "app.version")
    String version;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus Ping";
    }


    @GET
    @Path("/version")
    @Produces(MediaType.TEXT_PLAIN)
    public String getVersion() {
        String retVal = "Versione app.version=" + version;
        return retVal;
    }

    @GET
    @Path("/version-json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVersionJson() {
        Version version = new Version(this.version);
        return Response.ok(version).build();
    }

    @GET
    @Path("/version-json-test-2")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVersionJsonTest() {
        Version version = new Version(this.version);
        return Response.ok(version).build();
    }

}
