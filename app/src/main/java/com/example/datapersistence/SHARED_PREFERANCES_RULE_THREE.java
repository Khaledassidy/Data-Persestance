package com.example.datapersistence;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/*
TARE2A TELTE:
tare2a telte heye getPreferences()
getPreferences():heye bas bte5od l mode
tyeb sho esm l mode 2alak hay tare2a btrje3lk shared preferances le 5as bas bel activity le enta feha ya3ne le bet5zno 2aw bte2ra bas mote7 3ala mostawa l activity le enta katbt feha l shared preferances mesh mote7 3ala mostawa activity tenye 2aw application tene
ya3ne ma feek te2ra 2aw t3del mn activity tenye fa 3ashn heek 3mlo bala esm
aye activity tenye ma btesma7 bel mosol la heda l file bas btesma7 lal activity le enta feha

fa l far2 ben tare2ten le mar2o eno l file bhwdek l toro2 m3amamen 3ala kel l application ama houn bas 5as b activity m3ayne


tyeb lesh ma 2ela esm l2no esma bye5do telk2eyan b esm l activity le enta feha


3ashn et2akd eno ma btezbat 7a 2a3ml activity tenye w jareb 2e2ra mena l sayvto ema SHARED_PREFERANCE_RULE_THREE_FROM_ANOTHER_ACTIVITY

le sar eno bhay l activity enta 3am ta3ml read la data le b2alb l file le 5as b hay l activity

fa bas rou7na 3ala l activity tenye w jarbna ne2ra 3atana eno error l2no keen 3am yjareb ye2ra mn l file le 5as bel activity ta3elo le howe fade ma fe b2albo she
fa bas rou7na 3ala l activity tenye w jarbna ne2ra 3atana eno error l2no keen 3am yjareb ye2ra mn l file le 5as bel activity ta3elo le howe fade ma fe b2albo she




 */

public class SHARED_PREFERANCES_RULE_THREE extends AppCompatActivity {

    Button read,save,go_toanother_activity;
    SharedPreferences sp;

    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferances_rule_three);
        save=findViewById(R.id.button4_save);
        read=findViewById(R.id.button4_read);
        go_toanother_activity=findViewById(R.id.button4_another_activity);
        //erje3 mo2sher 5as bel file l mawjoud 5as bel activity bekoun esmo 7asab esm l activity
        sp=getPreferences(MODE_PRIVATE);
        edit=sp.edit();




        save.setOnClickListener(v->{
            //2a3ml save lal esme
            edit.putString("name","khaled Adel Assidi");
            edit.apply();
        });

        read.setOnClickListener(v->{
            String name=sp.getString("name","error");
            Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();
        });

        go_toanother_activity.setOnClickListener(v->{
            Intent intent=new Intent(getApplicationContext(), SHARED_PREFERANCE_RULE_THRE_FROM_ANOTHER_ACTIVITY.class);
            startActivity(intent);
        });
    }
}