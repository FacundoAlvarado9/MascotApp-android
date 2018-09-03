package com.facundoalvarado.mascotapp.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facundoalvarado.mascotapp.Data.Enfermedad;
import com.facundoalvarado.mascotapp.R;

import java.util.List;

public class EnfermedadesAdapter extends RecyclerView.Adapter<EnfermedadesAdapter.ViewHolder> {

    private Context mContext;
    private List<Enfermedad> mListaEnfermedades;

    public EnfermedadesAdapter(Context context, List<Enfermedad> listaEnfermedades){
        this.mContext = context;
        this.mListaEnfermedades = listaEnfermedades;
    }

    @NonNull
    @Override
    public EnfermedadesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_enfermedades, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull EnfermedadesAdapter.ViewHolder holder, int position) {
        Enfermedad item =  mListaEnfermedades.get(position);

        holder.enfNombre.setText(item.getNombre());
        holder.enfAnimales.setText(mContext.getString(item.getAnimales()));
        holder.enfOrigen.setText(mContext.getString(item.getOrigen()));
        holder.enfPrevencion.setText( mContext.getString(item.getPrevencion()));
        holder.enfSintomas.setText(mContext.getString(item.getSintomas()));
        holder.enfTratamiento.setText(mContext.getString(item.getTratamiento()));
    }

    @Override
    public int getItemCount() {
        return mListaEnfermedades.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView enfNombre, enfAnimales, enfOrigen, enfPrevencion, enfSintomas, enfTratamiento;

        public ViewHolder(View itemView) {
            super(itemView);

            enfPrevencion = (TextView) itemView.findViewById(R.id.enfPrev);
            enfNombre = (TextView) itemView.findViewById(R.id.enfNombre);
            enfAnimales = (TextView) itemView.findViewById(R.id.enfAnimales);
            enfOrigen = (TextView) itemView.findViewById(R.id.enfOrigen);
            enfSintomas = (TextView) itemView.findViewById(R.id.enfSintomas);
            enfTratamiento = (TextView) itemView.findViewById(R.id.enfTratamiento);

        }
    }
}
