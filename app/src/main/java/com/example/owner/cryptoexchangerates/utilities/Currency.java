package com.example.owner.cryptoexchangerates.utilities;

/**
 * Created by Owner on 10/20/2017.
 */

public class Currency {

    private String name;
    private double eth_rate;
    private double btc_rate;

    public Currency(String name, double eth_rate, double btc_rate) {
        this.name = name;
        this.eth_rate = eth_rate;
        this.btc_rate = btc_rate;
    }

    public String getName() {
        return name;
    }

    public double getEth_rate() {
        return eth_rate;
    }


    public double getBtc_rate() {
        return btc_rate;
    }

}
