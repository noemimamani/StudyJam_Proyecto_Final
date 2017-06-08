package com.miramicodigo.prueba_proyecto;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void llamar (View view){
        Intent i=new Intent(this,HistoriaActivity.class);
        startActivity(i);
        mp = MediaPlayer.create(this, R.raw.sonidito);
        mp.start();

    }
    public void llamar_dos (View view){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
        mp.start();
    }
    public void llamar_tres (View view){
        Intent i=new Intent(this,EleccionActivity.class);
        startActivity(i);
        mp.start();
    }
    public void llamar_cuatro (View view){
        Intent i=new Intent(this,RolActivity.class);
        startActivity(i);
        mp.start();
    }
    public void llamar_cinco (View view){
        Intent i=new Intent(this,GaleriaActivity.class);
        startActivity(i);
        mp.start();
    }
    public void llamar_seis(View view){
        Intent i=new Intent(this,AboutActivity.class);
        startActivity(i);
        mp.start();
    }

}

