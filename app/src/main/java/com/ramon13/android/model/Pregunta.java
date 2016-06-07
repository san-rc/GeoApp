package com.ramon12.android.model;

/**
 * Created by ramon12 on 22/05/2016.
 */
public class Pregunta {

    Integer mIdResTexto;
    boolean mResPuestaVerdadera;

    public Pregunta(Integer mIdResTexto, boolean mResPuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mResPuestaVerdadera = mResPuestaVerdadera;
    }

    public Integer getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(Integer mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean ismResPuestaVerdadera() {
        return mResPuestaVerdadera;
    }

    public void setmResPuestaVerdadera(boolean mResPuestaVerdadera) {
        this.mResPuestaVerdadera = mResPuestaVerdadera;
    }
}
