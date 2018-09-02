package com.facundoalvarado.mascotapp.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facundoalvarado.mascotapp.R;

public class VeterinariasFragment extends Fragment {

    public VeterinariasFragment(){
    }

    Button btnMapa;
    final String veterinariasCercanasUrl = "https://www.google.com/maps/search/veterinaria/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  rootView = inflater.inflate(R.layout.fragment_veterinarias, container, false);

        btnMapa = (Button) rootView.findViewById(R.id.btnMapa);

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Abriendo un WebView para las veterinarias cercanas
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(veterinariasCercanasUrl));
                startActivity(browserIntent);
            }
        });


        return rootView;
    }


}
