package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageViewRes;
    private Button btVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageViewRes = findViewById(R.id.imageViewRes);
        btVoltar = findViewById(R.id.btVoltar);

        //recuperar os dados
        Bundle dados = getIntent().getExtras();
        int num = dados.getInt("num");

        if (num == 0 ){

            imageViewRes.setImageResource(R.drawable.moeda_cara);


        }else {

            imageViewRes.setImageResource(R.drawable.moeda_coroa);

        }

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}