package l8.brainfriendly.classexercises;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyMainAdapter.MyMainAdapterInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);
        List<String> exercisesList = new ArrayList<>();
        exercisesList.add("Ejercicio 1");
        exercisesList.add("Ejercicio 2");
        exercisesList.add("Ejercicio 3");
        exercisesList.add("Ejercicio 4");
        exercisesList.add("Ejercicio 5");
        exercisesList.add("Ejercicio 6");
        exercisesList.add("Ejercicio 7");
        exercisesList.add("Ejercicio 8");
        MyMainAdapter myAdapter = new MyMainAdapter(exercisesList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.setListener(this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void openNextScreen(int position) {
        switch (position){
            case 0:
                Intent intent = new Intent(this, Exercise1Activity.class);
                startActivity(intent);
                break;
            case 1:

                break;
            case 2:

                break;
        }

    }
}
