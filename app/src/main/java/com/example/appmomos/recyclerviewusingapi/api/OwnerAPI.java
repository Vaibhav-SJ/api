package com.example.appmomos.recyclerviewusingapi.api;

import com.example.appmomos.recyclerviewusingapi.modelClasses.OwnerNameModel;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.mime.TypedInput;

public interface OwnerAPI
{
    @POST("/post_apis/getAllDeliveredOrders")
    void getOwnerNames(@Body TypedInput input, Callback<OwnerNameModel> ownerNameModelCallback);
}
