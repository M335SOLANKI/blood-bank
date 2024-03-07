package com.example.bloodbank.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bloodbank.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText nameEt, cityEt, bloodgroupEt, passwordEt, mobileEt;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regjster);
        nameEt = findViewById(R.id.name);
        cityEt = findViewById(R.id.city);
        bloodgroupEt = findViewById(R.id.blood_group);
        passwordEt = findViewById(R.id.password);
        mobileEt = findViewById(R.id.number);
        submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, city, blood_group,password, mobile;
                name = nameEt.getText().toString();
                city = cityEt.getText().toString();
                blood_group = bloodgroupEt.getText().toString();
                password = passwordEt.getText().toString();
                mobile = mobileEt.getText().toString();
                showMessage(name+"\n"+city+"\n"+blood_group+"\n"+password+"\n"+mobile);
            }
        });
    }

    private void showMessage(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}