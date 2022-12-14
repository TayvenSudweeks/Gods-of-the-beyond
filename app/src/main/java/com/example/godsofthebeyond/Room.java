package com.example.godsofthebeyond;

import java.util.Random;

public class Room {

    private String roomName;
    private String roomType;
    private String roomChoices;
    private String roomText;
    private boolean fight;
    private boolean bossFight;
    String roomOutcome1;
    String roomOutcome2;
    private int roomProgress;
    private final int ROOM_CLEAR = 1;
    Monster[] monsters = new Monster[4];
    Monster chosenMonster;
    private boolean fightStart = true;
    private int badOption;
    Fight battle = new Fight();

    public int getBadOption(){

        return badOption;

    }

    public void setRoomProgress(int roomProgress) {
        this.roomProgress = roomProgress;
    }

    public void setFinalBoss(){
        chosenMonster = new Monster("astoth");
    }

    public boolean isBossFight() {
        return bossFight;
    }

    public void setMonsters(){

        monsters[0] = new Monster("goblin");
        monsters[1] = new Monster("kobold");
        monsters[2] = new Monster("amogus");
        if(roomName == "garden"){

            monsters[3] = new Monster("overgrowth");

        }
        else if(roomName == "catacombs"){

            monsters[3] = new Monster("skeleton");

        }
        else if(roomName == "belfry"){

            monsters[3] = new Monster("gargoyle");

        }
        else if(roomName == "prison"){

            monsters[3] = new Monster("oozing slime");

        }

        Random random = new Random();
        chosenMonster = monsters[random.nextInt(4)];
        fightStart = false;

    }

    public void setBosses(){

        monsters[0] = new Monster("mass of vines");
        monsters[1] = new Monster("cult leader");
        monsters[2] = new Monster("eldritch draugr");
        monsters[3] = new Monster("jailer");

        if(roomName == "garden"){

            chosenMonster = monsters[0];

        }
        else if(roomName == "belfry"){

            chosenMonster = monsters[1];

        }
        else if(roomName == "catacombs"){

            chosenMonster = monsters[2];

        }
        else if(roomName == "prison"){

            chosenMonster = monsters[3];

        }
        fightStart = false;

    }

    public String getMonsterStats(){

        String chosenMonsterStats = chosenMonster.getMonsterName() + "\n" +
                chosenMonster.getCurrReso() + "/" + chosenMonster.getMaxReso();

        return chosenMonsterStats;

    }

    public boolean getFightStart(){

        return fightStart;

    }

    public void setFightStart(boolean fightStart) {

        this.fightStart = fightStart;

    }

    public String getRoomName() {

        return roomName;

    }

    public boolean getFight(){

        return fight;

    }

    public Monster getChosenMonster() {
        return chosenMonster;
    }

    public void setRoomName(String roomName) {

        this.roomName = roomName;

    }

    public String getRoomText() {
        return roomText;
    }

    public int getRoomProgress() {
        return roomProgress;
    }

    public String getRoomChoices() {
        return roomChoices;
    }

    public void setFight(boolean fight) {
        this.fight = fight;
    }

