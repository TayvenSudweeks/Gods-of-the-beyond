package com.example.godsofthebeyond;

import java.util.Random;

public class Database {

    Weapon[] weapons = new Weapon[25];
    Armor[] armors = new Armor[15];
    Monster[] monsters = new Monster[11];
    Monster finalBoss = new Monster("astoth");

    public void createAllWeapons(){

        weapons[0] = new Weapon("claymore");
        weapons[1] = new Weapon("mace");
        weapons[2] = new Weapon("kingdom key");
        weapons[3] = new Weapon("rapier");
        weapons[4] = new Weapon("axe");
        weapons[5] = new Weapon("syringe");
        weapons[6] = new Weapon("flask");
        weapons[7] = new Weapon("chemistry-inator");
        weapons[8] = new Weapon("collector's bottle");
        weapons[9] = new Weapon("reinforced canister");
        weapons[10] = new Weapon("longbow");
        weapons[11] = new Weapon("crossbow");
        weapons[12] = new Weapon("galadhrim's bow");
        weapons[13] = new Weapon("recurve bow");
        weapons[14] = new Weapon("sling");
        weapons[15] = new Weapon("throwing knife");
        weapons[16] = new Weapon("dagger");
        weapons[17] = new Weapon("hidden blade");
        weapons[18] = new Weapon("shank");
        weapons[19] = new Weapon("balisong");
        weapons[20] = new Weapon("wraps");
        weapons[21] = new Weapon("boxing gloves");
        weapons[22] = new Weapon("an echidna's gloves");
        weapons[23] = new Weapon("spiked dusters");
        weapons[24] = new Weapon("beast claws");

    }

    public void createAllArmors(){

        armors[0] = new Armor("heavy armor");
        armors[1] = new Armor("light armor");
        armors[2] = new Armor("destiny island attire");
        armors[3] = new Armor("plague mask");
        armors[4] = new Armor("steampunk hat");
        armors[5] = new Armor("pharmacist-labcoat-inator");
        armors[6] = new Armor("leather cloak");
        armors[7] = new Armor("scaled cloak");
        armors[8] = new Armor("elven cloak");
        armors[9] = new Armor("chain mail");
        armors[10] = new Armor("magic crest");
        armors[11] = new Armor("assassin robes");
        armors[12] = new Armor("white headband");
        armors[13] = new Armor("blue headband");
        armors[14] = new Armor("red spikes");

    }

    public void createAllMonsters(){
        monsters[0] = new Monster("slime");
        monsters[1] = new Monster("skeleton");
        monsters[2] = new Monster("overgrowth");
        monsters[3] = new Monster("jailer");
        monsters[4] = new Monster("goblin");
        monsters[5] = new Monster("kobold");
        monsters[6] = new Monster("eldritch draugr");
        monsters[7] = new Monster("cult leader");
        monsters[8] = new Monster("zombie");
        monsters[9] = new Monster("mass of vines");
        monsters[10] = new Monster("amogus");
    }

    public Weapon getRandomWeapon(){
        int num = new Random().nextInt(25);
        return weapons[num];
    }

    public Armor getRandomArmor(){
        int num = new Random().nextInt(15);
        return armors[num];
    }

    public Monster getRandomMonster(){
        int num = new Random().nextInt(11);
        return monsters[num];
    }

    public Weapon makeWeapon(String job1, String job2, String job3){
        Weapon reward = new Weapon();
        reward = getRandomWeapon();
        while(reward.getJobReq() != job1 && reward.getJobReq() != job2 && reward.getJobReq() != job3){
            reward = getRandomWeapon();
        }
        return reward;
    }

    public Weapon makeLegendaryWeapon(String job1, String job2, String job3){
        Weapon reward = new Weapon();
        reward = getRandomWeapon();
        while(reward.getJobReq() != job1 && reward.getJobReq() != job2 && reward.getJobReq() != job3 && !reward.isLegendary()){
            reward = getRandomWeapon();
        }
        return reward;
    }

    public Armor makeArmor(String job1, String job2, String job3){
        Armor reward = new Armor();
        reward = getRandomArmor();
        while(reward.getJobReq() != job1 && reward.getJobReq() != job2 && reward.getJobReq() != job3){
            reward = getRandomArmor();
        }
        return reward;
    }

    public Armor makeLegendaryArmor(String job1, String job2, String job3){
        Armor reward = new Armor();
        reward = getRandomArmor();
        while(reward.getJobReq() != job1 && reward.getJobReq() != job2 && reward.getJobReq() != job3 && !reward.isLegendary()){
            reward = getRandomArmor();
        }
        return reward;
    }


    public Monster makeFinalBoss(){
        return finalBoss;
    }
}