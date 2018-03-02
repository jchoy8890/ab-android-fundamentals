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

public class MyMainAdapter extends RecyclerView.Adapter<MyMainAdapter.MyViewHolder> {

    private final List<String> exercises;
    private MyMainAdapterInterface listener;

    public MyMainAdapter(List<String> exercises) {
        this.exercises = exercises;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_exercise, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        String exercise = exercises.get(position);
        holder.exerciseTexView.setText(exercise);
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.openNextScreen(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }

    public void setListener(MyMainAdapterInterface myMainAdapterInterface){
        listener = myMainAdapterInterface;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView exerciseTexView;
        View container;

        MyViewHolder(View view) {
            super(view);
            exerciseTexView = view.findViewById(R.id.exerciseTextView);
            container = view.findViewById(R.id.container);
        }
    }

    interface MyMainAdapterInterface {
        void openNextScreen(int position);
    }
}
