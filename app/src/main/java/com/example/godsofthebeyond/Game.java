package com.example.godsofthebeyond;

import java.util.Locale;

public class Game {

    Character[] characters = new Character[3];
    private Database database = new Database();
    private String currentRoom;
    private String characterName;
    boolean error;
    private int states = 1;
    private int characterIndex = 0;
    private int gameProgress = 0;

    public String getCurrentRoom() {

        return currentRoom;

    }

    public String gameText(){

        if(gameProgress == 0){

            if(characterIndex == 0){

                if(states == 1){

                    return "Your group is made up of ragtag individuals on their last hope, working for the king of Tharath. " +
                            "Your mission now is to hunt down the cultists that have recently taken up residence in one of the abandoned churches of Astoth. " +
                            "This is a bit worrisome, as Astoth was an eldritch horror from ages past, but the king is sure you lot can handle it before it gets worse. " +
                            "Speaking of, who makes up your group? Let's start with the first. What was their name?";

                }
                else{

                    return "And their job?";

                }

            }
            else if(characterIndex == 1){

                if(states == 1){

                    return "And what was your second member's name?";

                }
                else{

                    return "And their job?" + "\n" + "(Can't be the same as the last.)";

                }

            }
            else if(characterIndex == 2){

                if(states == 1){

                    return "And your final member's name?";

                }
                else{

                    return "And their job?" + "\n" + "(Must be different than the others)";

                }

            }

        }
        return null;

    }

    public String choicesText(){

        if(gameProgress == 0){

            if(states == 1){

                return "Enter a name.";

            }
            else{

                return "1: Knight  2: Mercenary  3: Alchemist  4: Hunter  5: Grappler";

            }

        }
        return null;

    }

    //Always call first, as it is what dictates what happens next.
    public void gameEvents(String input){

        if(gameProgress == 0){

            if(states == 1){

                characterName = input;
                states++;

            }
            else{

                if(input.toLowerCase() == "knight" || input.toLowerCase() == "hunter" || input.toLowerCase() == "alchemist" || input.toLowerCase() == "mercenary" || input.toLowerCase() == "grappler"){

                    characters[characterIndex] = new Character(characterName, input);
                    states = 1;
                    if(characterIndex <= 1){

                        characterIndex++;

                    }
                    else{

                        characterIndex = 0;
                        gameProgress++;

                    }

                }
                else{

                    error = true;

                }

            }

        }

    }

}
