package com.example.datapersistence;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SHARED_PREFERANCE_RULE_THRE_FROM_ANOTHER_ACTIVITY extends AppCompatActivity {

    SharedPreferences sp;
    Button read;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferance_rule_thre_from_another);
        read=findViewById(R.id.button_read_another_activity);

        sp=getPreferences(MODE_PRIVATE);


//        rou7na 3ala hay l activity w jarbna ne2ra 3atana eno error l2no keen 3am yjareb ye2ra mn l file le 5as bel activity ta3elo le howe fade ma fe b2albo she l2no getpersistance bas bejbelk l file le 5as bel activity ta3elo ma berh3lk file 5aso b activity tenye

        read.setOnClickListener(v->{
            //2e2ra l data mn class sp de8re directly
            String name=sp.getString("name","error");

                Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();





        });
    }
}