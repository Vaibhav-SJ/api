package com.example.appmomos.recyclerviewusingapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.appmomos.recyclerviewusingapi.adapter.SectorsAdapter;
import com.example.appmomos.recyclerviewusingapi.api.HomeApi;
import com.example.appmomos.recyclerviewusingapi.modelClasses.SectorsModel;
import com.example.appmomos.recyclerviewusingapi.servicegenerator.ServiceGenerator;
import com.google.gson.Gson;
import com.squareup.okhttp.Response;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.mime.TypedByteArray;
import retrofit.mime.TypedInput;

public class MainActivity extends AppCompatActivity
{

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    HomeApi homeApi;
    SectorsModel sectorsModel;

    SectorsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        homeApi = ServiceGenerator.createService(HomeApi.class);

        initFun();
    }

    private void initFun()
    {
        LinearLayoutManager ll = new LinearLayoutManager(this);
        ll.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(ll);

        getItems();

    }

    private void getItems()
    {
        TypedInput input = new TypedByteArray("application/json",RequestJsonBody.getSectors().toString().getBytes());
        homeApi.getProductSectors(input, new Callback<SectorsModel>() {
            @Override
            public void success(SectorsModel sectorsModel, retrofit.client.Response response) {
                if (sectorsModel.isSuccess())
                {
                    adapter = new SectorsAdapter(MainActivity.this, sectorsModel);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
