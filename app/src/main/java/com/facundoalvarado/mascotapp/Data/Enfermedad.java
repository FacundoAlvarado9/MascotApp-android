package com.facundoalvarado.mascotapp.Data;

public class Enfermedad {

    public Enfermedad(int nombre, int animales, int origen, int prevencion, int sintomas, int tratamiento) {
        mNombre = nombre;
        mAnimales = animales;
        mOrigen = origen;
        mPrevencion = prevencion;
        mSintomas = sintomas;
        mTratamiento = tratamiento;
    }

    int mNombre;
    int mAnimales;
    int mOrigen;
    int mPrevencion;
    int mSintomas;
    int mTratamiento;

    public int getPrevencion() {
        return mPrevencion;
    }

    public void setPrevencion(int prevencion) {
        mPrevencion = prevencion;
    }

    public int getNombre() {
        return mNombre;
    }

    public void setNombre(int nombre) {
        mNombre = nombre;
    }

    public int getAnimales() {
        return mAnimales;
    }

    public void setAnimales(int animales) {
        mAnimales = animales;
    }

    public int getOrigen() {
        return mOrigen;
    }

    public void setOrigen(int origen) {
        mOrigen = origen;
    }

    public int getSintomas() {
        return mSintomas;
    }

    public void setSintomas(int sintomas) {
        mSintomas = sintomas;
    }

    public int getTratamiento() {
        return mTratamiento;
    }

    public void setTratamiento(int tratamiento) {
        mTratamiento = tratamiento;
    }
}
