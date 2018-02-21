package com.androidbootcamp.androidtemplate;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.androidbootcamp.androidtemplate.adapter.PokemonAdapter;
import com.androidbootcamp.androidtemplate.data.PokemonData;
import com.androidbootcamp.androidtemplate.events.ClickListener;
import com.androidbootcamp.androidtemplate.events.RecyclerTouchListener;
import com.androidbootcamp.androidtemplate.interfaces.MyInterface;
import com.androidbootcamp.androidtemplate.interfaces.OnItemClickListener;
import com.androidbootcamp.androidtemplate.model.Pokemon;

import java.util.List;

public class PokemonListActivity extends BaseActivity  {

    private final int DEFAULT_SPANCOUNT=3;
    private RecyclerView recyclerViewPokemon;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Pokemon> pokemonList;
    private PokemonAdapter pokemonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_list);
        ui();

        loadPokemonData();
    }

    private void renderPokemons(){
        pokemonAdapter = new PokemonAdapter(this,pokemonList);
        //pokemonAdapter.setOnItemClickListener(this);

        recyclerViewPokemon.setAdapter(pokemonAdapter);
    }

    private void loadPokemonData() {
        pokemonList= new PokemonData().generate();
        renderPokemons();
    }

    private void ui() {
        enabledBack();

        recyclerViewPokemon= (RecyclerView)findViewById(R.id.recyclerViewPokemon);
        //mLayoutManager= new LinearLayoutManager(this);//,LinearLayoutManager.VERTICAL,)
        mLayoutManager = new GridLayoutManager(this,DEFAULT_SPANCOUNT);
        recyclerViewPokemon.setLayoutManager(mLayoutManager);

        //events
        recyclerViewPokemon.addOnItemTouchListener(new RecyclerTouchListener(this, recyclerViewPokemon, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                if(pokemonList!=null){
                    Pokemon pokemon= pokemonList.get(position);
                    goToDetails(pokemon);
                }
            }

            @Override
            public void onLongClick(View view, int position) {}
        }));
    }

    private void goToDetails(Pokemon pokemon){
        Intent intent= new Intent(this,PokemonDetailsActivity.class);
        startActivity(intent);
    }

}
