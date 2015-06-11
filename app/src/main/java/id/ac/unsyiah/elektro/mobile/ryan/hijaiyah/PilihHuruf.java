package id.ac.unsyiah.elektro.mobile.ryan.hijaiyah;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class PilihHuruf extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_huruf);


        Button btnback = (Button) findViewById(R.id.kembali );
        btnback.setOnClickListener(this);

        Button alif = (Button) findViewById(R.id.alifBtn);
        alif.setOnClickListener(this);

        Button ba = (Button) findViewById(R.id.baBtn);
        ba.setOnClickListener(this);

        Button ta = (Button) findViewById(R.id.taBtn);
        ta.setOnClickListener(this);

        Button tsa = (Button) findViewById(R.id.tsaBtn);
        tsa.setOnClickListener(this);

        Button ja = (Button) findViewById(R.id.jaBtn);
        ja.setOnClickListener(this);

        Button ha = (Button) findViewById(R.id.haBtn);
        ha.setOnClickListener(this);

        Button kha = (Button) findViewById(R.id.khaBtn);
        kha.setOnClickListener(this);

        Button da = (Button) findViewById(R.id.daBtn);
        da.setOnClickListener(this);

        Button dza = (Button) findViewById(R.id.dzaBtn);
        dza.setOnClickListener(this);

        Button ra = (Button) findViewById(R.id.raBtn);
        ra.setOnClickListener(this);

        Button za = (Button) findViewById(R.id.zaBtn);
        za.setOnClickListener(this);

        Button sa = (Button) findViewById(R.id.saBtn);
        sa.setOnClickListener(this);

        Button sya = (Button) findViewById(R.id.syaBtn);
        sya.setOnClickListener(this);

        Button sha = (Button) findViewById(R.id.shaBtn);
        sha.setOnClickListener(this);

        Button dha = (Button) findViewById(R.id.dhaBtn);
        dha.setOnClickListener(this);

        Button tha = (Button) findViewById(R.id.thaBtn);
        tha.setOnClickListener(this);

        Button zha = (Button) findViewById(R.id.zhaBtn);
        zha.setOnClickListener(this);

        Button ain = (Button) findViewById(R.id.ainBtn);
        ain.setOnClickListener(this);

        Button gha = (Button) findViewById(R.id.ghaBtn);
        gha.setOnClickListener(this);

        Button fa = (Button) findViewById(R.id.faBtn);
        fa.setOnClickListener(this);

        Button qa = (Button) findViewById(R.id.qaBtn);
        qa.setOnClickListener(this);

        Button ka = (Button) findViewById(R.id.kaBtn);
        ka.setOnClickListener(this);

        Button la = (Button) findViewById(R.id.laBtn);
        la.setOnClickListener(this);

        Button ma = (Button) findViewById(R.id.maBtn);
        ma.setOnClickListener(this);

        Button na = (Button) findViewById(R.id.naBtn);
        na.setOnClickListener(this);

        Button wa = (Button) findViewById(R.id.waBtn);
        wa.setOnClickListener(this);

        Button lamAlif = (Button) findViewById(R.id.haaBtn);
        lamAlif.setOnClickListener(this);

        Button hamzah = (Button) findViewById(R.id.hamzahBtn);
        hamzah.setOnClickListener(this);

        Button ya = (Button) findViewById(R.id.yaBtn);
        ya.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.kembali) {
            Intent keHuruf = new Intent(PilihHuruf.this, Utama.class);
            startActivity(keHuruf);
        }


        if (v.getId() ==  R.id.alifBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Alif.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.baBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Ba.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.taBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Ta.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.tsaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Tsa.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.jaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Ja.class);
            startActivity(keHuruf);
        }

        if (v.getId() ==  R.id.haBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Ha.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.khaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Kha.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.daBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Da.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.dzaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Dza.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.raBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this,Ra.class);
            startActivity(keHuruf);
        }

        if (v.getId() ==  R.id.zaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Za.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.saBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Sa.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.syaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Sya.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.shaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Sha.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.dhaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this,Dha.class);
            startActivity(keHuruf);
        }

        if (v.getId() ==  R.id.thaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Tha.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.zhaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Zha.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.ainBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Ain.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.ghaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Gha.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.faBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this,Fa.class);
            startActivity(keHuruf);
        }

        if (v.getId() ==  R.id.qaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Qa.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.kaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Ka.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.laBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, La.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.maBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Ma.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.naBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this,Na.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.waBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Wa.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.haaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Haa.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.hamzahBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this, Hamzah.class);
            startActivity(keHuruf);
        }

        if (v.getId() == R.id.yaBtn) {
            Intent keHuruf = new Intent(PilihHuruf.this,Ya.class);
            startActivity(keHuruf);
        }





    }
}
