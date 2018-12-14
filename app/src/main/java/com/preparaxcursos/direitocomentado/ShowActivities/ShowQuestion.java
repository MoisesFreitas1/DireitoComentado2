package com.preparaxcursos.direitocomentado.ShowActivities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.preparaxcursos.direitocomentado.ListViews.LAdm;
import com.preparaxcursos.direitocomentado.ListViews.LConst;
import com.preparaxcursos.direitocomentado.ListViews.LEcon;
import com.preparaxcursos.direitocomentado.ListViews.LPenal;
import com.preparaxcursos.direitocomentado.ListViews.LTrib;
import com.preparaxcursos.direitocomentado.Models.Question;
import com.preparaxcursos.direitocomentado.R;

import java.util.Random;

import static android.content.ContentValues.TAG;

public class ShowQuestion extends AppCompatActivity {
    private TextView textView;
    private TextView temaTextView;
    private TextView enunciadoTextView;
    private TextView corrigir;
//    private TextView comentario;
    private TextView proxima;
    private Button c;
    private Button e;
    private int alternativa;
    private int tentativas;
    int[] nquestion;
    long[] problema;
    int nquestions;
    int m;
    private int opcao;
    private Question question;
    private boolean conection;
    private boolean mark = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_question);

        textView = (TextView) findViewById(R.id.textView);
        temaTextView = (TextView) findViewById(R.id.temaTextView);
        enunciadoTextView = (TextView) findViewById(R.id.enunciadoTextView);
        corrigir = (TextView) findViewById(R.id.corrigir);
//        comentario = (TextView) findViewById(R.id.comentario);
        proxima = (TextView) findViewById(R.id.proxima);
        c = (Button) findViewById(R.id.c);
        e = (Button) findViewById(R.id.e);
        int tamanho = 0;

        YoYo.with(Techniques.ZoomInDown).duration(900).playOn(findViewById(R.id.cv_list));

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        m = 0;
        tentativas = 0;
//        if (getIntent().hasExtra("dall")) {
//            nquestions = 1034;
//        } else
        if (getIntent().hasExtra("dconst")) {
            nquestions = 138;
        } else if (getIntent().hasExtra("dadm")) {
            nquestions = 544;
        } else if (getIntent().hasExtra("dtrib")) {
            nquestions = 301;
        } else if (getIntent().hasExtra("dpen")) {
            nquestions = 1000;
        } else if (getIntent().hasExtra("decon")) {
            nquestions = 32;
        }

        //Solução de Problemas
//        tamanho = LQuestions.getLquestion().size();
        Log.e("tamanho", "" + tamanho);
        tamanho = LConst.getLquestion().size();
        Log.e("tamanho", "" + tamanho);
        tamanho = LAdm.getLquestion().size();
        Log.e("tamanho", "" + tamanho);
        tamanho = LTrib.getLquestion().size();
        Log.e("tamanho", "" + tamanho);
        tamanho = LPenal.getLquestion().size();
        Log.e("tamanho", "" + tamanho);
        tamanho = LEcon.getLquestion().size();
        Log.e("tamanho", "" + tamanho);

        problema = new long[1000];
        for (int i = 0; i < 1000; i++) {
            problema[i] = LPenal.getLquestion().get(i).getId();
        }

        long[] pulo = new long[1000];
        for (int i=0;i<1000;i++){
            pulo[i]=0;
        }

        long diferenca;
        for(int i=1;i<1000;i++){
            diferenca = problema[i]-problema[i-1];
            if(diferenca>1L){
                pulo[i]=problema[i];
                Log.e("pulo","pulou de "+problema[i-1]+" para "+problema[i]);
            }
        }

        for(int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){
                if(i!=j){
                    if(problema[i]==problema[j]){
                        Log.e("repetido",problema[i]+" e "+problema[j]);
                    }
                }
            }
        }
        //Fim Solução de Problemas

        nquestion = new int[10];
        int tquestions[];
        int aux;

        Random random = new Random();
        tquestions = new int[nquestions];
        for (int b = 0; b < nquestions; b++) {
            tquestions[b] = b + 1;
        }
        for (int n = 0; n < 10; n++) {
            do {
                aux = random.nextInt(nquestions);
                nquestion[n] = tquestions[aux];
            } while (tquestions[aux] == 0);
            tquestions[aux] = 0;
        }

        textView.setText((m + 1) + " de " + nquestion.length);
