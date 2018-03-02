package l8.brainfriendly.classexercises;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * @author pjohnson on 28/02/18.
 */

public class MyExercise1Adapter extends RecyclerView.Adapter<MyExercise1Adapter.MyViewHolder> {

    private final List<Ensayo> ensayos;

    public MyExercise1Adapter(List<Ensayo> exercises) {
        this.ensayos = exercises;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_exercise2, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Ensayo ensayo = ensayos.get(position);
        holder.tituloTextView.setText(ensayo.getTitulo());
        holder.subtituloTextView.setText(ensayo.getSubtitulo());
    }

    @Override
    public int getItemCount() {
        return ensayos.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tituloTextView;
        TextView subtituloTextView;
        View container;

        MyViewHolder(View view) {
            super(view);
            tituloTextView = view.findViewById(R.id.tituloTextView);
            subtituloTextView = view.findViewById(R.id.subtituloTextView);
            container = view.findViewById(R.id.container);
        }
    }

}
