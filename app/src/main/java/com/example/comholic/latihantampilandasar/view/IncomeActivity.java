package com.example.comholic.latihantampilandasar.view;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.comholic.latihantampilandasar.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Pleret on 8/20/2016.
 */
public class IncomeActivity extends Activity implements IncomeInteractor  {

    @BindView(R.id.addButton)
    Button addButton;

    @BindView(R.id.addCategoryButton)
    Button addCategoryButton;

    @BindView(R.id.amountNumber)
    EditText amountNumber;

    @BindView(R.id.ExpensesDate)
    EditText ExpensesDate;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_income);
        ButterKnife.bind(this);
    }
}
