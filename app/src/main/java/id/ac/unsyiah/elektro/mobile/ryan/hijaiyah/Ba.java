package id.ac.unsyiah.elektro.mobile.ryan.hijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Ba extends ActionBarActivity implements View.OnClickListener {

    MediaPlayer ourMusic = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba);

        Button btnback = (Button) findViewById(R.id.menu );
        btnback.setOnClickListener(this);

        Button alif = (Button) findViewById(R.id.suara);
        alif.setOnClickListener(this);

        Button Wa = (Button) findViewById(R.id.lanjut);
        Wa.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.menu) {
            Intent keHuruf = new Intent(Ba.this, PilihHuruf.class);
            startActivity(keHuruf);
        }

    //    TextView text = (TextView) findViewById(R.id.suara);
        if (v.getId() ==  R.id.suara) {
            if (ourMusic == null) {
                ourMusic = MediaPlayer.create(Ba.this, R.raw.o2);
            }
            if(ourMusic.isPlaying()){
                ourMusic.pause();
                //  text.setText("Play");
            }else{
                ourMusic.start();
                // text.setText("Stop");
            }
        }

        if (v.getId() == R.id.lanjut) {
            Intent keHuruf = new Intent(Ba.this, Ta.class);
            startActivity(keHuruf);
        }
    }



}
