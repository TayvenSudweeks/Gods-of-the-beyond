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
    Character character1, character2, character3;
    Database database = new Database();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnInit();
        database.createAllWeapons();
        System.out.println(database.checkWorkingWeapon("hunter", "mercenary", "knight").toString());
    }

    public void OnInit(){
        output = findViewById(R.id.tvOutput);
        tvOptions = findViewById(R.id.tvOptions);
        char1 = findViewById(R.id.tvChar1);
        char2 = findViewById(R.id.tvChar2);
        char3 = findViewById(R.id.tvChar3);
        etInput = findViewById(R.id.etInput);
        character1 = new Character();
        database = new Database();
    }

    public void makeCharacter(){

    }

    public void gameStart(){


    }

    public void SubmitText(View view){
        input = etInput.getText().toString().toLowerCase();

    }



}