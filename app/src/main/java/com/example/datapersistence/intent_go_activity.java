package com.example.datapersistence;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class intent_go_activity extends AppCompatActivity {

    Button intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_go);
        intent=findViewById(R.id.button_intent);
        intent.setOnClickListener(v->{
            Intent intent1=new Intent(getApplicationContext(), Practice_Shared_Preferance.class);
            startActivity(intent1);
            finish();
        });

    }
}