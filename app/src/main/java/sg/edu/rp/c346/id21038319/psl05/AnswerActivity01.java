package sg.edu.rp.c346.id21038319.psl05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity01 extends AppCompatActivity {

    TextView tvAnswer;
    TextView tvAnswer2;
    TextView tvAnswer3;
    TextView tvAnswer4;
    TextView tvAnswer5;
    TextView tvAnswer6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
        tvAnswer2 = findViewById(R.id.textView2);
        tvAnswer3 = findViewById(R.id.textView3);
        tvAnswer4 = findViewById(R.id.textView4);
        tvAnswer5 = findViewById(R.id.textView5);
        tvAnswer6 = findViewById(R.id.textView6);

//        tvAnswer.setText("In second activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Module");
        String questionsSelected2 = intentReceived.getStringExtra("Name");
        int questionsSelected3 = intentReceived.getIntExtra("Year", 0);
        int questionsSelected4 = intentReceived.getIntExtra("Semester", 0);
        double questionsSelected5 = intentReceived.getDoubleExtra("Credit", 4.0);
        String questionsSelected6 = intentReceived.getStringExtra("Venue");



        tvAnswer.setText("Module Code: " + questionsSelected);
        tvAnswer2.setText("Module Name: " + questionsSelected2);
        tvAnswer3.setText("Academic Year: " + questionsSelected3);
        tvAnswer4.setText("Semester: "+ questionsSelected4);
        tvAnswer5.setText("Module Credit: "+ questionsSelected5);
        tvAnswer6.setText("Venue: " + questionsSelected6);

    }
}