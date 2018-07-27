package com.example.appmomos.recyclerviewusingapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.appmomos.recyclerviewusingapi.adapter.OwnerAdapter;
import com.example.appmomos.recyclerviewusingapi.api.OwnerAPI;
import com.example.appmomos.recyclerviewusingapi.modelClasses.OwnerNameModel;
import com.example.appmomos.recyclerviewusingapi.servicegenerator.ServiceGenerator;


import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;

public class PostApiActivity extends AppCompatActivity
{

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    OwnerAdapter adapter;
    OwnerAPI ownerAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_api);
        ButterKnife.bind(this);

        ownerAPI = ServiceGenerator.createService(OwnerAPI.class);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);

        getItems();
    }


    public  void  getItems()
    {
        final TypedInput input = new TypedByteArray("application/json",RequestJsonBody.getOwnerDetails("20").toString().getBytes());
        ownerAPI.getOwnerNames(input, new Callback<OwnerNameModel>()
        {
            @Override
            public void success(OwnerNameModel ownerNameModel, Response response)
            {
                if (ownerNameModel.isSuccess())
                {
                   adapter = new OwnerAdapter(PostApiActivity.this,ownerNameModel);
                   recyclerView.setAdapter(adapter);
                }
                else
                {
                    Log.d("details","No details");
                }
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }




}
