package com.example.fruzzia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button button1;
    String getUsername, getPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ed1 = (EditText) findViewById(R.id.username);
        ed2 = (EditText) findViewById(R.id.password);
        button1 = (Button) findViewById(R.id.loginbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getUsername= ed1.getText().toString();
                getPassword = ed2.getText().toString();
                Toast.makeText(getApplicationContext(), getUsername, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), getPassword, Toast.LENGTH_LONG).show();
                if (getUsername.equals("fds") && getPassword.equals("1234")) {
                    Intent intent = new Intent(getApplicationContext(), AdminUser.class);
                    startActivity(intent);
                }
                else
                {

                    Intent intent = new Intent(getApplicationContext(), AddCustomer.class);
                    startActivity(intent);

                }
            }
        });
    }
}



