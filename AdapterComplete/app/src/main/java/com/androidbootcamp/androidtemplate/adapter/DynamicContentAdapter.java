package com.androidbootcamp.androidtemplate.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidbootcamp.androidtemplate.R;
import com.androidbootcamp.androidtemplate.interfaces.MyInterface;
import com.androidbootcamp.androidtemplate.model.Pokemon;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Eduardo Medina
 */

public class DynamicContentAdapter extends RecyclerView.Adapter<DynamicContentAdapter.ViewHolder>{

    private final LinkedList<String> words;
    private final Context context;

    public DynamicContentAdapter(Context context,LinkedList<String> words) {
        this.words = words;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_word, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        // - replace the contents of the view with that element
        String word= words.get(position);
        holder.textViewWord.setText(word);
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textViewWord;
        public View view;

        public ViewHolder(View  v) {
            super(v);
            this.view = v;
            textViewWord= v.findViewById(R.id.textViewWord);
        }
    }
}
