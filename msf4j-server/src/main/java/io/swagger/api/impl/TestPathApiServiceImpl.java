package io.swagger.api.impl;

import io.swagger.api.NotFoundException;
import io.swagger.api.TestPathApiService;
import org.apache.commons.pool.BasePoolableObjectFactory;
import org.apache.commons.pool.impl.StackObjectPool;

import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status;
import static javax.ws.rs.core.Response.status;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaMSF4JServerCodegen", date = "2016-12-01T06:36:21.348Z")
public class TestPathApiServiceImpl extends TestPathApiService {


    private StackObjectPool objectPool = new StackObjectPool(new BasePoolableObjectFactory() {
        @Override
        public TestObject makeObject() throws Exception {
            return new TestObject(true);
        }
    }, 2, 2);

    @Override
    public Response testPathIdGet(String id) throws NotFoundException {
        String data = "";
        try {
            TestObject o = (TestObject) objectPool.borrowObject();
            data = o.getData();
            objectPool.returnObject(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status(Status.OK).entity(data).build();
    }
}
