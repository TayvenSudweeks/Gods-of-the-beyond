package com.example.godsofthebeyond;

import java.util.Random;

public class Room {

    String roomName;
    String roomType;
    String roomChoices;
    String roomText;
    private final int ROOM_CLEAR = 1;
    private boolean fight;
    private boolean bossFight;
    String roomOutcome1;
    String roomOutcome2;
    private int roomProgress;


    public void randomGardenRoom(){
        if(roomProgress == ROOM_CLEAR){
            this.roomText = "A deep rumbling echoes throughout the garden, shaking your party's feet. Each member turns to battle the threat, but their enemy is the earth itself! " + "\n" +
                    "Long, thick vines sprout from every direction, swinging at each of you. You ready your weapons! ";
            this.roomType = "garden";
            this.fight = true;
            this.bossFight = true;
        }else{
        int newRoom = new Random().nextInt(3);
        switch (newRoom) {
            case 0: {
                this.roomText = "You find yourself in an open courtyard, enclosed by endless swathes of foilage. A single apple sits carefully placed on an altar. ";
                this.roomChoices = "1. Split and eat the apple. 2. Ignore it and move on.";
                this.roomType = "garden";
                this.fight = false;
                this.roomOutcome1 = "Your party feels strangely invigorated, ready to face the oncoming dangers. ";
                this.roomOutcome2 = "You cautiously walk around the dubious apple, and stupidly step into a trap!";
                roomProgress++;
                break;
            }
            case 1: {
                this.roomText = "You come across a monster! ";
                this.roomType = "garden";
                this.fight = true;
                this.bossFight = false;
                roomProgress++;
                break;
            }
            case 2: {
                this.roomText = "A sudden flash of lightning strikes a nearby tree, causing it to fall towards you! ";
                this.roomChoices = "1. Jump out of the way. 2. Try to break the tree before it hits you.";
                this.roomOutcome1 = "You barely get out of the way in time, coming out unscathed.";
                this.roomOutcome2 = "Well that was a bit stupid. You take a decent hit, but you're still okay.";
                this.roomType = "garden";
                roomProgress++;
                break;
            }
        }
        }
    }

    public void randomPrisonRoom(){
        //starts boss fight
        if(roomProgress == ROOM_CLEAR){
            this.roomText = "A rattling chain sounds through the prison, clanging metal against metal, and a slow, methodical stomp." + "\n" +
                            "A dark figure starts to take form through the haze, a massive humanoid with chains leaking out of his cracked skin. " +
                            "In his thick, calloused hands, he holds what appears to be a grotesque version of a jailer's key, pulsating with dark power. " +
                            "'Escapees must be punished,' he grumbles in a low, husky voice, as he raises his arm to swing.";
            this.roomType = "prison";
            this.fight = true;
            this.bossFight = true;
        }else{
            int newRoom = new Random().nextInt(3);
            switch (newRoom) {
                case 0: {
                    this.roomText = "Your party is stumbling through the dark, concrete pathways of the prison," + "\n" +
                            "when a deep haunted moaning echoes through the bars.";
                    this.roomType = "prison";
                    this.roomChoices = "1. Approach the voice. 2. Ignore it and move on.";
                    this.fight = false;
                    this.roomOutcome1 = "The voice grows louder and louder as you approach it, and you begin to understand its ramblings. " + "\n" +
                            "'YOU FOOLS! HOW COULD YOU BE SO STUPID!' Terrified, you run, and your resolution begins to waver.";
                    this.roomOutcome2 = "You block the noise from your mind, trekking onward.";
                    roomProgress++;
                    break;
                }
                case 1: {
                    this.roomText = "You come across a monster! ";
                    this.roomType = "prison";
                    this.fight = true;
                    this.bossFight = false;
                    roomProgress++;
                    break;
                }
                case 2: {
                    this.roomText = "You find a pair of handcuffs hanging on the wall, the keys nowhere to be seen. ";
                    this.roomChoices = "1. Take the handcuffs for future use. 2. Press forward without them.";
                    this.roomType = "prison";
                    this.roomOutcome1 = "As soon as your hand touches the hanging cuffs, a chill runs down your spine. The sound of chains can be heard far off." + "\n" +
                        "Wails and moans ring in your ears, and the entire prison resonates with an ethereal fever. It shows no signs of stopping." + "\n" +  "" +
                            "Your stupid decision will stay with you for awhile.";
                    this.roomOutcome2 = "The handcuffs seems icy, and, too afraid to touch them, you move on.";
                    this.fight = false;
                    roomProgress++;
                    break;
                }
            }
        }
    }

