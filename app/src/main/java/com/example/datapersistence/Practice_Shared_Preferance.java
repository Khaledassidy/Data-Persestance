package com.example.datapersistence;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Practice_Shared_Preferance extends AppCompatActivity {

    EditText username,pass,birthdate;
    Button save,read;
    SharedPreferences sp;
    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_shared_preferance);
        username=findViewById(R.id.username);
        pass=findViewById(R.id.pass);
        birthdate=findViewById(R.id.birth);
        save=findViewById(R.id.button_practice_save);
        read=findViewById(R.id.button_practice_read);
        sp=getSharedPreferences("data",MODE_PRIVATE);
        edit=sp.edit();





        save.setOnClickListener(v->{
            String name=username.getText().toString();
            String password=pass.getText().toString();
            String birth_date=birthdate.getText().toString();
            edit.putString("name",name);
            edit.putString("pass",password);
            edit.putString("birth",birth_date);
            edit.apply();
        });

        read.setOnClickListener(v->{
            String name=sp.getString("name","error");
            String pass=sp.getString("pass","error");
            String birth=sp.getString("birth","error");
            Toast.makeText(this, name+" "+pass+" "+birth, Toast.LENGTH_SHORT).show();
        });


        //sha8le tenye bade bas yetl3 mn l application kamen y7fzle l data




    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("khaled","destroy");
        String name=username.getText().toString();
        String password=pass.getText().toString();
        String birth_date=birthdate.getText().toString();
        edit.putString("name",name);
        edit.putString("pass",password);
        edit.putString("birth",birth_date);
        edit.apply();

    }
}