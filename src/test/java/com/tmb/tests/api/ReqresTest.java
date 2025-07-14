package com.tmb.tests.api;

import com.tmb.api.ReqresApi;
import com.tmb.config.factory.ApiConfigFactory;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class ReqresTest {

    @Test
    void testListUserApi(){
        Response response = ReqresApi.getUsers();
        response.prettyPrint();

    }
}
