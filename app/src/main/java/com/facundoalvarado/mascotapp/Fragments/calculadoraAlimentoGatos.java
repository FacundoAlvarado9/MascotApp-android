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
import android.widget.EditText;
import android.widget.TextView;

import com.facundoalvarado.mascotapp.R;


public class calculadoraAlimentoGatos extends Fragment {
    public calculadoraAlimentoGatos() {
    }

    EditText pesoGato;
    Button btnVolver;
    Button btnCalcularGato;
    TextView resultadoGato;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_calculadora_alimento_gatos, container, false);


        pesoGato = (EditText) rootView.findViewById(R.id.editTextPesoGatos);
        resultadoGato = (TextView) rootView.findViewById(R.id.resultadoCG);
        btnCalcularGato = (Button) rootView.findViewById(R.id.btnCalcuGatos);
        btnVolver = (Button) rootView.findViewById(R.id.volverGatos);

        btnCalcularGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesoEntrada = pesoGato.getText().toString();
                int peso = Integer.parseInt(pesoEntrada);

                calcularPeso(peso);
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment FragmentC = new CalculadoraAlimentoHalfway();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.add(R.id.frameCalcP, FragmentC).commit();
            }
        });


        return rootView;
    }

    private void calcularPeso(int peso) {
//        Toast.makeText(getActivity(), "Peso es: " + peso, Toast.LENGTH_SHORT).show();
        float resultado = (float) ((peso * 70) /6);
        resultadoGato.setText("Aprox. "+ resultado + "g");

    }

}
