package io.swagger.api.factories;

import io.swagger.api.TestPathApiService;
import io.swagger.api.impl.TestPathApiServiceImpl;

public class TestPathApiServiceFactory {
    private final static TestPathApiService service = new TestPathApiServiceImpl();

    public static TestPathApiService getTestPathApi() {
        return service;
    }
}
