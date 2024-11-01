package br.com.etecia.funkopop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private Context context;
    private List<Funkopops> lstFunkopops;

    public Adaptador(Context context, List<Funkopops> lstFunkopops) {
        this.context = context;
        this.lstFunkopops = lstFunkopops;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_funkopop, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modelotitulo.setText(lstFunkopops.get(position).getTitulo());
        holder.modeloimagens.setImageResource(lstFunkopops.get(position).getImagem());


    }

    @Override
    public int getItemCount() {
        return lstFunkopops.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView modelotitulo;
        ImageView modeloimagens;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            modeloimagens = itemView.findViewById(R.id.modeloimagens);
            modelotitulo = itemView.findViewById(R.id.modelotitulo);
        }
    }
}
