package com.example.appmomos.recyclerviewusingapi.api;

import com.example.appmomos.recyclerviewusingapi.modelClasses.SectorsModel;
import com.squareup.okhttp.Response;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.mime.TypedInput;

public interface HomeApi
{
    @POST("/get_apis/getAllProductSectors")
    void getProductSectors(@Body TypedInput typedInput, Callback<SectorsModel> sectorsModelCallback);
}