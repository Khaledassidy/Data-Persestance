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


//HOUN BADE 2A3ML SAVE B ACTIVITY SHARED_PREFERANCE_RULE_TWO W 2A3ML READ MN SHARED_PREFERANCE_RULE_TWO_FROM_ANOTHER_ACTIVITY
public class SHARED_PREFERANCE_RULE_TWO_FROM_ANOTHER_ACTIVITY extends AppCompatActivity {

    Button read;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferance_rule_two_from_another);
        read=findViewById(R.id.button_3_read);

        //2awl she l file l email howe mawjoud bas bestd3e
        sp=getSharedPreferences("emails",MODE_PRIVATE);



        read.setOnClickListener(v->{
            //2e2ra l data mn class sp de8re directly
            String name=sp.getString("name","error");
            Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();
        });

    }
}