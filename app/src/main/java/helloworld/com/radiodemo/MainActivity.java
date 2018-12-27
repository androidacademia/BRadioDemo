package helloworld.com.radiodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroupGender;
    RadioButton radioButtonM,radioButtonF;
    TextView textViewOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioButtonM = findViewById(R.id.radioButtonMale);
        radioButtonF = findViewById(R.id.radioButtonFemale);
        textViewOut = findViewById(R.id.textView);
        radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id = i;
                switch (id){
                    case R.id.radioButtonMale:
                        textViewOut.setText("Male");
                        break;
                    case R.id.radioButtonFemale:
                        textViewOut.setText("Female");
                        break;

                }
            }
        });

    }
}
