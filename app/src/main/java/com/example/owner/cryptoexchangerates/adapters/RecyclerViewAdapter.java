package com.example.owner.cryptoexchangerates.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.owner.cryptoexchangerates.R;
import com.example.owner.cryptoexchangerates.utilities.Currency;

import java.util.List;

/**
 * Created by Owner on 10/14/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    //variables are declared
    private List<Currency> developersProfiles;
    private Context context;

    //an inside class to the custom recycler adapter that extends form the
    //RecyclerView.ViewHolder class, it gets the views required and holds them
    //so the can be used/referenced when needed
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView btc;
        public TextView eth;
        public TextView name;
        public View viewForeground;

        //method that gets the views and sets them
        public MyViewHolder(View view) {
            super(view);
            btc = (TextView) view.findViewById(R.id.BTC);
            eth = (TextView) view.findViewById(R.id.ETH);
            name = (TextView) view.findViewById(R.id.name_of_currency);
            viewForeground = view.findViewById(R.id.view_foreground);
        }
    }

    //public constructor that takes in 2 arguments and sets the context and a list
    public RecyclerViewAdapter(Context context, List<Currency> developersProfiles) {
        this.developersProfiles = developersProfiles;
        this.context = context;
    }

    //this method inflates the layout - custom_recycler_row and returns a view holder object
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_recycler_row, parent, false);
        return new MyViewHolder(itemView);
    }

    //this method sets the appropriate date/values in the views - username and profile image
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Currency a_dev_profile = developersProfiles.get(position);
        holder.btc.setText("BTC :  " + Double.toString(a_dev_profile.getBtc_rate()));
        holder.eth.setText("ETH :  " + Double.toString(a_dev_profile.getEth_rate()));
        holder.name.setText(a_dev_profile.getName());

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/romans.ttf");
        Typeface typeface1 = Typeface.createFromAsset(context.getAssets(), "fonts/taco_bell.ttf");
        holder.btc.setTypeface(typeface);
        holder.eth.setTypeface(typeface);
        holder.name.setTypeface(typeface1);
    }

    //returns the size of the arraylist
    @Override
    public int getItemCount() {
        return developersProfiles.size();
    }

    public void removeItem(int position) {
        developersProfiles.remove(position);
        // notify the item removed by position
        // to perform recycler view delete animations
        // NOTE: don't call notifyDataSetChanged()
        notifyItemRemoved(position);
    }

    public void restoreItem(Currency item, int position) {
        developersProfiles.add(position, item);
        // notify item added by position
        notifyItemInserted(position);
    }

}

