package com.ramon12.android.geoappp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ramon12.android.model.Pregunta;

public class GeoActivity extends AppCompatActivity {
    private Button mBotonCierto,mBotonFalso,mBotonSiguiente;
    private TextView mTextoPregunta;
    private int mPreguntaActual = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        mBotonCierto = (Button) findViewById(R.id.boton_cierto);
        mBotonFalso = (Button) findViewById(R.id.boton_falso);
        mBotonSiguiente = (Button) findViewById(R.id.boton_siguiente);
        mTextoPregunta = (TextView) findViewById(R.id.texto_pregunta);


        mBotonCierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarRespuesta(true);
            }
        });

        mBotonFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarRespuesta(false);
            }
        });

        mBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPreguntaActual = mPreguntaActual + 1;
                if (mPreguntaActual == mBancoDePregunta.length){
                    mPreguntaActual = 0;
                }else{
                    actualizarPregunta();
                }
            }
        });
    }

    private void verificarRespuesta(boolean botonOprimido){
        boolean respuestaEsVerdadera = mBancoDePregunta[mPreguntaActual].ismResPuestaVerdadera();
        if(botonOprimido == respuestaEsVerdadera){
            Toast.makeText(GeoActivity.this,R.string.texto_correcto,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(GeoActivity.this,R.string.texto_Incorrecto,Toast.LENGTH_SHORT).show();
        }
    }

    private Pregunta mBancoDePregunta[] = {
        new Pregunta(R.string.texto_pregunta_1,false),
        new Pregunta(R.string.texto_pregunta_2,true),
        new Pregunta(R.string.texto_pregunta_3,true),
        new Pregunta(R.string.texto_pregunta_4,true),
        new Pregunta(R.string.texto_pregunta_5,false),
    };

    private void actualizarPregunta(){
        int preguntaActual = mBancoDePregunta[mPreguntaActual].getmIdResTexto();
        mTextoPregunta.setText(preguntaActual);
    }

}
