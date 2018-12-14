package com.preparaxcursos.direitocomentado.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.preparaxcursos.direitocomentado.R;
import com.preparaxcursos.direitocomentado.ShowActivities.ShowDireitos;


public class MainActivity extends AppCompatActivity {
    private TextView qc, fb, email;
    private ImageView share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qc = findViewById(R.id.qc);
        qc.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), ShowDireitos.class);
                        startActivity(i);
                    }
                });
        fb = findViewById(R.id.fb);
        fb.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://m.facebook.com/Prepara-X-Cursos-961279907257312/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
        email = findViewById(R.id.email);
        email.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "preparaxcursos@gmail.com", null));
                        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contato");
                        emailIntent.putExtra(Intent.EXTRA_TEXT, "Olá,\n");
                        startActivity(Intent.createChooser(emailIntent, "Enviar email..."));
                    }
                });
        share = findViewById(R.id.share);
        share.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent share = new Intent();
                        share.setAction(Intent.ACTION_SEND);
                        share.putExtra(Intent.EXTRA_SUBJECT, "Compartilhar");
                        share.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.preparaxcursos.direitocomentado");
                        share.setType("text/plain");
                        startActivity(share);
                    }
                });
    }
}

