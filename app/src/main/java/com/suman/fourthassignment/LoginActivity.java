package com.suman.fourthassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.suman.fourthassignment.ui.home.HomeFragment;
import com.suman.fourthassignment.ui.home.HomeViewModel;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etname,etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        etname = findViewById(R.id.etname);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etname.getText())){
            etname.setError("Please enter your username");
            etname.requestFocus();
            return;
        }else if (TextUtils.isEmpty(etPassword.getText())){
            etPassword.setError("please enter your password");
            etPassword.requestFocus();
            return;
        }

        String user = etname.getText().toString();
        String pwd = etPassword.getText().toString();

        if (Objects.equals(user,"softwarica") && Objects.equals(pwd, "coventry"))
        {
            Toast.makeText(getApplicationContext(), "Successfully Login",Toast.LENGTH_LONG).show();
            Intent dashboard = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(dashboard);

        }

        else
        {
            Toast.makeText(LoginActivity.this, "Login failed",Toast.LENGTH_LONG).show();
        }

        etname.setText("");
        etPassword.setText("");
        etname.setVisibility(View.VISIBLE);
        etname.setBackgroundColor(Color.RED);
        etPassword.setBackgroundColor(Color.RED);

    }
}
