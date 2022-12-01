package com.example.godsofthebeyond;

public class Game {

    Character[] characters = new Character[3];
    Database database = new Database();
    int states = 1;
    int characterIndex = 0;
    int gameProgress = 0;

    public String gameText(){

        if(gameProgress == 0){

            if(characterIndex == 0){

                if(states == 1){

                    return "Your group is made up of ragtag individuals on their last hope, working for the king of Tharath. " +
                            "Your mission now is to hunt down the cultists that have recently taken up residence in one of the abandoned churches of Astoth. " +
                            "This is a bit worrisome, as Astoth was an eldritch horror from ages past, but the king is sure you lot can handle it before it gets worse. " +
                            "Speaking of, who makes up your group? Let's start with the first. What was their name?";

                }

            }

        }

    }

    public String choicesText(){



    }

    public void setCharacters(String name, String job){

            characters[characterIndex] = new Character(name, job);

    }

}
