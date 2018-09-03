package com.facundoalvarado.mascotapp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facundoalvarado.mascotapp.Adapters.EnfermedadesAdapter;
import com.facundoalvarado.mascotapp.Data.Enfermedad;
import com.facundoalvarado.mascotapp.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnfermedadesFragment extends Fragment {

    public EnfermedadesFragment() {
    }

//    Definiendo recursos
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    private List<Enfermedad> listaEnfermedades;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_enfermedades, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.enfermedadesRecycler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        listaEnfermedades = new ArrayList<>();

        Enfermedad[] lista = new Enfermedad[] {
                new Enfermedad(R.string.enf_nm_0, R.string.enf_anim_0, R.string.enf_origen_0, R.string.enf_prev_0, R.string.enf_sintomas_0, R.string.enf_trat_0),
                new Enfermedad(R.string.enf_nm_1, R.string.enf_anim_1, R.string.enf_origen_1, R.string.enf_prev_1, R.string.enf_sintomas_1, R.string.enf_trat_1),
                new Enfermedad(R.string.enf_nm_2, R.string.enf_anim_2, R.string.enf_origen_2, R.string.enf_prev_2, R.string.enf_sintomas_2, R.string.enf_trat_2),
                new Enfermedad(R.string.enf_nm_3, R.string.enf_anim_3, R.string.enf_origen_3, R.string.enf_prev_3, R.string.enf_sintomas_3, R.string.enf_trat_3),
                new Enfermedad(R.string.enf_nm_4, R.string.enf_anim_4, R.string.enf_origen_4, R.string.enf_prev_4, R.string.enf_sintomas_4, R.string.enf_trat_4),
                new Enfermedad(R.string.enf_nm_5, R.string.enf_anim_5, R.string.enf_origen_5, R.string.enf_prev_5, R.string.enf_sintomas_5, R.string.enf_trat_5),
                new Enfermedad(R.string.enf_nm_6, R.string.enf_anim_6, R.string.enf_origen_6, R.string.enf_prev_6, R.string.enf_sintomas_6, R.string.enf_trat_6),
                new Enfermedad(R.string.enf_nm_7, R.string.enf_anim_7, R.string.enf_origen_7, R.string.enf_prev_7, R.string.enf_sintomas_7, R.string.enf_trat_7),
                new Enfermedad(R.string.enf_nm_8, R.string.enf_anim_8, R.string.enf_origen_8, R.string.enf_prev_8, R.string.enf_sintomas_8, R.string.enf_trat_8),
                new Enfermedad(R.string.enf_nm_9, R.string.enf_anim_9, R.string.enf_origen_9, R.string.enf_prev_9, R.string.enf_sintomas_9, R.string.enf_trat_9),
                new Enfermedad(R.string.enf_nm_0, R.string.enf_anim_10, R.string.enf_origen_10, R.string.enf_prev_10, R.string.enf_sintomas_10, R.string.enf_trat_10),
                new Enfermedad(R.string.enf_nm_11, R.string.enf_anim_11, R.string.enf_origen_11, R.string.enf_prev_11, R.string.enf_sintomas_11, R.string.enf_trat_11),
                new Enfermedad(R.string.enf_nm_12, R.string.enf_anim_12, R.string.enf_origen_12, R.string.enf_prev_12, R.string.enf_sintomas_12, R.string.enf_trat_12),
                new Enfermedad(R.string.enf_nm_13, R.string.enf_anim_13, R.string.enf_origen_13, R.string.enf_prev_13, R.string.enf_sintomas_13, R.string.enf_trat_13),
                new Enfermedad(R.string.enf_nm_14, R.string.enf_anim_14, R.string.enf_origen_14, R.string.enf_prev_14, R.string.enf_sintomas_14, R.string.enf_trat_14),
                new Enfermedad(R.string.enf_nm_15, R.string.enf_anim_15, R.string.enf_origen_15, R.string.enf_prev_15, R.string.enf_sintomas_15, R.string.enf_trat_15),
                new Enfermedad(R.string.enf_nm_16, R.string.enf_anim_16, R.string.enf_origen_16, R.string.enf_prev_16, R.string.enf_sintomas_16, R.string.enf_trat_16),
                new Enfermedad(R.string.enf_nm_17, R.string.enf_anim_17, R.string.enf_origen_17, R.string.enf_prev_17, R.string.enf_sintomas_17, R.string.enf_trat_17),
                new Enfermedad(R.string.enf_nm_18, R.string.enf_anim_18, R.string.enf_origen_18, R.string.enf_prev_18, R.string.enf_sintomas_18, R.string.enf_trat_18),
                new Enfermedad(R.string.enf_nm_19, R.string.enf_anim_19, R.string.enf_origen_19, R.string.enf_prev_19, R.string.enf_sintomas_19, R.string.enf_trat_19),
                new Enfermedad(R.string.enf_nm_20, R.string.enf_anim_20, R.string.enf_origen_20, R.string.enf_prev_20, R.string.enf_sintomas_20, R.string.enf_trat_20),
                new Enfermedad(R.string.enf_nm_21, R.string.enf_anim_21, R.string.enf_origen_21, R.string.enf_prev_21, R.string.enf_sintomas_21, R.string.enf_trat_21),
                new Enfermedad(R.string.enf_nm_22, R.string.enf_anim_22, R.string.enf_origen_22, R.string.enf_prev_22, R.string.enf_sintomas_22, R.string.enf_trat_22),
                new Enfermedad(R.string.enf_nm_23, R.string.enf_anim_23, R.string.enf_origen_23, R.string.enf_prev_23, R.string.enf_sintomas_23, R.string.enf_trat_23),
                new Enfermedad(R.string.enf_nm_24, R.string.enf_anim_24, R.string.enf_origen_24, R.string.enf_prev_24, R.string.enf_sintomas_24, R.string.enf_trat_24),
                new Enfermedad(R.string.enf_nm_25, R.string.enf_anim_25, R.string.enf_origen_25, R.string.enf_prev_25, R.string.enf_sintomas_25, R.string.enf_trat_25),
                new Enfermedad(R.string.enf_nm_26, R.string.enf_anim_26, R.string.enf_origen_26, R.string.enf_prev_26, R.string.enf_sintomas_26, R.string.enf_trat_26),
                new Enfermedad(R.string.enf_nm_27, R.string.enf_anim_27, R.string.enf_origen_27, R.string.enf_prev_27, R.string.enf_sintomas_27, R.string.enf_trat_27),
                new Enfermedad(R.string.enf_nm_28, R.string.enf_anim_28, R.string.enf_origen_28, R.string.enf_prev_28, R.string.enf_sintomas_28, R.string.enf_trat_28),
                new Enfermedad(R.string.enf_nm_29, R.string.enf_anim_29, R.string.enf_origen_29, R.string.enf_prev_29, R.string.enf_sintomas_29, R.string.enf_trat_29),
        };

        listaEnfermedades.addAll(Arrays.asList(lista));

        mAdapter = new EnfermedadesAdapter(getActivity(), listaEnfermedades);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
