package com.facundoalvarado.mascotapp.Data;

public class MiembroClub {

    private String  mOcupacion;
    private String mTarea;
    private String mSocialLink;
    private int mImg;

    public MiembroClub(String nombreApellido, String ocupacion, String tarea, String socialLink, int img) {
        mNombreApellido = nombreApellido;
        mOcupacion = ocupacion;
        mTarea = tarea;
        mSocialLink = socialLink;
        mImg = img;
    }


    private String mNombreApellido;

    public String getNombreApellido() {
        return mNombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        mNombreApellido = nombreApellido;
    }

    public String getOcupacion() {
        return mOcupacion;
    }

    public void setOcupacion(String ocupacion) {
        mOcupacion = ocupacion;
    }

    public String getTarea() {
        return mTarea;
    }

    public void setTarea(String tarea) {
        mTarea = tarea;
    }

    public String getSocialLink() {
        return mSocialLink;
    }

    public void setSocialLink(String socialLink) {
        mSocialLink = socialLink;
    }

    public int getImg() {
        return mImg;
    }

    public void setImg(int img) {
        mImg = img;
    }


}
