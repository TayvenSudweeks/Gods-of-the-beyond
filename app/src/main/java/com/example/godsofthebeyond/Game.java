package com.example.godsofthebeyond;

public class Game {

    Character[] characters = new Character[3];
    Database database = new Database();
    int gameProgress = 0;

    public void setCharacters(String name, String job, int characterID){

        if(gameProgress == 0){

            characters[characterID] = new Character(name, job);

        }

    }

}
