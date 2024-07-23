package com.example.datapersistence;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
/*

Data persistance:ma3neta estedemet l bayanet
data persistance:bkel applicationn mn 3ouza


Data persistance:estedemt l bayanet ya3ne sayev l data le 3ande bel l application 2aw bel mobile ta3ele

data persistance:majmo3a mn toro2 testa5dem l ne7fez l data 5elel fatret 7ayet l application lesh 3ashen bas l user yerja3 mara tenye 3ala l application yle2e l data ta3elo ma3mola save ya3ne ana ma bade 2a3ml application l user yfout 3lee w y7et data b2albo w bas yerja3lo ma yle2ehoun lal data la2 ana bade bas yerja3 3al application yl2e2e data ta3elo ma3moloun save bas ya3mel shutdoun lal telephone w yerja3 yefta7o yl2e data ta3elo ba3da ma7fouza bel application hay le mnsameha data persisitance 2aw estedemet l byanet mn sayevoun  5elel life cycle ta3el l application 2aw ba3da 3ala l storage l ma7lye ta3el l telephone

ya3ne b 2e5tesar data persistance heye toro2 ta5zen l byanet 3ala l phone 3ashen nesma7 lal user ya3mel esterja3 lal data w yla2eha mara tenye fe 7al sakar l application 2aw tafa l telephone w rej3 sha8lo

fe 3ande 3 toro2 2asaseye mn 5elela be2dar tabe2 mafhoum estedemet l bayanet 2aw e7faz bayanet 3ala l phone 2aw 3ala l application :

-tare2a l 2ola esma shared prefference:tafdelet l moshtarake
heye 3ebara 3an malaf bt5zen fe data 7ajma 2alel metl l esm,email,age,...etc baynet 7ajma 2alel betem ta3zena 3ala shakl xml key w value she byeshbah l bundle heye 3ebra 3an mafet btet5azan hay l malafet 3ala shakl xml bas enta ma btshofa heye btkoun mawjoude bel jehez
shared prefference:heye le ta5zen data 7ajma 2alel data mesh da5me data 5afefe mtl e5er tasjel do5oul token ta3el l mosta5dem email l mosta5dem...etc



-tare2a tenye heye l storage:zakera
l storage bten2esem la 2osmen:
internal storage:zakera da5leye
external storage:zakera 5arjeye
le mn 5eleloun hawde l tnen 7a ne2dar n5azen data bel storage ta3el l phone sawe2 kenet data 5afefe 2aw kteer t2ele hay l data fena n5azena sawe2 b internal storage 2aw external storage

metl 5azen bel gallary bel studio keef l insta keef lama ta3mel post btetsayav l soura,2aw facebook watsap
kamen 7a nshof anwe3 ela fe anwe3 5asa anwe3 3ame..etc



-tare2a telete heye database:ka3edet l bayanet
heye 3ebra 3an tare2a moheme jedan mawjoude b 2aye application btshofa bel 7ayet
aye data mawjoude da5me w ela haykaleye m3ayen w mets3mle l internet btkoun 3am tet3emal ma3 database
7a nshof keef mna3mel create table,update,insert,quries
7a nshof keef mna3mel crud rule:create,read,update,delete 3ala l application


kel haw toro2 btsoub fe tare2a wa7de ta5zen 3ala l files 3ala l malafet
w 7a nshof eno kel tare2a ela application ya3ne 2aw2at l 2a7san testa3mel database ma byenfa3 testa3ml storage file
w 2aw2at l a7san testa3ml shared preferences ma testa3ml database











 */
















public class DATA_PERSISTANCE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_persistance);

    }
}