package com.example.btthuchanh.Android5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.btthuchanh.R;

public class Android5Bai1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android5_bai1);

        EditText edtName = findViewById(R.id.edtName);
        EditText edtEmail = findViewById(R.id.edtEmail);
        EditText edtProj = findViewById(R.id.edtProj);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent getContactInfo = new Intent(getApplicationContext(), ContactInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", edtName.getText().toString());
                bundle.putString("email", edtEmail.getText().toString());
                bundle.putString("project", edtProj.getText().toString());

                getContactInfo.putExtras(bundle);
                startActivity(getContactInfo);
            }
        });
    }
}