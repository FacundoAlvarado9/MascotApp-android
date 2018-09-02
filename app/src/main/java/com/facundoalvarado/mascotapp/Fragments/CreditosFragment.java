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
                new MiembroClub("Facundo Alvarado", "Estudiante", "Programador", "linkedin.com/in/facundoalvarado9", R.drawable.fotoPepa),
                new MiembroClub("Aluen Ruiz", "Estudiante", "Investigación", "lelele", R.drawable.fotoAluen),
                new MiembroClub("Aaron Gelves", "Estudiante", "Investigación", "lelele", R.drawable.fotoAaron),
                new MiembroClub("Elaine Soria", "Estudiante", "Investigación", "lelelele", R.drawable.fotoElaine),
                new MiembroClub("Federico Vargas", "Estudiante", "Investigación y redacción", "lelele", R.drawable.fotoFederico),
                new MiembroClub("Sabrina Vay", "Estudiante", "Investigación", "lelele", R.drawable.fotoSabrina),
                new MiembroClub("Juan José Muñoz Viejo", "Estudiante", "Diseño e Investigación", "lelele", R.drawable.fotoJuan),
                new MiembroClub("Bryan Casella", "Estudiante", "Investigación", "lelele", R.drawable.fotoBryan),
                new MiembroClub("Julián Bringas", "Estudiante", "Investigación", "lelele", R.drawable.fotoJulian),
                new MiembroClub("Lucas Oyarzo", "Estudiante", "Investigación", "lelele", R.drawable.fotoLucas),
                new MiembroClub("Jesús Ruiz", "Estudiante", "Investigación", "lelele", R.drawable.fotoJesus),

        };

        listaMiembros.addAll(Arrays.asList(lista));

        mAdapter = new CreditosAdapter(getActivity(), listaMiembros);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }
}
