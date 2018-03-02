package l8.brainfriendly.classexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
        RecyclerView recyclerView = findViewById(R.id.ensayosRecyclerView);

        List<Ensayo> ensayos = obtenerEnsayos();
        MyExercise1Adapter adapter = new MyExercise1Adapter(ensayos);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Ensayo> obtenerEnsayos() {
        List<Ensayo> ensayos = new ArrayList<>();
        Ensayo ensayo1 = new Ensayo();
        ensayo1.setTitulo("Ensayo 1");
        ensayo1.setSubtitulo("Subtitulo 1");
        Ensayo ensayo2 = new Ensayo();
        ensayo2.setTitulo("Ensayo 2");
        ensayo2.setSubtitulo("Subtitulo 2");
        Ensayo ensayo3 = new Ensayo();
        ensayo3.setTitulo("Ensayo 3");
        ensayo3.setSubtitulo("Subtitulo 3");
        Ensayo ensayo4 = new Ensayo();
        ensayo4.setTitulo("Ensayo 4");
        ensayo4.setSubtitulo("Subtitulo 4");
        Ensayo ensayo5 = new Ensayo();
        ensayo5.setTitulo("Ensayo 5");
        ensayo5.setSubtitulo("Subtitulo 5");
        Ensayo ensayo6 = new Ensayo();
        ensayo6.setTitulo("Ensayo 6");
        ensayo6.setSubtitulo("Subtitulo 6");
        Ensayo ensayo7 = new Ensayo();
        ensayo7.setTitulo("Ensayo 7");
        ensayo7.setSubtitulo("Subtitulo 7");

        ensayos.add(ensayo1);
        ensayos.add(ensayo2);
        ensayos.add(ensayo3);
        ensayos.add(ensayo4);
        ensayos.add(ensayo5);
        ensayos.add(ensayo6);
        ensayos.add(ensayo7);
        return ensayos;
    }
}
