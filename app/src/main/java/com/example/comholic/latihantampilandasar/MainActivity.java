package com.example.comholic.latihantampilandasar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    String TAG = "SHOW_TOAST";

    private Button buttonAction;
    private EditText textInput1;
    private EditText textInput2;
    private Button buttonList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAction = (Button) findViewById(R.id.buttonAction);
        //buttonList = (Button) findViewById(R.id.buttonList);
        textInput1 = (EditText) findViewById(R.id.textInput1);
        textInput2 = (EditText) findViewById(R.id.textInput2);

        buttonAction.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        int actionId = view.getId();
        switch(actionId)
        {
            case R.id.buttonAction: {
                String tmpInput1 = textInput1.getText().toString();
                String tmpInput2 = textInput2.getText().toString();

                if (isEmpty(tmpInput1))
                    textInput1.setError("Your First Text Empty");

                if (isEmpty(tmpInput2))
                    textInput2.setError("Your Second Text Empty");

                if (isEmpty(tmpInput1) || isEmpty(tmpInput2)) {
                    Toast.makeText(MainActivity.this, "Your Text Empty", Toast.LENGTH_SHORT).show();
                    break;
                }
                Intent intentSender = new Intent(MainActivity.this,MainFinanceActivity.class);
                startActivity(intentSender);
               /* Intent intentSender = new Intent(MainActivity.this,ShowTextActivity.class);
                Bundle bundleSender = new Bundle();
                bundleSender.putStringArray("TEXT_SENDER", new String[]{tmpInput1, tmpInput2});
                intentSender.putExtra("INTENT_SENDER",bundleSender);

                startActivity(intentSender);*/

              //  Intent intentMainFinance = new Intent(MainActivity.this,MainFinanceActivity.class);
            }
            break;

        }
    }

    private boolean isEmpty(String var){
        if(var.isEmpty())
            return true;

        return false;
    }
}
