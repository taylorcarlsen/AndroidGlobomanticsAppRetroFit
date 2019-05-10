package com.example.alexr.ideamanager.Services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface MessageService {
    @GET("messages")
    Call<String> getMessages();
    /*Knows to ignore the base URL
    @GET
    Call<String> getMessages(@Url String altUrl);*/
}
