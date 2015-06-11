package id.ac.unsyiah.elektro.mobile.ryan.hijaiyah;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Utama extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);



        Button btnLanjut =(Button)findViewById(R.id.lanjutTaBtn);
        Button btnKembali =(Button)findViewById(R.id.menu);

        btnLanjut.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View arg0) {

                Intent keli = new Intent(Utama.this, PilihHuruf.class);
                startActivity(keli);
            }

        });


        btnKembali.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                moveTaskToBack(true);

            }


        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_utama, menu);
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
