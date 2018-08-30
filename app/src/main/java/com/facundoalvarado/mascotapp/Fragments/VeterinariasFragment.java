package com.facundoalvarado.mascotapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facundoalvarado.mascotapp.MainActivity;
import com.facundoalvarado.mascotapp.R;
import com.facundoalvarado.mascotapp.VeterinariasActivity;

public class VeterinariasFragment extends Fragment {

    public VeterinariasFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  rootView = inflater.inflate(R.layout.fragment_veterinarias, container, false);

        Button btnMapa = (Button) rootView.findViewById(R.id.btnMapa);

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), VeterinariasActivity.class);
                startActivity(intent);
            }
        });


        return rootView;
    }


}
