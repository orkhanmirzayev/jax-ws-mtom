/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operation.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author orkhan.mirzayev
 */
@Path("mtomport")
public class MtomPort {

    private com.operation.service_client.Mtom port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MtomPort
     */
    public MtomPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method sumNumbers
     * @param one resource URI parameter
     * @param second resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("sumnumbers/")
    public String getSumNumbers(@QueryParam("one")
            @DefaultValue("0") int one, @QueryParam("second")
            @DefaultValue("0") int second) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.sumNumbers(one, second);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method hello
     * @param name resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("hello/")
    public String getHello(@QueryParam("name") String name) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.hello(name);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method uploadFile
     * @param image resource URI parameter
     * @param text resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("uploadfile/")
    public String getUploadFile(@QueryParam("image") byte[] image, @QueryParam("text") String text) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.uploadFile(image, text);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private com.operation.service_client.Mtom getPort() {
        try {
            // Call Web Service Operation
            com.operation.service_client.MtomService service = new com.operation.service_client.MtomService();
            com.operation.service_client.Mtom p = service.getMtomPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
