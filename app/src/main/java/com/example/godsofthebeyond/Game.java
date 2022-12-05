package com.example.godsofthebeyond;

import java.util.Locale;

public class Game {

    Character[] characters = new Character[3];
    private Database database = new Database();
    private String currentRoom;
    private String characterName;
    boolean error = false;
    private int states = 1;
    private int characterIndex = 0;
    private int gameProgress = 0;
    private int chosenChar = 0;
    private int chosenOption = 0;
    private int totalKeys = 0;
    private boolean gardenDoorOpen = true;
    private boolean catacombsDoorOpen = true;
    private boolean prisonDoorOpen = true;
    private boolean belfryDoorOpen = true;

    public int getStates() {

        return states;

    }

    public int getGameProgress() {

        return gameProgress;

    }

    public String getCurrentRoom() {

        return currentRoom;

    }

    public String gameText(){

        if(gameProgress == 0){

            if(characterIndex == 0){

                if(states == 1){

                    database.createAllWeapons();
                    database.createAllArmors();
                    database.createAllMonsters();
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
        else if(gameProgress == 1){

            return "Your party makes it to the front of the church. " + characters[1].name + " feels a chill run down their spine as they enter the building. " +
                    "It is dark and clammy, with one torch faintly glowing near a set of doors at the back of the foyer. The middle door is noticeably larger than the others, " +
                    "and it's clear that it's more important. " + characters[2].name + " walks up to the door and tests the handle, bracing in case of a trap. " +
                    "No traps are activated, yet the door stays shut. As they look around, they notice four keyholes, each with a symbol that corresponds to one on each of the other doors. " +
                    "Which do you enter first?";
        }
        return null;

    }

    public String choicesText(){

        if(gameProgress == 0){

            if(states == 1){

                return "Enter a name.";

            }
            else{

                return "1: Knight  2: Mercenary  3: Alchemist" + "\n" + "4: Hunter  5: Grappler";

            }

        }
        else if(gameProgress == 1){

            int totalDoors = 1;
            String doorsOpen = "";
            if(gardenDoorOpen){

                doorsOpen += totalDoors + ": Apple  ";
                totalDoors++;

            }
            if(catacombsDoorOpen){

                doorsOpen += totalDoors + ": Coffin  ";
                totalDoors++;

            }
            if(prisonDoorOpen){

                doorsOpen += totalDoors + ": Shackles  ";
                totalDoors++;

            }
            if(belfryDoorOpen){

                doorsOpen += totalDoors + ": Bell";

            }
            return doorsOpen;

        }
        return null;

    }

    //Always call first, as it is what dictates what happens next.
    public void gameEvents(String input){

        if(gameProgress == 0){

            if(states == 1){

                this.characterName = input;
                states++;
            }
            else{

                try {
                    JobNames.valueOf(input);
                } catch(Exception e) {
                    error = true;
                    return;
                }

                //Converts into Enum values
                if(JobNames.valueOf(input).toString() == "knight" ||JobNames.valueOf(input).toString() == "hunter" || JobNames.valueOf(input).toString() == "mercenary" || JobNames.valueOf(input).toString() == "alchemist" || JobNames.valueOf(input).toString() == "grappler"){
                    characters[characterIndex] = new Character(this.characterName, JobNames.valueOf(input).toString());
                    System.out.println(characters[characterIndex].toString());
                    states = 1;
                    if(characterIndex <= 1){

                        characterIndex++;

                    }
                    else{

                        //characterIndex = 0;
                        gameProgress++;
                        characterIndex++;

                    }

                }
                else{

                    error = true;

                }

            }

        }
        else if(gameProgress == 1){

            if(totalKeys == 4){

                gameProgress = 4;

            }

            String[] rooms = new String[4];

        }

    }

    public int getCharacterIndex() {

        return characterIndex;

    }
}
