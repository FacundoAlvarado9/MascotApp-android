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

public class vacunasPerrosFragment extends Fragment {

    public vacunasPerrosFragment() {
        // Required empty public constructor
    }

    Button btnVolver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_vacunas_perros, container, false);

        btnVolver = (Button) rootView.findViewById(R.id.btnVolverP);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volver();
            }
        });

        return rootView;
    }

    public void volver() {
        Fragment fragmentC = new VacunasFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.frameVPerros, fragmentC ).commit();
    }

}
