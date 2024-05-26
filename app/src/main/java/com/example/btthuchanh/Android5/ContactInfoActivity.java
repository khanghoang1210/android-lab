package com.example.btthuchanh.Android5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.btthuchanh.R;

public class ContactInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        TextView edtName = findViewById(R.id.edtName);
        TextView edtEmail = findViewById(R.id.edtEmail);
        TextView edtProj = findViewById(R.id.edtProj);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String email = bundle.getString("email");
        String project = bundle.getString("project");
        edtName.setText(name);
        edtEmail.setText(email);
        edtProj.setText(project);
    }
}