package com.example.godsofthebeyond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    TextView output, tvOptions;
    TextView[] characterTexts;
    Game game;
    int startCharID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnInit();
        output.setText(game.gameText());
        tvOptions.setText(game.choicesText());

    }

    public void OnInit(){
        characterTexts = new TextView[3];
        output = findViewById(R.id.tvOutput);
        tvOptions = findViewById(R.id.tvOptions);
        characterTexts[0] = findViewById(R.id.tvChar1);
        characterTexts[1] = findViewById(R.id.tvChar2);
        characterTexts[2] = findViewById(R.id.tvChar3);
        etInput = findViewById(R.id.etInput);
        game = new Game();
        startCharID = 0;
    }

    public void SubmitText(View view){

        if(etInput.getText().toString().isEmpty()){

            Toast toast = Toast.makeText(getApplicationContext(), "Nothing entered.", Toast.LENGTH_SHORT);
            toast.show();

        }
        else {
            game.gameEvents(etInput.getText().toString());
            if (game.gameOver) {

                etInput.setText("");
                etInput.setEnabled(false);
                characterTexts[0].setText("");
                characterTexts[1].setText("");
                characterTexts[2].setText("");
                tvOptions.setText("");
                output.setText(game.gameOver());

            } else {
                etInput.setText("");
                updateCharacters();
                output.setText(game.gameText());
                tvOptions.setText((game.choicesText()));
                if (game.error) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter a valid input.", Toast.LENGTH_SHORT);
                    toast.show();
                    game.error = false;

                }
            }
        }
    }

    public void updateCharacters(){

        int charID = 0;
        if (game.getGameProgress() == 0) {
            while (charID < 4 && game.getCharacterIndex() != 0) {

                if (charID >= game.getCharacterIndex()) {
                    return;
                } else {
                    characterTexts[charID].setText(game.characters[charID].toString());
                    charID++;
                }
            }
        }
        else {

            while (charID < 3){

                characterTexts[charID].setText(game.characters[charID].toString());
                charID++;

            }

        }
    }

}