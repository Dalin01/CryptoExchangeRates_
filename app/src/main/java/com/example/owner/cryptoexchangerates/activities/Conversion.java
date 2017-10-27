package com.example.owner.cryptoexchangerates.activities;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.owner.cryptoexchangerates.R;

public class Conversion extends AppCompatActivity {

    //variables are declared
    String currency_name;
    String eth_rate;
    String btc_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        initViews();
        setRates();
        setFlags();
    }

    private void initViews() {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/twinmarker.ttf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/petbone.ttf");
        Typeface typeface3 = Typeface.createFromAsset(getAssets(), "fonts/taco_bell.ttf");


        TextView my_rates = (TextView) findViewById(R.id.my_rates);
        TextView my_heading = (TextView) findViewById(R.id.crypto);
        TextView btc = (TextView) findViewById(R.id.btc);
        TextView eth = (TextView) findViewById(R.id.eth);
        TextView btc_to = (TextView) findViewById(R.id.btc_to);
        TextView eth_to = (TextView) findViewById(R.id.eth_to);

        my_rates.setTypeface(typeface3);
        btc_to.setTypeface(typeface3);
        eth_to.setTypeface(typeface3);
        my_heading.setTypeface(typeface1);
        btc.setTypeface(typeface);
        eth.setTypeface(typeface);

    }

    private void setRates() {
        //get the extra that was passed along with the intent from the MainActivity
        Bundle extras = getIntent().getExtras();
        currency_name = extras.getString("currency_name");
        eth_rate = extras.getString("ETH_rate");
        btc_rate = extras.getString("BTC_rate");

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/roboto_regular.otf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/romans.ttf");

        TextView my_currency = (TextView) findViewById(R.id.currency);
        my_currency.setText(currency_name);
        my_currency.setTypeface(typeface);

        TextView btc_rates = (TextView) findViewById(R.id.btc_rates);
        btc_rates.setText(btc_rate);
        btc_rates.setTypeface(typeface1);

        TextView eth_rates = (TextView) findViewById(R.id.eth_rates);
        eth_rates.setText(eth_rate);
        eth_rates.setTypeface(typeface1);
    }

    private void setFlags() {
        ImageView country_image = (ImageView) findViewById(R.id.countryImage);
        switch (currency_name) {
            default:
                country_image.setImageResource(R.drawable.cryp_img);
                break;
            case "BTC":
                country_image.setImageResource(R.drawable.cryp_img);
                break;
            case "NGN":
                country_image.setImageResource(R.drawable.ngn);
                break;
            case "USD":
                country_image.setImageResource(R.drawable.usa);
                break;
            case "EUR":
                country_image.setImageResource(R.drawable.eur);
                break;
            case "AUD":
                country_image.setImageResource(R.drawable.aud);
                break;
            case "CAD":
                country_image.setImageResource(R.drawable.cad);
                break;
            case "GHS":
                country_image.setImageResource(R.drawable.ghs);
                break;
            case "HKD":
                country_image.setImageResource(R.drawable.hkd);
                break;
            case "INR":
                country_image.setImageResource(R.drawable.inr);
                break;
            case "JMD":
                country_image.setImageResource(R.drawable.jmd);
                break;
            case "JPY":
                country_image.setImageResource(R.drawable.jpn);
                break;
            case "KRW":
                country_image.setImageResource(R.drawable.skf);
                break;
            case "MXN":
                country_image.setImageResource(R.drawable.mexico);
                break;
            case "NAD":
                country_image.setImageResource(R.drawable.namibia);
                break;
            case "SGD":
                country_image.setImageResource(R.drawable.singa);
                break;
            case "ZAR":
                country_image.setImageResource(R.drawable.saf);
                break;
            case "TWD":
                country_image.setImageResource(R.drawable.taiwan);
                break;
            case "GBP":
                country_image.setImageResource(R.drawable.britain);
                break;
            case "LKR":
                country_image.setImageResource(R.drawable.lankan);
                break;
            case "CHF":
                country_image.setImageResource(R.drawable.wiss);
                break;
        }
    }

    public void submit(View view) {

        EditText amount = (EditText) findViewById(R.id.amount);
        String my_amount = amount.getText().toString();

        TextView btc_amount = (TextView) findViewById(R.id.btc_amount);
        TextView eth_amount = (TextView) findViewById(R.id.eth_amount);

        btc_amount.setText(Double.toString(Double.parseDouble(btc_rate) *
                Double.parseDouble(my_amount)));
        eth_amount.setText(Double.toString(Double.parseDouble(eth_rate) *
                Double.parseDouble(my_amount)));

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/cooter_candy.ttf");
        btc_amount.setTypeface(typeface);
        eth_amount.setTypeface(typeface);
    }

}
