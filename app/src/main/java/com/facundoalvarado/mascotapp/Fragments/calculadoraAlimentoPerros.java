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
import android.widget.Toast;

import com.facundoalvarado.mascotapp.R;

public class calculadoraAlimentoPerros extends Fragment {
    public calculadoraAlimentoPerros() {
    }

    EditText pesoPerro;
    TextView resultadoPerro;
    Button btnCalcularPerro;
    Button btnVolver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_calculadora_alimento_perros, container, false);

        pesoPerro = (EditText) rootView.findViewById(R.id.editTextPesoPerros);
        resultadoPerro = (TextView) rootView.findViewById(R.id.resultadoCP);
        btnCalcularPerro = (Button) rootView.findViewById(R.id.btnCalcuPerros);
        btnVolver = (Button) rootView.findViewById(R.id.volverPerros);

        btnCalcularPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesoEntrada = pesoPerro.getText().toString();
                if (pesoEntrada.matches("")){
                    Toast.makeText(getActivity(), "Por favor, ingresa un número e intenta nuevamente.", Toast.LENGTH_SHORT).show();
                } else {
                    int peso = Integer.parseInt(pesoEntrada);
                    calcularPeso(peso);
                }
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
        int resultado = ((peso * 1000) * 2) /100;
        resultadoPerro.setText(resultado + "g");

    }
}
