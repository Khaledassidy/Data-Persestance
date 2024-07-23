package com.example.datapersistence;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/*
SHARED PREFERANCES:TAFDELET L MOSHTARAKE
le bt5lene sayev data 5afefe mesh t2ele metl l email,name,age..etc

heye 3ebra 3an ta5zen data b file b malaf
sho ya3ne file:ya3ne metl l file le enta bta3mlo create 3ala destkop

shared preferances:bt2olak 3ande file extension ta3elo xml
enta ya user ma besma7lak tshofo kel le besma7lk ya user eno mn 5elele l code t5azen fe data w testarje3 meno data ya3ne read w write

shared preferances:howe 3ebra 3an file extension xml bekoun mawjoud bel zekra de5leye le 5asa bel telephone l internal storage be 2emeknak ya programer te2ra meno data 2aw t5zen fe data testrje3 meno data metl ma badak bas ma besma7 lal user yshofo
ya3ne law fout 3al file manager ta3el telephone ma btshof heed l file bel file le 5aso bel application l2no howe file me5fe
sho ya3ne file me5fe ya3ne 5as bel application ma7ada beshofo 8eer l application nafso
enta heda l file b2emkenak t5zen fe data 5afefe ya3ne integer,double,folat,string ya3ne premitive data type ya3ne data le btkoun 5afefe ma bekoun ela 7ajm kbeer ya3ne soura w vedio la2 hay data 7ajm kbeer
fa shared preferances 3mloha la tet3emal ma3 data 7ajm 5afef

3ande 3 toro2 la et3emal ma shared preferances:

1-PreferenceManager.getDefaultSharedPreferences(Context); bte5od context
PreferenceManager heda class 3am b2albo getDefaultSharedPreferences(Context)
getDefaultSharedPreferences(this):hay ma3neta 3atene l file ta3el l application kolo l efterade le mawjoud b2alb l internal storage le l user ma fe yshofo
PreferenceManager.getDefaultSharedPreferences(this);:btjeblak l file l efterade ta3el l application kolo kemelan
ya3ne kel application enta bta3mlo byenzal 3ala phone bekoun elo malaf efterade esmo b 2esm l application ta3elak heda l file b2mkenak t5azen fe

PreferenceManager.getDefaultSharedPreferences(Context) hyde btrje3lak object mn nou3 SharedPreferrance

SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);:enta bhay tare2a jebt mo2asher 3ala l file l 3am l  5as bekol l mashro3 ya3ne le 5aso bekl application lal applcation le 5as fe

sho ya3ne 3am:ya3ne aye wa7ad la aye activity aye service mn aye mokawen bel application bye2dar yosalo
ya3ne law ana 7abet sayev l email b heda l file mn activity A fa fene mn activity B 2e2ra l email w shofo


tyeb keef bade et3mal ma3o:tare2ten ya bade 2a3ml read 2aw write ya badak t5zen fe malafet ya badak te2ra meno malafet:

tyeb ana hala2 3mlt:SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this) bas hala2 ma byenfa3 t5zen fe data mobashratan
ma byenfa3 ta3mel sp.put()

lezm testa5dem class waset howe yetwala 3amlyet ta5zen esmo Editor

fa b2olo SharedPreferences.Editor edit=sp.edit() lesh 3mlt l 7arake hay l2no clsss l editor m3araf bede5l class l sharedPrereferance
fa 3ashen 2osalo ana 2oltelo rou7 3ala sharedPreferance fout jeweto w hatle mn joweto class l editor w same edit =sp.edit() ya3ne 5odle l sharedpreferances le 3arfto fo2 w 5odle meno l editor le b2albo lesh? 3ashen 2e2dar deef 3lee data ma benshe2 wa7ad jdeed la2 bade jeeb class l editor le 5as b taba3e le 3arfto fo2 le howe 5as bel mashro3 ta3ele kolo

fa heda satr:SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this) bjeble mo2asher 3ala l file l 5as bel application kolo
w heda satr:SharedPreferences.Editor editor=sp.edit(); bjeble mo2asher 3ala class ta3del l editor le 5as bel file ta3el  mashro3 kolo le 3arfto ablo

lama badak te2ra data bte2ra mn l class l 2awl l sp de8re lama badak t3adel bt3adel mn class l edit byeshmel ta3edel 2aw ta5zen mn jdeed l satr tene


fa ana bade 5azen fa hala2 b2olo edit.put() nafs l budle bel zabt bye5od key w value        edit.putString("name","khaled Adel Assidi");

edit.putString("name","khaled Adel Assidi");:bheed satr ro7t 5aznt b shared preferances be class ta3edel ta3elo l editor l key ta3elo name w value khaled Adel Assidi

hala2 3ashen tem 3mlyet ta5zen badak testa5den method esma commit 2aw apply fe far2 baynetoun  edit.commit();
                                                                                                edit.apply();

kawnak 3mlt hay l 7arake t5azan b shared preferances fe zekra de5leye esme w key howe name

2e2ra l data mn class sp de8re directly:


fa hala2 7a rou7 2a3ml 2 button wa7de ta5zen wa7de 3ard 3ashen et2akad


bas getdiffutltsharedpreferance deprecated nesta3ml hay:  sp = getSharedPreferences("com.example.datapersistence_preferences", Context.MODE_PRIVATE);
        sp = getSharedPreferences(getPackageName()+"_preferences", Context.MODE_PRIVATE);
        2aw iza bade jeeb esmo lal diffult shared prefferancee :        String x=PreferenceManager.getDefaultSharedPreferencesName(this);


la7ata jeeb esm l diffult file le b2alb l app howe esm l package ta3ele _preferences:com.example.datapersistence_preferences
tene wa7ad :Context.MODE_PRIVATE:howe flag beroud boolean hayde bt5le file heda bas accces 3ala l application ta3ele ya3ne howe be2olo eno meen beydar ya3mel acces bhay l 7ale bas l application ta3ele ya3ne howe private lal application ta3ele ma fe another application ya3melo acces
Data is Secure: The data is protected and isolated within your app's sandbox. How It Works: When you call getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE), the system checks if a SharedPreferences file with the given name (SHARED_PREF_NAME) already exists for your application.
If it exists: The existing file is opened in private mode.
If it doesn't exist: A new SharedPreferences file is created with the specified name and set to private mode. Other Modes (Less Common): While Context.MODE_PRIVATE is the most common and generally recommended mode, there are other less frequently used modes:



e5er ma3lome iza 3mlna unstall lal app kel data le b2alb shared prefferances diifult 2aw 8eer diffult kamen byen3mloun delete










*/







