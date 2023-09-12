package com.salvador.Fobinachi_Solution;

import com.salvador.Fobinachi_Solution.fibonachiCalc.FibonachiCalculation;
import com.salvador.Fobinachi_Solution.fibonachiCalc.FibonachiPostDao;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/html" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getExponetial(@QueryParam("index") int index) {
    	int reslut=0;
    	try {
    		/**
    		 * Calls the fobinachi generation functioin
    		 * @Param index as integer to set the value return position
    		 */
    		reslut=FibonachiCalculation.generateFibonachiSeries(index);
    	}catch(Exception e) {
    		//If error is found
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    	
    	//Return the html string to show in the response page
        return "<p>Your result to index: "+index +  " is -> "+reslut+"</><br><a href=\"../\">Regresar</>";
    }
    
    /**
     * Post function consumes json and produces json
     * @param fibCalc
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt(FibonachiPostDao fibCalc) {
    	// Sets the result variable to 0
    	int reslut=0;
    	//Prints the json param to string for debug purposes
    	//TODO remove printline 
    	System.out.println(fibCalc.toString());
    	try {
    		//Gets de index value param to send to fobinachi calculator method
    		int index=fibCalc.getIndexParam();
    		//Gets the calculated fabonachi value response
    		reslut=FibonachiCalculation.generateFibonachiSeries(index);
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    	/**
    	 * Returns as a json response
    	 */
    	return Response.ok("{ \"fobinachi\":"+reslut+"}").build();
    	
    }
    
}
