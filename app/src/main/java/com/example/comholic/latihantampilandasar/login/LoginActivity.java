package com.example.comholic.latihantampilandasar.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.comholic.latihantampilandasar.R;

import org.w3c.dom.Text;

/**
 * Created by ComHolic on 7/28/2016.
 */
public class LoginActivity extends AppCompatActivity implements LoginView {
    Button buttonExit;
    Button buttonClear;
    TextView textViewUsername;
    EditText textInputUsername;
    TextView textViewEmail;
    EditText textInputEmail;
    TextView textViewPassword;
    EditText textInputPassword;
    Button buttonNotValid;
    Button buttonValid;
    TextView textViewDisplay;

    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_layout_userinput);
    }

    public void init() {
        buttonExit = (Button) findViewById(R.id.buttonExit);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        textViewUsername = (TextView) findViewById(R.id.textViewUsername);
        textInputUsername = (EditText) findViewById(R.id.textInputUsername);

    }

    @Override
    public void setUsernameError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void authentificationLogin() {

    }

}
