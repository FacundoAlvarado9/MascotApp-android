package com.facundoalvarado.mascotapp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facundoalvarado.mascotapp.R;

public class CalculadoraAlimentoHalfway extends Fragment {

    public CalculadoraAlimentoHalfway() {
    }

    Button btnPerros;
    Button btnGatos;
    Button btnVovler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_calculadora_alimento_halfway, container, false);

        btnPerros = (Button) rootView.findViewById(R.id.btnCalcPerros);
        btnGatos = (Button) rootView.findViewById(R.id.btnCalcGatos);
        btnVovler = (Button) rootView.findViewById(R.id.btnVolverH);

        btnPerros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment FragmentC = new calculadoraAlimentoPerros();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.add(R.id.frameCalc, FragmentC).commit();
            }
        });

        btnGatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment FragmentC = new calculadoraAlimentoGatos();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.add(R.id.frameCalc, FragmentC).commit();
            }
        });

        btnVovler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment FragmentC = new AlimentacionFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.add(R.id.frameCalc, FragmentC).commit();
            }
        });





        return rootView;
    }

}
