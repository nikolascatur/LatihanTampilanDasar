package com.example.comholic.latihantampilandasar.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.comholic.latihantampilandasar.MainFinanceActivity;
import com.example.comholic.latihantampilandasar.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Pleret on 8/31/2016.
 */
public class AddCategoryActivity extends Activity {

    @BindView(R.id.textCategory)
    EditText textCategory;

    @BindView(R.id.buttonAdd)
    Button buttonAdd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);
        ButterKnife.bind(AddCategoryActivity.this);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenSender = new Intent(AddCategoryActivity.this, MainFinanceActivity.class);
                intenSender.putExtra("CATEGORY",textCategory.getText());

                setResult(Activity.RESULT_OK,intenSender);

                finish();
            }
        });
    }


}
