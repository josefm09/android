package com.example.josec.aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private AutoCompleteTextView tv_email;
    private TextView tv_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        tv_email = (AutoCompleteTextView) findViewById(R.id.tv_email);
        tv_pass = (EditText) findViewById(R.id.tv_pass);

    }

    public void login(View View){
        String email = tv_email.getText().toString();
        String pass = tv_pass.getText().toString();
        if(email.equals("jose@hotmail.com") && pass.equals("jose")) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
    }
}
