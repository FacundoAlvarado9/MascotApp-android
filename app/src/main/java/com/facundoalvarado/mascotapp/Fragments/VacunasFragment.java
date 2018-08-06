package com.facundoalvarado.mascotapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facundoalvarado.mascotapp.R;

public class VacunasFragment extends Fragment {

    public VacunasFragment(){

    }

    Button btnVacunasPerros;
    Button btnVacunasGatos;
    Button btnVolverG;
    Button btnVolverP;
    Fragment frgVacunasPerros;
    Fragment frgVacunasGatos;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_vacunas, container, false);


//        Definiendo botones
        btnVacunasGatos = rootView.findViewById(R.id.btnVacunasGatos);
        btnVacunasPerros = (Button) rootView.findViewById(R.id.btnVacunasPerros);

        btnVolverG = rootView.findViewById(R.id.btnVolverG);
        btnVolverP = rootView.findViewById(R.id.btnVolverP);


//        Listeners para botones

//        A vacunas
        btnVacunasPerros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aVacunasPerros();
            }
        });

        btnVacunasGatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aVacunasGatos();
            }
        });



        return rootView;
    }

    public void aVacunasPerros(){
        Fragment fragmentC = new vacunasPerrosFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.frame2, fragmentC ).commit();
    }

    public void aVacunasGatos(){
        Fragment fragmentC = new vacunasGatosFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.frame2, fragmentC ).commit();
    }


}
