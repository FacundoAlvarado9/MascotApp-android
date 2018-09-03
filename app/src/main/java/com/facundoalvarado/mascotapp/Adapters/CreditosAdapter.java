package com.facundoalvarado.mascotapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.facundoalvarado.mascotapp.Data.MiembroClub;
import com.facundoalvarado.mascotapp.R;

import java.util.List;

public class CreditosAdapter extends RecyclerView.Adapter<CreditosAdapter.ViewHolder> {

    private Context mContext;
    private List<MiembroClub> mListaMiembros;

    public CreditosAdapter(Context context, List<MiembroClub> listaMiembros){
        this.mContext = context;
        this.mListaMiembros = listaMiembros;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_creditos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CreditosAdapter.ViewHolder holder, int position) {
        MiembroClub item = mListaMiembros.get(position);

//        inflando views
        holder.nombreApellido.setText(item.getNombreApellido());
        holder.ocupacion.setText(item.getOcupacion());
        holder.tarea.setText(item.getTarea());
        holder.socialLink.setText(item.getSocialLink());
        holder.img.setImageResource(item.getImg());
    }

    @Override
    public int getItemCount() {
        return mListaMiembros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nombreApellido, ocupacion, tarea, socialLink;
        public ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);

            nombreApellido = (TextView) itemView.findViewById(R.id.nombreApellido);
            ocupacion = (TextView) itemView.findViewById(R.id.ocupacion);
            tarea = (TextView) itemView.findViewById(R.id.tarea);
            socialLink = (TextView) itemView.findViewById(R.id.socialLink);
            img = (ImageView) itemView.findViewById(R.id.imgPersona);
        }
    }
}
