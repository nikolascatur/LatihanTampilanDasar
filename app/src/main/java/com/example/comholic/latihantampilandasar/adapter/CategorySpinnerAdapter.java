package com.example.comholic.latihantampilandasar.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.comholic.latihantampilandasar.R;

import java.util.ArrayList;


/**
 * Created by Pleret on 9/24/2016.
 */

public class CategorySpinnerAdapter extends ArrayAdapter {

    Activity mContext;
    ArrayList<String> data;
    public CategorySpinnerAdapter(Activity context, int resource, ArrayList<String> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.data = objects;
    }

    public void reefreshItem(ArrayList<String> data){
        this.data = data;

    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View root = convertView;
        if(root == null){
            LayoutInflater inflater = mContext.getLayoutInflater();
            root = inflater.inflate(R.layout.spinner_view,parent,false);
        }

        String item = data.get(position);
        if(data != null){
            TextView text1= (TextView) root.findViewById(R.id.text1);
            text1.setText(item);
        }

        return root;
    }
}