//        if (getIntent().hasExtra("dall")) {
//            question = LQuestions.getLquestion().get(nquestion[m] - 1);
//        } else
        if (getIntent().hasExtra("dconst")) {
            question = LConst.getLquestion().get(nquestion[m] - 1);
        } else if (getIntent().hasExtra("dadm")) {
            question = LAdm.getLquestion().get(nquestion[m] - 1);
        } else if (getIntent().hasExtra("dtrib")) {
            question = LTrib.getLquestion().get(nquestion[m] - 1);
        } else if (getIntent().hasExtra("dpen")) {
            question = LPenal.getLquestion().get(nquestion[m] - 1);
        }else if (getIntent().hasExtra("decon")) {
            question = LEcon.getLquestion().get(nquestion[m] - 1);
        }

        temaTextView.setText(question.getTema());
        enunciadoTextView.setText(question.getEnunciado());
        alternativa = question.getGabarito();
        c.setBackgroundColor(Color.parseColor("#DCDCDC"));
        e.setBackgroundColor(Color.parseColor("#DCDCDC"));

        c.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        c.setBackgroundColor(Color.parseColor("#778899"));
                        e.setBackgroundColor(Color.parseColor("#DCDCDC"));
                        opcao = R.id.c;
                        mark = true;
                    }
                });
        e.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        c.setBackgroundColor(Color.parseColor("#DCDCDC"));
                        e.setBackgroundColor(Color.parseColor("#778899"));
                        opcao = R.id.e;
                        mark = true;
                    }
                });

        proxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m == (nquestion.length-1)) {
                    if(mark){
                        if (opcao == alternativa){
                            tentativas = tentativas + 1;
                        }
                        AlertDialog.Builder mensagem1 = new AlertDialog.Builder(ShowQuestion.this);
                        mensagem1.setTitle("   Fim do teste");
                        mensagem1.setMessage(tentativas + " acertos");
                        mensagem1.setPositiveButton("Finalizar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        });
                        mensagem1.show();
                        mark = false;
                    } else{
                        Toast.makeText(ShowQuestion.this, "Marque uma alternativa", Toast.LENGTH_SHORT).show();
                    }
                }

                if (m < (nquestion.length - 1)) {
                    if(mark == true) {
                        c.setBackgroundColor(Color.parseColor("#DCDCDC"));
                        e.setBackgroundColor(Color.parseColor("#DCDCDC"));
                        m = m + 1;
                        textView.setText((m + 1) + " de " + nquestion.length);
                        if (getIntent().hasExtra("dconst")) {
                            question = LConst.getLquestion().get(nquestion[m] - 1);
                        } else if (getIntent().hasExtra("dadm")) {
                            question = LAdm.getLquestion().get(nquestion[m] - 1);
                        } else if (getIntent().hasExtra("dtrib")) {
                            question = LTrib.getLquestion().get(nquestion[m] - 1);
                        } else if (getIntent().hasExtra("dpen")) {
                            question = LPenal.getLquestion().get(nquestion[m] - 1);
                        } else if (getIntent().hasExtra("decon")) {
                            question = LEcon.getLquestion().get(nquestion[m] - 1);
                        }
                        temaTextView.setText(question.getTema());
                        enunciadoTextView.setText(question.getEnunciado());
                        alternativa = question.getGabarito();
                        opcao = question.getGabarito();
                        YoYo.with(Techniques.SlideInRight).duration(900).playOn(findViewById(R.id.cv_list));
                        mark = false;
                    } else{
                        Toast.makeText(ShowQuestion.this, "Marque uma opção", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        corrigir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mark == true) {
                    if (opcao != alternativa) {
                        if (opcao == R.id.c) {
                            c.setBackgroundColor(Color.parseColor("#F08080"));
                        } else if (opcao == R.id.e) {
                            e.setBackgroundColor(Color.parseColor("#F08080"));
                        }
                        if (alternativa == R.id.c) {
                            c.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if (alternativa == R.id.e) {
                            e.setBackgroundColor(Color.parseColor("#00FA9A"));
                        }
                    }
                    if (opcao == alternativa) {
                        if (opcao == R.id.c) {
                            c.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if (opcao == R.id.e) {
                            e.setBackgroundColor(Color.parseColor("#00FA9A"));
                        }
                        tentativas = tentativas + 1;
                    }
                } else{
                    Toast.makeText(ShowQuestion.this, "Marque uma opção", Toast.LENGTH_SHORT).show();
                }
            }
        });


        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLeftApplication() {
                if (mark == true) {
                    conection = Conectado(ShowQuestion.this);
                    if (conection == true) {
                        Intent i = new Intent(ShowQuestion.this, ShowComent.class);
                        i.putExtra("coment", question.getComentario());
                        startActivity(i);
                    } else {
                        AlertDialog.Builder mensagem = new AlertDialog.Builder(ShowQuestion.this);
                        mensagem.setTitle("");
                        mensagem.setMessage("Verifique sua conexão com a internet e tente novamente.");
                        mensagem.setNeutralButton("OK", null);
                        mensagem.show();
                    }
                } else{
                    Toast.makeText(ShowQuestion.this, "Marque uma opção", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public static boolean Conectado(Context context) {
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnected()) {
                return true;
            } else if (cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            return false;
        }
    }
}
