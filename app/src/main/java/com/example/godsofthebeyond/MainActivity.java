package com.example.godsofthebeyond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String options;
    public String input;
    EditText etInput;
    TextView output, tvOptions, char1, char2, char3;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnInit();

    }

    public void OnInit(){
        output = findViewById(R.id.tvOutput);
        tvOptions = findViewById(R.id.tvOptions);
        char1 = findViewById(R.id.tvChar1);
        char2 = findViewById(R.id.tvChar2);
        char3 = findViewById(R.id.tvChar3);
        etInput = findViewById(R.id.etInput);
        game = new Game();
    }

    public void SubmitText(View view){
        input = etInput.getText().toString().toLowerCase();

    }



}