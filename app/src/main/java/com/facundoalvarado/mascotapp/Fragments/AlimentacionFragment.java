package com.facundoalvarado.mascotapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facundoalvarado.mascotapp.R;

public class AlimentacionFragment extends Fragment {

    public AlimentacionFragment() {
        // Required empty public constructor
    }

    Button btnIrACalc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_alimentacion, container, false);

        btnIrACalc = (Button) rootView.findViewById(R.id.irACalc);

        btnIrACalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmentC = new CalculadoraAlimentoHalfway();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.add(R.id.FrameAlim, fragmentC ).commit();
            }
        });

        return rootView;
    }
}
