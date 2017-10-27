package com.example.owner.cryptoexchangerates.utilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DARLINGTON on 8/22/2017.
 */

public class CurrencyExchange {


    private RatesEntities ETH;
    private RatesEntities BTC;

    public List<Currency> getCurrencyList() {
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("ETH", ETH.getETH(), BTC.getETH()));
        currencyList.add(new Currency("NGN", ETH.getNGN(), BTC.getNGN()));
        currencyList.add(new Currency("BTC", ETH.getBTC(), BTC.getBTC()));
        currencyList.add(new Currency("USD", ETH.getUSD(), BTC.getUSD()));
        currencyList.add(new Currency("EUR", ETH.getEUR(), BTC.getEUR()));
        currencyList.add(new Currency("AUD", ETH.getAUD(), BTC.getAUD()));
        currencyList.add(new Currency("CAD", ETH.getCAD(), BTC.getCAD()));
        currencyList.add(new Currency("GHS", ETH.getGHS(), BTC.getGHS()));
        currencyList.add(new Currency("HKD", ETH.getHKD(), BTC.getHKD()));
        currencyList.add(new Currency("INR", ETH.getINR(), BTC.getINR()));
        currencyList.add(new Currency("JMD", ETH.getJMD(), BTC.getJMD()));
        currencyList.add(new Currency("JPY", ETH.getJPY(), BTC.getJPY()));
        currencyList.add(new Currency("KRW", ETH.getKRW(), BTC.getKRW()));
        currencyList.add(new Currency("MXN", ETH.getMXN(), BTC.getMXN()));
        currencyList.add(new Currency("NAD", ETH.getNAD(), BTC.getNAD()));
        currencyList.add(new Currency("SGD", ETH.getSGD(), BTC.getSGD()));
        currencyList.add(new Currency("ZAR", ETH.getZAR(), BTC.getZAR()));
        currencyList.add(new Currency("TWD", ETH.getTWD(), BTC.getTWD()));
        currencyList.add(new Currency("GBP", ETH.getGBP(), BTC.getGBP()));
        currencyList.add(new Currency("LKR", ETH.getLKR(), BTC.getLKR()));
        currencyList.add(new Currency("CHF", ETH.getCHF(), BTC.getCHF()));

        return currencyList;
    }

    public RatesEntities getETH() {
        return ETH;
    }

    public void setETH(RatesEntities ETH) {
        this.ETH = ETH;
    }

    public static class RatesEntities {

        private double ETH;
        private double NGN;
        private double BTC;
        private double USD;
        private double EUR;
        private double AUD;
        private double CAD;
        private double GHS;
        private double HKD;
        private double INR;
        private double JMD;
        private double JPY;
        private double KRW;
        private double MXN;
        private double NAD;
        private double SGD;
        private double ZAR;
        private double TWD;
        private double GBP;
        private double LKR;
        private double CHF;

        public double getETH() {
            return ETH;
        }


        public double getNGN() {
            return NGN;
        }


        public double getBTC() {
            return BTC;
        }

        public double getUSD() {
            return USD;
        }


        public double getEUR() {
            return EUR;
        }


        public double getAUD() {
            return AUD;
        }


        public double getCAD() {
            return CAD;
        }


        public double getGHS() {
            return GHS;
        }


        public double getHKD() {
            return HKD;
        }


        public double getINR() {
            return INR;
        }


        public double getJMD() {
            return JMD;
        }


        public double getJPY() {
            return JPY;
        }


        public double getKRW() {
            return KRW;
        }


        public double getMXN() {
            return MXN;
        }


        public double getNAD() {
            return NAD;
        }

        public double getSGD() {
            return SGD;
        }


        public double getZAR() {
            return ZAR;
        }


        public double getTWD() {
            return TWD;
        }


        public double getGBP() {
            return GBP;
        }


        public double getLKR() {
            return LKR;
        }


        public double getCHF() {
            return CHF;
        }

    }


}