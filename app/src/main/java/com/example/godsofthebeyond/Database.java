package com.example.godsofthebeyond;

import java.util.Random;

public class Database {

    private int weaponCount;
    Weapon[] weapons = new Weapon[25];


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


    public void createAllArmor(){



    }

    public Weapon getRandomWeapon(){
        int num = new Random().nextInt(25);
        return weapons[num];
    }

    public Weapon checkWorkingWeapon(String job1, String job2, String job3){
        Weapon reward = new Weapon();
        reward = getRandomWeapon();
        while(reward.getJobReq() != job1 && reward.getJobReq() != job2 && reward.getJobReq() != job3){
            reward = getRandomWeapon();
        }
        return reward;
    }

}