    public void randomBelfryRoom(){
        //starts boss fight
        this.roomType = "belfry";
        if(roomProgress == ROOM_CLEAR){
            this.roomText = "From the main tower, you hear a low and methodical chanting. Guttural and malicious, it pierces the fiber of your being. " +
                    "You cautiously approach as the voice gets louder and louder. Walls begin to crumble and break around you as the vibrating becomes visceral," +
                    " tearing the place apart. As you enter the tower, the chanting stops, and the figure standing alone in the middle of the room slowly turns to you," +
                    " grinning from ear to ear. 'You will come to learn the extent of the mistake you have made today.' Behind him sits a single key. You ready for battle!";
            this.fight = true;
            this.bossFight = true;
        } else {
            int newRoom = new Random().nextInt(3);
            switch (newRoom){
                case 0: {
                    this.roomText = "A massive bell hangs overhead, the clapper lying just above your heads.";
                    this.roomChoices = "1: Pull the string, ring the bell. 2: Cut the string";
                    this.roomOutcome1 = "The bell rings loud, nearly bursting your ears. You can't have been the only one who heard that. A fight starts!";
                    this.roomOutcome2 = "The string falls to the ground, making barely a sound. ";
                    break;
                }
                case 1: {
                    this.roomText = "The wind blows through nearby chimes, giving a peaceful yet haunting melody.";
                    this.roomChoices = "1: Break the chimes. 2: Stay and listen.";
                    this.roomOutcome1 = "You can't have this much noise, so you decide to break the chimes. After a sharp clang, everything goes quiet. You feel saddened by the loss of the music.";
                    this.roomOutcome2 = "The intricate melodies take you far from this place, drifting further and further away. Your party wakes with a start, surrounded by enemies. A fight starts!";
                    break;
                }
                case 2: {
                    this.roomText = "You come across a monster!";
                    this.fight = true;
                    this.bossFight = false;
                    break;
                }
            }
            roomProgress++;
        }
    }

    public void randomCatacombsRoom(){
        this.roomType = "catacombs";
        if(roomProgress == ROOM_CLEAR) {
            this.roomText = "";
            this.fight = true;
            this.bossFight = true;
        } else {
            int newRoom = new Random().nextInt(3);
            switch (newRoom){
                case 0:{
                    this.roomText = "The torches on the wall flicker and dance, placing you in a hypnotic trance. You're beginning to fall asleep!";
                    this.roomChoices = "1: Blow out the torches to stop the hypnotism. 2: Shake yourself awake.";
                    this.roomOutcome1 = "The darkness that was barely kept at bay before now becomes suffocating, stifling every action you take. You feel as though it can't be long before you go mad.";
                    this.roomOutcome2 = "You intentionally slam yourselves into the walls, trying your hardest not to fall asleep.";
                    break;
                }
                case 1: {
                    this.roomText = "A coffin with a cracked lid lies open in an otherwise empty room.";
                    this.roomChoices = "1: Check the coffin. 2: Leave it alone.";
                    this.roomOutcome1 = "You enter the room and peer in. The coffin is completely empty, with not even a trace of something left in it. Your hair stands on end, but you're okay.";
                    this.roomOutcome2 = "You try to walk away, but your feet are glued in place. The torches begin to flicker wildly, and " +
                            "the very earth shudders, knowing something has gone horribly wrong. It ends as quickly as it began, and you attempt " +
                            "to regain your composure, but you can't help but shake at the mere thought of what that was.";
                    break;
                }
                case 2: {
                    this.roomText = "A monster appears!";
                    this.fight = true;
                    this.bossFight = false;
                    break;
                }
            }
        }
    }

}