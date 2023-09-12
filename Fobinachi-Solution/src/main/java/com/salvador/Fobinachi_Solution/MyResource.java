package com.salvador.Fobinachi_Solution;

import com.salvador.Fobinachi_Solution.fibonachiCalc.FibonachiCalculation;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getExponetial(@QueryParam("index") int index) {
    	
    	try {
    		
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    	int reslut=FibonachiCalculation.generateFibonachiSeries(index);

        return "<p>Your result to index: "+index +  " is -> "+reslut+"</><br><a href=\"../\">Regresar</>";
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt(FibonachiCalculation fibCalc) {
try {
	fibCalc.getIndex();
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    	int reslut=FibonachiCalculation.generateFibonachiSeries(index);
    }
}
