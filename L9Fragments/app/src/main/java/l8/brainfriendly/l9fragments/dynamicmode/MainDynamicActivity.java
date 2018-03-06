package l8.brainfriendly.l9fragments.dynamicmode;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import l8.brainfriendly.l9fragments.FirstFragment;
import l8.brainfriendly.l9fragments.R;
import l8.brainfriendly.l9fragments.SecondFragment;

public class MainDynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dynaic);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragmentContainer, new FirstFragment());
        ft.commit();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentContainer, new SecondFragment());
                ft.commit();
            }
        });
    }
}
