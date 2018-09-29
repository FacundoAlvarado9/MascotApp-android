package com.facundoalvarado.mascotapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facundoalvarado.mascotapp.Adapters.CreditosAdapter;
import com.facundoalvarado.mascotapp.Data.MiembroClub;
import com.facundoalvarado.mascotapp.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditosFragment extends Fragment {

    public CreditosFragment() {}

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    private List<MiembroClub> listaMiembros;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_creditos, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.creditosRecycler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        listaMiembros = new ArrayList<>();

        MiembroClub[] lista = new MiembroClub[]{
                new MiembroClub("Facundo Alvarado", "Estudiante", "Programación y publicación", "linkedin.com/in/facundoalvarado9", R.drawable.pepa_img),
                new MiembroClub("Aaron Gelves", "Estudiante", "Investigación", "", R.drawable.aaron_img),
                new MiembroClub("Juan José Muñoz Viejo", "Estudiante", "Diseño e Investigación", "", R.drawable.juanjo_img),
                new MiembroClub("Bryan Casella", "Estudiante", "Investigación", "", R.drawable.bryan_img),
                new MiembroClub("Julián Bringas", "Estudiante", "Investigación", "", R.drawable.julian_img),
                new MiembroClub("Elaine Soria", "Estudiante", "Investigación", "", R.drawable.elaine_img),
                new MiembroClub("Federico Vargas", "Estudiante", "Investigación y redacción", "", R.drawable.fede_img),
                new MiembroClub("Aluen Ruiz", "Estudiante", "Investigación", "", R.drawable.aluen_img),
                new MiembroClub("Sabrina Vay", "Estudiante", "Investigación", "", R.drawable.sabrina_img),
                new MiembroClub("Lucas Oyarzo", "Estudiante", "Investigación", "", R.drawable.blank_tall),
                new MiembroClub("Jesús Ruiz", "Estudiante", "Investigación", "", R.drawable.blank_tall),
                new MiembroClub("Juan Pablo Tomatis", "Profesor y Veterinario", "Agradecimiento por el gran aporte al proyecto.", "", R.drawable.blank_tall),
                new MiembroClub("Silvia Caticura", "Profesora", "Acompañante", "", R.drawable.blank_tall),
                new MiembroClub("Nelly Guenchur", "Profesora", "Acompañante", "", R.drawable.blank_tall),
                new MiembroClub("Pablo Paiva", "Profesor", "Acompañante", "", R.drawable.blank_tall),
        };

        listaMiembros.addAll(Arrays.asList(lista));

        mAdapter = new CreditosAdapter(getActivity(), listaMiembros);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }
}