public class SHARED_PREFERANCES_RULE_ONE extends AppCompatActivity {

    Button save,read;

    SharedPreferences sp;

    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferances);
        save=findViewById(R.id.button_sv);
        read=findViewById(R.id.button_read);

        //le raje3 mo2sher 3ala l file l 3am tabe3 lal application ka kol
        sp=PreferenceManager.getDefaultSharedPreferences(this);


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


       //e5tesar:
       /*
       ro7t 3mlt 2 button 2aw7d lal save wa7ad lal read
       ba3den ro7t jebt l mo2asher 3ala l malaf l file l 3am l efterade ta3el kel l application sp = PreferenceManager.getDefaultSharedPreferences(this);
       heda l mlaf bet3mela ma3o ya ema write 2aw read
       w 3mlyet l write w read 3an tare2 key w value
       ba3den jebt class esmo editor  3ashen 2a3ml write ma fene 2a3ml write de8re 3al sp lezm class waset b2alb class l shared preference w 5aznat b 2albo l editor ta3el ta3el l shared preferance nafso le 3arfto

       ba3den la 2a3ml save la she ba3mel hek   edit.putString("name","khaled Adel Assidi"); bhay tare2a syvt b2alb l file esme
       bas la tekml 3amlyet l save lezm 2a3ml commit 2aw apply edit.commit() or edit.apply()

       ba3den bas 2a3ml read bade jeeb l esm fa bet3ml ma3 class shared preference le howe l sp directly so sp.getString("name","error);
       w tab3ta b toast

       hala2 eza ba3mel save ba3den bsaker l application 2aw btafe telephone berja3 bsha8lo ba3ml read 7a yetb3le khaled Adel assidi

     */
    }
}