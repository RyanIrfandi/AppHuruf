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


public class Ma extends ActionBarActivity implements View.OnClickListener {


    MediaPlayer ourMusic = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma);

        Button btnback = (Button) findViewById(R.id.menu );
        btnback.setOnClickListener(this);

        Button suara = (Button) findViewById(R.id.suara);
        suara.setOnClickListener(this);

        Button Ma = (Button) findViewById(R.id.lanjut);
        Ma.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.menu) {
            Intent keHuruf = new Intent(Ma.this, PilihHuruf.class);
            startActivity(keHuruf);
        }


        TextView text = (TextView) findViewById(R.id.suara);
        if (v.getId() ==  R.id.suara) {
            if (ourMusic == null) {
                ourMusic = MediaPlayer.create(Ma.this, R.raw.o24);
            }
            if(ourMusic.isPlaying()){
                ourMusic.pause();
                //text.setText("Play");
            }else{
                ourMusic.start();
                //text.setText("Stop");

            }
        }

        if (v.getId() == R.id.lanjut) {
            Intent keHuruf = new Intent(Ma.this,Na.class);
            startActivity(keHuruf);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ma, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
