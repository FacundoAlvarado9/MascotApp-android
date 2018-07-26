package com.facundoalvarado.mascotapp.Data;

public class Mito {

    private int mTituloID;
    private int mDescripcionID;

    public Mito(int tituloID, int descripcionID) {
        mTituloID = tituloID;
        mDescripcionID = descripcionID;
    }

    public int getTituloID() {
        return mTituloID;
    }

    public void setTituloID(int tituloID) {
        mTituloID = tituloID;
    }

    public int getDescripcionID() {
        return mDescripcionID;
    }

    public void setDescripcionID(int descripcionID) {
        mDescripcionID = descripcionID;
    }
}
