package com.example.btthuchanh.Android4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btthuchanh.R;

import java.util.Date;

public class Android4Bai2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android4_bai2);

        AlertDialog ad = new AlertDialog.Builder(this).create();
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date t= new Date();
                String msg = "Thời gian hiện hành " + t.toString();
                ad.setMessage(msg);
                ad.show();
            }
        });
    }
}