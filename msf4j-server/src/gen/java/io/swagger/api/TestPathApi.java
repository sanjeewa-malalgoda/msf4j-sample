package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.api.factories.TestPathApiServiceFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/test-path")


@io.swagger.annotations.Api(description = "the test-path API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2016-12-01T06:36:21.348Z")
public class TestPathApi  {
   private final TestPathApiService delegate = TestPathApiServiceFactory.getTestPathApi();

    @GET
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Echo test-path", response = void.class) })
    public Response testPathIdGet(@ApiParam(value = "ID",required=true) @PathParam("id") String id
)
    throws NotFoundException {
        return delegate.testPathIdGet(id);
    }
}
