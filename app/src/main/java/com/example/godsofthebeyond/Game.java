package com.example.godsofthebeyond;

import java.util.Locale;
import java.util.Random;

public class Game {

    Character[] characters = new Character[3];
    private Database database = new Database();
    private Room currentRoom = new Room();
    private String characterName;
    boolean error = false;
    int[] characterJobs = new int[3];
    private int states = 1;
    private int characterIndex = 0;
    private int gameProgress = 0;
    private int chosenChar = 0;
    private String chosenRoom;
    private int totalKeys = 0;
    private int totalDoors = 0;
    private boolean gardenDoorOpen = true;
    private boolean catacombsDoorOpen = true;
    private boolean prisonDoorOpen = true;
    private boolean belfryDoorOpen = true;
    private int chosenBattleOption;
    private int turn = 1;
    private boolean firstTime = true;
    boolean gameOver;
    private String rewardType;
    Weapon rewardWeapon = new Weapon();
    Armor rewardArmor = new Armor();

    public int getStates() {

        return states;

    }

    public int getGameProgress() {

        return gameProgress;

    }

    public Room getCurrentRoom() {

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

            if(firstTime) {
                firstTime = false;
                return "Your party makes it to the front of the church. " + characters[1].name + " feels a chill run down their spine as they enter the building. " +
                        "It is dark and clammy, with one torch faintly glowing near a set of doors at the back of the foyer. The middle door is noticeably larger than the others, " +
                        "and it's clear that it's more important. " + characters[2].name + " walks up to the door and tests the handle, bracing in case of a trap. " +
                        "No traps are activated, yet the door stays shut. As they look around, they notice four keyholes, each with a symbol that corresponds to one on each of the other doors. " +
                        "Which do you enter first?";
            }
            else{
                return "You've made it back to the foyer. Where do you go next?";
            }
        }
        else if(gameProgress == 2){

            String totalText;
            totalText = currentRoom.getRoomText();
            if(states == 2){

                String rewardText = "You Win!" + "\n" + "\n" + " You found a ";
                if(rewardType == "weapon"){

                    rewardText += rewardWeapon.getWeaponName() + " for a " + rewardWeapon.getJobReq() + ". What do you do?";

                }
                else{

                    rewardText += rewardArmor.getName() + "for a " + rewardArmor.getJobReq() + ". What do you do?";

                }
                return rewardText;

            }
            else if(states == 3){
                totalText = currentRoom.getRoomText();
            }
            else if(currentRoom.getFight()) {

                return totalText + "\n" + "\n" + currentRoom.getMonsterStats() + "\n" + "\n" + "What does " + (characters[turn - 1].name) + " do?";

            }
            else if(!currentRoom.getFight()) {
                return totalText;
            }

            /*if(gameProgress == 3){
                return "The symbols on the final door glow softly as you turn each key in succession, and you hear a loud *clunk* as the lock that was keeping " +
                        "you out gives way. You ready yourself for the final battle and enter the ornate middle door. " + "\n" +
                        "Towering above you in a heap of flesh and grotesque pieces, stands Astoth. The behemoth had clearly been waiting for someone to approach." +
                        "Every bone in your body screams at you to get out as fast as you can, but you hold strong, knowing you are likely the last thing that stands between " +
                        "this world and oblivion. ";
            }*/

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

            String doorsOpen = "";
            if(gardenDoorOpen){

                totalDoors++;
                doorsOpen += totalDoors + ": Apple  ";

            }
            if(catacombsDoorOpen){

                totalDoors++;
                doorsOpen += totalDoors + ": Coffin  ";

            }
            if(prisonDoorOpen){

                totalDoors++;
                doorsOpen += totalDoors + ": Shackles  ";

            }
            if(belfryDoorOpen){

                totalDoors++;
                doorsOpen += totalDoors + ": Bell";

            }
            return doorsOpen;

        }
        else if(gameProgress == 2){

            if(states == 2){

                return "1: Equip It   2: Leave It";

            }
            else if(currentRoom.getFight()){

                return "1: Attack   2: Spell   3: Ability   4: Legendary";

            }
            else{

                return currentRoom.getRoomChoices();

            }

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

                try{

                    if ((characterIndex == 1 && characterJobs[0] == Integer.parseInt(input)) || (characterIndex == 2 && (Integer.parseInt(input) == characterJobs[1] || Integer.parseInt(input) == characterJobs[0]))) {

                        error = true;

                    } else if (0 < Integer.parseInt(input) && Integer.parseInt(input) < 6) {


                        switch (Integer.parseInt(input)){

                            case 1:
                                characters[characterIndex] = new Character(this.characterName, "knight");
                                break;
                            case 2:
                                characters[characterIndex] = new Character(this.characterName, "mercenary");
                                break;
                            case 3:
                                characters[characterIndex] = new Character(this.characterName, "alchemist");
                                break;
                            case 4:
                                characters[characterIndex] = new Character(this.characterName, "hunter");
                                break;
                            case 5:
                                characters[characterIndex] = new Character(this.characterName, "grappler");
                                break;
                        }
                        states = 1;
                        if (characterIndex <= 1) {

                            characterIndex++;

                        }else {

                            gameProgress++;
                            characterIndex++;

                        }

                    } else{

                        error = true;

                    }

                }catch (NumberFormatException e ){

                    error = true;

                }

            }

        }
        else if(gameProgress == 1){

            if(totalKeys == 4){

                gameProgress = 3;

            }
            else{

                int roomIndex = 0;
                String[] rooms = new String[totalDoors];
                if(gardenDoorOpen){

                    rooms[roomIndex] = "garden";
                    roomIndex++;

                }
                if(catacombsDoorOpen){

                    rooms[roomIndex] = "catacombs";
                    roomIndex++;

                }
                if(prisonDoorOpen){

                    rooms[roomIndex] = "prison";
                    roomIndex++;

                }
                if(belfryDoorOpen){

                    rooms[roomIndex] = "belfry";

                }

                chosenRoom = rooms[Integer.parseInt(input) - 1];
                totalDoors = 0;
                System.out.println(chosenRoom);
                currentRoom.setRoomName(chosenRoom);
                System.out.println(currentRoom.getRoomName());
                currentRoom.setBosses();
                currentRoom.setMonsters();
                currentRoom.runEvent();
                gameProgress++;

            }

        }
        else if(gameProgress == 2){

            if(currentRoom.getFight()){

                if(currentRoom.getFightStart()){

                    if (currentRoom.isBossFight()){
                        currentRoom.setBosses();
                    }
                    else {
                        currentRoom.setMonsters();
                    }
                }
                if(turn <= 3){

                    chosenBattleOption = Integer.parseInt(input);
                    switch(chosenBattleOption) {

                        case 1:
                            currentRoom.battle.playerAttack(characters[turn - 1], currentRoom.chosenMonster);
                            turn++;
                            break;
                        case 2:
                            currentRoom.battle.playerSpell(characters[turn - 1], currentRoom.chosenMonster);
                            turn++;
                            break;
                        case 3:
                            if (characters[turn - 1].job.name == "knight") {

                                currentRoom.battle.taunt(characters[turn - 1], currentRoom.chosenMonster);

                            } else if (characters[turn - 1].job.name == "mercenary") {

                                currentRoom.battle.lockTarget(characters[turn - 1]);

                            } else if (characters[turn - 1].job.name == "alchemist") {

                                currentRoom.battle.potionHeal(characters[0], characters[1], characters[2], characters[turn - 1]);

                            } else if (characters[turn - 1].job.name == "hunter") {

                                currentRoom.battle.setTrap(characters[turn - 1], currentRoom.chosenMonster);

                            } else if (characters[turn - 1].job.name == "grappler") {

                                currentRoom.battle.suplex(characters[turn - 1], currentRoom.chosenMonster);

                            }
                            if (currentRoom.battle.spellFail) {

                                error = true;

                            } else {

                                turn++;

                            }
                            break;

                        case 4:
                            if (characters[turn - 1].getWeaponLegendary() || characters[turn - 1].getArmorLegendary()) {

                                if (characters[turn - 1].job.name == "knight") {

                                    currentRoom.battle.valorForm(characters[turn - 1]);

                                } else if (characters[turn - 1].job.name == "mercenary") {

                                    currentRoom.battle.assassinate(characters[turn - 1], currentRoom.chosenMonster);

                                } else if (characters[turn - 1].job.name == "alchemist") {

                                    currentRoom.battle.strengthInator(characters[0], characters[1], characters[2], characters[turn - 1]);

                                } else if (characters[turn - 1].job.name == "hunter") {

                                    currentRoom.battle.herbalBrew(characters[turn - 1], characters[0], characters[1], characters[2]);

                                } else if (characters[turn - 1].job.name == "grappler") {

                                    currentRoom.battle.sevenEmeralds(characters[turn - 1]);

                                }

                                if (!currentRoom.battle.spellFail) {

                                    error = true;

                                } else {

                                    turn++;

                                }
                            } else {

                                error = true;

                            }
                            break;
                    }
                }
                if(currentRoom.getChosenMonster().dead){

                    currentRoom.setFight(false);
                    currentRoom.setFightStart(true);
                    int reward = new Random().nextInt(2);
                    if(reward == 0){

                        this.rewardType = "armor";
                        Armor loot;

                        if(currentRoom.chosenMonster.isBoss()){

                            loot = database.makeLegendaryArmor(characters[0].job.name, characters[1].job.name, characters[2].job.name);

                        }else{

                            loot = database.makeArmor(characters[0].job.name, characters[1].job.name, characters[2].job.name);

                        }

                        this.rewardArmor = loot;

                    }
                    else{

                        this.rewardType = "weapon";
                        Weapon loot;

                        if(currentRoom.chosenMonster.isBoss()){

                            loot = database.makeLegendaryWeapon(characters[0].job.name, characters[1].job.name, characters[2].job.name);

                        }else{

                            loot = database.makeWeapon(characters[0].job.name, characters[1].job.name, characters[2].job.name);

                        }

                        this.rewardWeapon = loot;

                    }
                    if(currentRoom.chosenMonster.isBoss()){

                        totalKeys++;
                        if(currentRoom.getRoomName() == "garden"){

                            gardenDoorOpen = false;

                        }
                        else if(currentRoom.getRoomName() == "catacombs"){

                            catacombsDoorOpen = false;

                        }
                        else if(currentRoom.getRoomName() == "belfry"){

                            belfryDoorOpen = false;

                        }
                        else if(currentRoom.getRoomName() == "prison"){

                            prisonDoorOpen = false;

                        }
                        gameProgress = 1;

                    }
                    currentRoom.battle.endFight(characters[0], characters[1], characters[2]);
                    currentRoom.runEvent();
                    states++;

                }
                else{

                    int randomTarget = new Random().nextInt(3);
                    currentRoom.battle.randomMonsterAttack(currentRoom.chosenMonster, characters[randomTarget], characters[0], characters[1], characters[2]);
                    turn = 1;

                }

            }
            else{

                if(Integer.parseInt(input) == currentRoom.getBadOption()){

                    int characterHarmed = new Random().nextInt(3);
                    if (currentRoom.getRoomName() == "garden") {

                        characters[characterHarmed].setPhysDef(characters[characterHarmed].getPhysdef() - 1);
                        characters[characterHarmed].setMagDef(characters[characterHarmed].getMagDef() - 1);

                    } else if (currentRoom.getRoomName() == "belfry") {

                        currentRoom.setFight(true);

                    } else if (currentRoom.getRoomName() == "catacombs") {

                        characters[characterHarmed].setCurrSan(characters[characterHarmed].getCurrSan() - 2);

                    } else if (currentRoom.getRoomName() == "prison") {

                        characters[characterHarmed].setCurrReso(characters[characterHarmed].getCurrReso() - 2);

                    }

                }

            }
            currentRoom.runEvent();

        }
        else if(gameProgress == 3){



        }

    }

    public int getCharacterIndex() {

        return characterIndex;

    }

    public void equipReward(){

        int characterReward = 0;

        if(rewardType == "weapon"){

            for(int x = 0; x < 3; x++){

                if(characters[x].job.name.contains(rewardWeapon.getJobReq())){

                    characterReward = x;
                    break;

                }

            }
            characters[characterReward].unequipWeapon();
            characters[characterReward].equipWeapon(rewardWeapon);

        }
        else{

            for(int x = 0; x < 3; x++){

                if(characters[x].job.name.contains(rewardArmor.getJobReq())){

                    characterReward = x;
                    break;

                }

            }
            characters[characterReward].unequipArmor();
            characters[characterReward].equipArmor(rewardArmor);

        }

    }

    public String gameOver(){

        return "As your final member falls, you hear the laughter of Astoth mocking you, and the final hope of the world collapses." + "\n" +
                "THE END";
    }
}
