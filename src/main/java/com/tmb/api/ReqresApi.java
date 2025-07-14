package com.tmb.api;

import com.tmb.config.factory.ApiConfigFactory;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public final class ReqresApi {

    private ReqresApi(){}

    private static final String BASE_URL = ApiConfigFactory.getConfig().apiBaseUrl();
    private static final String LIST_USERS_ENDPOINT = ApiConfigFactory.getConfig().listUserEndPoint();

    public static Response getUsers(){

       return  RestAssured.given()
                .queryParam("page", 2)
                .baseUri(BASE_URL)
                .get(LIST_USERS_ENDPOINT);

    }
}
