package io.github.wannabeestrange.threeblueonegreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText editEmail;
    private EditText editUsername;
    private EditText editPassword;
    private Button signIn;
    private Button register;
    private Button resetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // initialization
        editEmail = findViewById(R.id.edit_email);

        editUsername = findViewById(R.id.edit_username);

        editPassword = findViewById(R.id.edit_password);

        signIn = findViewById(R.id.button_sign_in);
        signIn.setOnClickListener(this::onClickLogin);

        register = findViewById(R.id.button_register);
        register.setOnClickListener(this::onClickRegister);

        resetPassword = findViewById(R.id.button_reset_password);
        resetPassword.setOnClickListener(this::onResetPassword);
    }
    private void onClickRegister(View v) {

    }
    private void onClickLogin(View v) {

    }
    private void onResetPassword(View v) {

    }
}