package com.example.aitor.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity, menu);
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

    public void AbrirGoogle (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void Llamarme (View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL,
                 Uri.parse("tel:962849347"));
        // He quitado el ACTION_CALL
        // Añadir permisos en manifest:
        //<uses-permission android:name="android.permission.CALL_PHONE"></uses-permission>
        startActivity(intent);
    }

    public void GoogleMaps (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:42.8371098,-2.6771542999999838"));
        startActivity(intent);
    }

    public void SacarFoto (View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    public void MandarmeCorreo (View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
        intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"aitor@kaixo.com "});
        startActivity(intent);
    }
}