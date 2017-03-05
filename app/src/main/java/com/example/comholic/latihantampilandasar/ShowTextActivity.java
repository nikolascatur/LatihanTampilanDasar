package com.example.comholic.latihantampilandasar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ComHolic on 7/1/2016.
 */
public class ShowTextActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textShow1;
    private TextView textShow2;
    private Button buttonBack;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);

        textShow1 = (TextView) findViewById(R.id.textShow1);
        textShow2 = (TextView) findViewById(R.id.textShow2);
        buttonBack = (Button) findViewById(R.id.buttonBack);

        Intent intent = getIntent();
        Bundle bundleReceiver = intent.getBundleExtra("INTENT_SENDER");
        String[] tmpText = bundleReceiver.getStringArray("TEXT_SENDER");

        textShow1.setText(tmpText[0]);
        textShow2.setText(tmpText[1]);
        buttonBack.setOnClickListener(ShowTextActivity.this);

    }

    @Override
    public void onClick(View v) {
        int action = v.getId();
        switch (action){
            case R.id.buttonBack:
                ShowTextActivity.this.finish();
                break;
        }
    }
}
