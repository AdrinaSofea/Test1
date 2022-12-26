package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("Sofea") && etPassword.getText().toString().equals("1234")) {
                    Toast.makeText(LoginActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, Display.class);
                    intent.putExtra("USERNAME", etUsername.getText().toString());
                    etUsername.setText("");
                    startActivity(intent);
                } else {
                    showAlertDialogButtonClicked();
                    etUsername.setText("");
                    etPassword.setText("");

                }
            }
        });
    }

    public void showAlertDialogButtonClicked(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Authentication failure");
        builder.setMessage("Username or Password is wrong");
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}