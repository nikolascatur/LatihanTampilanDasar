package com.example.comholic.latihantampilandasar.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.comholic.latihantampilandasar.MainActivity;
import com.example.comholic.latihantampilandasar.R;
import com.example.comholic.latihantampilandasar.view.ExpensesActivity;
import com.example.comholic.latihantampilandasar.view.IncomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ComHolic on 8/3/2016.
 */
public class FragmentMainTab extends Fragment{

    @BindView(R.id.buttonAddExpense)
    Button buttonAddExpense;

    @BindView(R.id.buttonAddIncome)
    Button buttonAddIncome;

    @BindView(R.id.textViewTitle)
    TextView textViewTitle;

    @BindView(R.id.textViewBalance)
    TextView textViewBalance;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @BindView(R.id.progressBar2)
    ProgressBar progressBar2;

    Context context;
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

    }

    public void init() {
       // buttonAddExpense = buttonAddExpense.findViewById();

    }

    public View onCreateView(LayoutInflater inflater, final ViewGroup viewGroup, Bundle savedInstance){
        View view = inflater.inflate(R.layout.fragment_main_tab,viewGroup,false);

        ButterKnife.bind(this,view);

        context = view.getContext();
        buttonAddExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ExpensesActivity.class);
                startActivity(intent);
            }
        });

        buttonAddIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, IncomeActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
