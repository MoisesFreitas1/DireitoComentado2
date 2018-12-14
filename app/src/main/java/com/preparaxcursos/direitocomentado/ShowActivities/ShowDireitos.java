package com.preparaxcursos.direitocomentado.ShowActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.preparaxcursos.direitocomentado.R;


public class ShowDireitos extends AppCompatActivity {
    private TextView dconst,dadm,dtrib,dpen,decon;
    private String direitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_direitos);

//        dall = (TextView) findViewById(R.id.dall);
//        dall.setOnClickListener(
//                new View.OnClickListener(){
//                    public void onClick (View v){
//                        Intent i = new Intent(v.getContext(), ShowQuestion.class);
//                        i.putExtra("dall", direitos);
//                        startActivity(i);
//                    }
//                });

        dconst = (TextView) findViewById(R.id.dconst);
        dconst.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), ShowQuestion.class);
                        i.putExtra("dconst", direitos);
                        startActivity(i);
                    }
                });

        dadm = (TextView) findViewById(R.id.dadm);
        dadm.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), ShowQuestion.class);
                        i.putExtra("dadm", direitos);
                        startActivity(i);
                    }
                });

        dtrib = (TextView) findViewById(R.id.dtrib);
        dtrib.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), ShowQuestion.class);
                        i.putExtra("dtrib", direitos);
                        startActivity(i);
                    }
                });

        dpen = (TextView) findViewById(R.id.dpen);
        dpen.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), ShowQuestion.class);
                        i.putExtra("dpen", direitos);
                        startActivity(i);
                    }
                });
        decon = (TextView) findViewById(R.id.decon);
        decon.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), ShowQuestion.class);
                        i.putExtra("decon", direitos);
                        startActivity(i);
                    }
                });
    }
}
