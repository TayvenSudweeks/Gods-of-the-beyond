package com.example.godsofthebeyond;

import java.util.Arrays;
import java.util.Random;

public class Fight {
    private int hitChance;
    private Character first, second, third, fourth;
    private Monster mFirst, mSecond, mThird, mFourth;

    public void playerAttack(Character attacker, Monster target){
        hitChance = new Random().nextInt(attacker.getAcc());
        if(hitChance < 10){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - attacker.getPhysAtk());

        }
        if(target.getCurrReso() <= 0){
            endFight();
        }
    }

    public void monsterAttack(Monster attacker, Character target){
        hitChance = new Random().nextInt(100);
        if(hitChance < target.getEvade()){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - (attacker.getPhysAtk() - target.getPhysdef()));
            target.checkDead();
        }
    }

    public void playerSpell(Character attacker, Monster target){
        hitChance = new Random().nextInt(100);
        if(hitChance < 0){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - attacker.getMagAtk());

        }
        if(target.getCurrReso() <= 0){
            endFight();
        }
    }

    public void endFight(){

    }

    public void setTurnOrder(Character ch1, Character ch2, Character ch3, Monster m1){
        int char1 = ch1.getSpd();
        int char2 = ch2.getSpd();
        int char3 = ch3.getSpd();
        int mon1 = m1.getSpd();
        int values[] = {char1, char2, char3, mon1};
        Arrays.sort(values);
        if(values[0] == m1.getSpd()){
            this.mFourth = m1;}

    }


}
