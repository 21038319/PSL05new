package sg.edu.rp.c346.id21038319.psl05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //event handling step 1
    TextView tvQ1;
    TextView tvQ2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //event handling step 2
        tvQ1 = findViewById(R.id.buttonReveal1Q1);
        tvQ2 = findViewById(R.id.buttonReveal2Q2);


        //event handling step 3
        tvQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity01.class);
                intent.putExtra("Module", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
//                intent.putExtra("Credit", 4.0);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });

        tvQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity01.class);
                intent.putExtra("Module", "C349");
                intent.putExtra("Name", "Ipad Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4.0);
                intent.putExtra("Venue", "W65A");
                startActivity(intent);
            }
        });

    }
}