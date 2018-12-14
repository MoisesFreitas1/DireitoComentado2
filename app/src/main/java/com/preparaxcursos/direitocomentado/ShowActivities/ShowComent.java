package com.preparaxcursos.direitocomentado.ShowActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.preparaxcursos.direitocomentado.R;


public class ShowComent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_coment);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String txt = bundle.getString("coment");
        TextView coment = (TextView) findViewById(R.id.coment);
        coment.setText(txt);
    }
}
