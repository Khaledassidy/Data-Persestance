package com.example.datapersistence;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;




/*

tare2a tenye lal shared preferances heye nafs l code bas mnesta3mle w nafs l write w read bas badel getdiffultsharedpreferrance
mnesta3ml hala2   getSharedPreferences()

 getSharedPreferences():bte5od sha8lten l2ola esm l malaf  w tenye heye mode

 sho ya3ne esm l malaf:ne7na abl shway bas 3mlna getdiffultsharedpreferance ma kenet bte5od esm l malaf lesh l2no lala mashro3 kolo keeen fe malaf wa7ad wa7de ma3rouf esmo fa esmo b esm l application ma3reouf
 ama houn l getSharedPreferences() bta3mlk file 3ala mestawa kel l mashrou3 w btesma7lk enta t7aded esmo ya3ne
 getSharedPreferences("emails",MODE_PRIVATE); ya3ne houn 3atyto l esm email w l mode mode private
 mode_private ya3ne mamno3 7ada yosalo la heda l file barat l application ya3ne law fe application tene 7ewal yest3ml heda l file mn l activity ta3elak la shared preferances byemna3o lesh l2no l mode private ya3ne aye application activity barat l package ta3ete byemna3o ya3mlo acces
 aye file enta btensh2o w bt7adedlo l mode heda l mode be7ded sal7yet l mlaf bye2dar 7ada mn bara yest3mlo wala la2

  sp=getSharedPreferences("emails",MODE_PRIVATE);btrje3lak mo2asher 3ala l malaf l 5as 7asab esm l mod5l

 getSharedPreferences("emails",MODE_PRIVATE);bas ta3ml heek berou7 bejblak l malaf l bel esm heda law mesh mawjoud l malaf bya3mlk create la file jdeed esmo email
 fa tare2a hay bt5lek ta3ml akatr mn malaf b shared preferances bel esm le bade yeh w bek mode le bade yeh bel sala7ye le bade yeha

sp=getSharedPreferences("emails",MODE_PRIVATE);:fa l 7arake hay sam7tle enshe2 file esmo email houn telk2eyan getshared ween ma btl2e getshared ya3ne 3a mostawa tatbe2 ya3ne houn telke2yen byeje ma ble2e file esmo email ya3mlo crate w b7ot l mode private mamno3 7ada ya3mlo acces mn barat l application w ba3den b5zen fe khaled adel assidi

mara tenye bas la yeje ya3mel save 7a le2e l file email mam3mlo crate bas byestad3e

bhay tare2a bma 2no btesd3e file mawjoude fa fena bade tare2a l 2nola get diffult n7ot sp=getSharedPreferences("esm diffult package"+"_persistance",MODE_PRIVATE);

houn iza tle3t mn l aapp w 2aw tafet telephone w rje3t w 5abst read 7a yetb3lk kamen l esm l2no howe ma7fouz bel intermal storage ma berou7 ela la ta3mel unstall




*/

public class SHARED_PREFERANCES_RULE_TWO extends AppCompatActivity {
    Button save,read,go_another_activity;

    SharedPreferences sp;

    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferances_rule_two);
        save=findViewById(R.id.button2_save);
        read=findViewById(R.id.button2_read);
        go_another_activity=findViewById(R.id.button_aother_activity);

        //le raje3 mo2sher 3ala l malaf l 5as 7asab esm l mod5al houn esmo email
        sp=getSharedPreferences("emails",MODE_PRIVATE);


        edit=sp.edit();


        save.setOnClickListener(v->{

            //2a3ml save lal esme
            edit.putString("name","khaled Adel Assidi");
            edit.apply();
        });

        read.setOnClickListener(v->{

            //2e2ra l data mn class sp de8re directly
            String name=sp.getString("name","error");
            Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();
        });


        go_another_activity.setOnClickListener(v->{
            Intent intent=new Intent(getApplicationContext(), SHARED_PREFERANCE_RULE_TWO_FROM_ANOTHER_ACTIVITY.class);
            startActivity(intent);
        });
    }
}