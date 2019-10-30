package com.example.moprologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Profil (View view) {
        Intent intent = new Intent(Main2Activity.this, Profil.class);
        startActivity(intent);
    }
    public void Aplikasiregister (View view) {
        Intent intent = new Intent(Main2Activity.this, aplikasiregister.class);
        startActivity(intent);
    }

}
