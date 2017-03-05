package com.example.comholic.latihantampilandasar.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.example.comholic.latihantampilandasar.MainFinanceActivity;
import com.example.comholic.latihantampilandasar.R;
import com.example.comholic.latihantampilandasar.adapter.CategorySpinnerAdapter;
import com.example.comholic.latihantampilandasar.model.CategoryModel;
import com.example.comholic.latihantampilandasar.model.ExpensesModel;

import java.sql.SQLOutput;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Pleret on 8/20/2016.
 */
public class ExpensesActivity extends Activity implements ExpensesInteractor {


    @BindView(R.id.addButton)
    Button addButton;

    @BindView(R.id.addCategoryButton)
    Button addCategoryButton;

    @BindView(R.id.amountNumber)
    EditText amountNumber;

    @BindView(R.id.ExpensesDate)
    EditText ExpensesDate;

    @BindView(R.id.repeatSwitch)
    Switch repeatSwitch;

    //@BindView(R.id.categorySpinner);
    Spinner categotySpinner;

    CategorySpinnerAdapter adapter;
    ExpensesModel expensesModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_expenses);
        ButterKnife.bind(this);

        categotySpinner = (Spinner) findViewById(R.id.categorySpinner);

        adapter = new CategorySpinnerAdapter(ExpensesActivity.this,android.R.layout.simple_spinner_item, CategoryModel.newInstance().getName());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categotySpinner.setAdapter(adapter);
        expensesModel = new ExpensesModel();

        addButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                expensesModel.setCategory((String)categotySpinner.getSelectedItem());
                expensesModel.setAmount(Integer.parseInt(amountNumber.getText().toString()));
                expensesModel.setDate(ExpensesDate.getText().toString());
                expensesModel.setRepeadly(repeatSwitch.getText().toString());
                Intent intent = new Intent(ExpensesActivity.this, MainFinanceActivity.class);
                intent.putExtra("EXPENSES",bundle);
                setResult(Activity.RESULT_OK,intent);
            }
        });

        addCategoryButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExpensesActivity.this, AddCategoryActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1){
            if(resultCode == Activity.RESULT_OK){
                String tmp = (String)data.getSerializableExtra("CATEGORY");
                CategoryModel.newInstance().addName(tmp);
                adapter.reefreshItem(CategoryModel.newInstance().getName());
                categotySpinner.setAdapter(adapter);
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  "+tmp);

            }
        }
    }
}









