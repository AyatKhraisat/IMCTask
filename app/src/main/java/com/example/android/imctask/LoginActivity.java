package com.example.android.imctask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {

    private EditText mUserNameEditText;
    private EditText mPasswordEditText;
    private Button mSignupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUserNameEditText = (EditText) findViewById(R.id.et_user_name);
        mPasswordEditText = (EditText) findViewById(R.id.et_password);

        mSignupButton = (Button) findViewById(R.id.btn_sign_up);
        mSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mUserNameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();
                if (TextUtils.isEmpty(name))

                {
                    mUserNameEditText.setError(getResources().getString(R.string.name_empty_error));

                } else if (TextUtils.isEmpty(password)) {
                    mPasswordEditText.setError(getResources().getString(R.string.password_empty_error));
                } else {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }
}
