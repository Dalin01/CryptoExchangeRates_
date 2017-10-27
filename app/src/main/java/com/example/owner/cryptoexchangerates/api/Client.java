package com.example.owner.cryptoexchangerates.api;

import com.example.owner.cryptoexchangerates.constants.Url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Owner on 10/16/2017.
 */

public class Client {
    //Variable is declared and initialized.
    private static Retrofit retrofit = null;

    //The get client method that returns a retrofit obj is created
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Url.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
