package com.example.owner.cryptoexchangerates.api;

import com.example.owner.cryptoexchangerates.constants.Url;
import com.example.owner.cryptoexchangerates.utilities.CurrencyExchange;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Owner on 10/16/2017.
 */

public interface Service {
    //Service interface required to define the end points.
    @GET(Url.SEARCH_URL_ETH)
    Call<CurrencyExchange> loadCurrencyExchange();
}