    public void runEvent() {

        badOption = 0;
        if (roomName == "garden") {
            if (roomProgress == ROOM_CLEAR) {
                this.roomText = "A deep rumbling echoes throughout the garden, shaking your party's feet. Each member turns to battle the threat, but their enemy is the earth itself! " + "\n" +
                        "Long, thick vines sprout from every direction, swinging at each of you. In one of it's sickly green vines is a key made of rotten foliage and flesh. You ready your weapons! ";
                this.roomType = "garden";
                this.fight = true;
                this.bossFight = true;
                this.roomProgress++;
            } else if (roomProgress < ROOM_CLEAR){
                int newRoom = new Random().nextInt(3);
                switch (newRoom) {
                    case 0: {
                        this.roomText = "You find yourself in an open courtyard, enclosed by endless swathes of foliage. A single apple sits carefully placed on an altar. ";
                        this.roomChoices = "1: Split and eat the apple. 2: Ignore it and move on.";
                        this.roomType = "garden";
                        this.fight = false;
                        this.roomOutcome1 = "Your party feels strangely invigorated, ready to face the oncoming dangers. ";
                        this.roomOutcome2 = "You cautiously walk around the dubious apple, and suddenly step into a trap!";
                        this.badOption = 2;
                        break;
                    }
                    case 1: {
                        this.roomText = "You come across a monster! ";
                        this.roomType = "garden";
                        this.fight = true;
                        this.bossFight = false;
                        break;
                    }
                    case 2: {
                        this.roomText = "A sudden flash of lightning strikes a nearby tree, causing it to fall towards you! ";
                        this.roomChoices = "1: Jump out of the way. 2: Try to break the tree before it hits you.";
                        this.roomOutcome1 = "You barely get out of the way in time, coming out unscathed.";
                        this.roomOutcome2 = "Well that was a bit stupid. You take a decent hit, but you're still okay.";
                        this.roomType = "garden";
                        break;
                    }
                }
            }
        } else if (roomName == "prison") {
            //starts boss fight
            if (roomProgress == ROOM_CLEAR) {
                this.roomText = "A rattling chain sounds through the prison, clanging metal against metal, and a slow, methodical stomp." + "\n" +
                        "A dark figure starts to take form through the haze, a massive humanoid with chains leaking out of his cracked skin. " +
                        "In his thick, calloused hands, he holds what appears to be a grotesque version of a jailer's key, pulsating with dark power. " +
                        "'Escapees must be punished,' he grumbles in a low, husky voice, as he raises his arm to swing.";
                this.roomType = "prison";
                this.fight = true;
                this.bossFight = true;
            } else if(roomProgress < ROOM_CLEAR){
                int newRoom = new Random().nextInt(3);
                switch (newRoom) {
                    case 0: {
                        this.roomText = "Your party is stumbling through the dark, concrete pathways of the prison," + "\n" +
                                "when a deep haunted moaning echoes through the bars.";
                        this.roomType = "prison";
                        this.roomChoices = "1. Approach the voice. 2. Ignore it and move on.";
                        this.fight = false;
                        this.roomOutcome1 = "The voice grows louder and louder as you approach it, and you begin to understand its ramblings. " + "\n" +
                                "'YOU FOOLS! HOW COULD YOU BE SO IGNORANT!' Terrified, you run, and your resolution begins to waver.";
                        this.roomOutcome2 = "You block the noise from your mind, trekking onward.";
                        this.badOption = 1;
                        break;
                    }
                    case 1: {
                        this.roomText = "You come across a monster! ";
                        this.roomType = "prison";
                        this.fight = true;
                        this.bossFight = false;
                        break;
                    }
                    case 2: {
                        this.roomText = "You find a pair of handcuffs hanging on the wall, the keys nowhere to be seen. ";
                        this.roomChoices = "1. Take the handcuffs for future use. 2. Press forward without them.";
                        this.roomType = "prison";
                        this.roomOutcome1 = "As soon as your hand touches the hanging cuffs, a chill runs down your spine. The sound of chains can be heard far off." + "\n" +
                                "Wails and moans ring in your ears, and the entire prison resonates with an ethereal fever. It shows no signs of stopping." + "\n" + "" +
                                "Your decision will haunt you for a while.";
                        this.roomOutcome2 = "The handcuffs seems icy, and, too afraid to touch them, you move on.";
                        this.fight = false;
                        this.badOption = 1;
                        break;
                    }
                }
            }
        } else if (roomName == "belfry") {
            //starts boss fight
            this.roomType = "belfry";
            if (roomProgress == ROOM_CLEAR) {
                this.roomText = "From the main tower, you hear a deep chanting rise in volume. The bricks around you begin to crumble and break, and the ground beneath your feet shakes violently." +
                        "You venture towards the ever growing sound, as your path becomes less and less stable. As you enter the tower, the voice suddenly stops, and all goes silent." +
                        "A slender hooded figure slowly rises and turns toward you, a wicked grin painted across his face.. 'You will come to learn the true extent of your mistake.' He states, softly yet with a deafening power." +
                        "Behind him sits a small key, otherwise unguarded. You ready your weapons!";
                this.fight = true;
                this.bossFight = true;
            } else if (roomProgress < ROOM_CLEAR){
                int newRoom = new Random().nextInt(3);
                switch (newRoom) {
                    case 0: {
                        this.roomText = "You come across a massive extravagant bell hanging over your head. The clapper drapes below, just within reach.";
                        this.roomChoices = "1: Ring the bell. 2: Leave it be.";
                        this.badOption = 1;
                        this.fight = false;
                        this.roomOutcome1 = "You pull hard on the rope, and a perfectly pitched ring resonates across the entire church. You can't have been the only one to hear that. A monster appears!";
                        this.roomOutcome2 = "You stare in awe, careful not to touch this wonderful work of art.";
                        break;
                    }
                    case 1: {
                        this.roomText = "A fight starts!";
                        this.fight = true;
                        this.bossFight = false;
                        break;
                    }
                    case 2: {
                        this.roomText = "A set of chimes plays gently in the wind.";
                        this.roomChoices = "1: Stay and listen. 2. Break the chimes.";
                        this.badOption = 1;
                        this.roomOutcome1 = "The chimes play a comforting and enchanting tune, comforting you. You feel yourself drift off..." + "\n" +
                                "You startle awake at the sound of a monster approaching. You're surrounded!";
                        this.roomOutcome2 = "The chimes clang loudly to the ground, the melody carried away by the wind.";
                        this.fight = false;
                        break;
                    }
                }
            }
        } else if (roomName == "catacombs") {
            this.roomType = "catacombs";
            if (roomProgress == ROOM_CLEAR) {
                this.roomText = "";
                this.fight = true;
                this.bossFight = true;
            } else if(roomProgress < ROOM_CLEAR){
                int newRoom = new Random().nextInt(3);
                switch (newRoom) {
                    case 0: {
                        this.roomText = "The torches flicker wildly on the walls, putting you in a hypnotic trance.";
                        this.roomChoices = "1: Put out the torches. 2: Shake yourself awake.";
                        this.badOption = 1;
                        this.roomOutcome1 = "";
                        this.roomOutcome2 = "";
                        this.fight = false;
                        break;
                    }
                }
            }
        }
    }
}