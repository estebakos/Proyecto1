package com.salidas.proyecto1.controller.main.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.salidas.proyecto1.R;
import com.salidas.proyecto1.model.Country;

import java.util.List;

/**
 * Created by estebanmarinbetancur on 9/06/16.
 */
public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.ViewHolder> {
    private List<Country> countryList;
    private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView ivShield;
        public TextView tvCountryName, tvCountryCode;

        public ViewHolder(View v) {
            super(v);
            tvCountryCode = (TextView) v.findViewById(R.id.tvCountryCode);
            tvCountryName = (TextView) v.findViewById(R.id.tvCountryName);
            ivShield = (ImageView) v.findViewById(R.id.ivShield);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CountriesAdapter(List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CountriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                          int viewType) {
        // createOrUpdate a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_country_item, parent, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        final Country country = countryList.get(position);
        holder.tvCountryName.setText(country.getCountry());
        holder.tvCountryCode.setText(country.getCode());
        Glide.with(context).load(country.getShield()).into(holder.ivShield);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return countryList.size();
    }

}