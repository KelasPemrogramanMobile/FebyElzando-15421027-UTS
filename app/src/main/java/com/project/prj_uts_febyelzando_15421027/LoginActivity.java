package com.project.prj_uts_febyelzando_15421027;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText txtUser, txtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUser = (EditText) findViewById(R.id.un);
        txtPassword = (EditText) findViewById(R.id.ps);
        btnLogin = (Button) findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUser.getText().toString();
                String password = txtPassword.getText().toString();

                if (username.equals("admin") && password.equals("admin12345")) {
                    Intent go = new Intent(LoginActivity.this, MenuUtama.class);
                    go.putExtra("UserName", username);
                    go.putExtra("Password", password);

                    startActivity(go);
                    finish();

                } else {
                    Toast.makeText(LoginActivity.this, "Data Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
