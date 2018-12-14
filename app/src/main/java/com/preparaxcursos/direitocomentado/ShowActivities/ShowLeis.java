package com.preparaxcursos.direitocomentado.ShowActivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.preparaxcursos.direitocomentado.R;


public class ShowLeis extends AppCompatActivity {
    private TextView r371,r358,r302,r293,r280,r191,l7498,l5905,l8080,cde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_leis);

        r371 = (TextView) findViewById(R.id.r371);
        r371.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_4eb19125f975469c8f85bcefc7a584ab.pdf?dn=R371+10.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        r358 = (TextView) findViewById(R.id.r358);
        r358.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_873abf499891453f88abedaeaba09d76.pdf?dn=R358+09.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        r302 = (TextView) findViewById(R.id.r302);
        r302.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_e3247a0d1e6540dbb0b3bcfe298dcd3c.pdf?dn=R302+05.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        r293 = (TextView) findViewById(R.id.r293);
        r293.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_1a7d87d215f247b3b272e20144e5ae29.pdf?dn=R293+04.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        r280 = (TextView) findViewById(R.id.r280);
        r280.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_f3440e50edb34b018d7178c920b89a4f.pdf?dn=R280+03.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        r191 = (TextView) findViewById(R.id.r191);
        r191.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_85a6167c1d3944dbbeceb36627f28c51.pdf?dn=R191+96.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        l7498 = (TextView) findViewById(R.id.l7498);
        l7498.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_ed974c88da124f3385116f03c4161510.pdf?dn=L7498+86.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        l5905 = (TextView) findViewById(R.id.l5905);
        l5905.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_8cbe5dd7c8254eaf9823de1db6641ec7.pdf?dn=L5905+73.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        l8080 = (TextView) findViewById(R.id.l8080);
        l8080.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_3e4a4a8da1014a7da067a4c52080db17.pdf?dn=L8080+90.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        cde = (TextView) findViewById(R.id.cde);
        cde.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("https://static.wixstatic.com/ugd/f0d361_52be42d134fa4359915a7046123ea349.pdf?dn=CdE.pdf");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
    }
}
