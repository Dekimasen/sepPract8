/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author amos
 */
@Path("webservice")
public class HelloWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloWS
     */
    public HelloWS() {
    }

    /**
     * Retrieves representation of an instance of services.HelloWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
        public String sayHello() {
        //TODO return proper representation object
        return "Hello there!"; 
    }


    /**
     * PUT method for updating or creating an instance of HelloWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
