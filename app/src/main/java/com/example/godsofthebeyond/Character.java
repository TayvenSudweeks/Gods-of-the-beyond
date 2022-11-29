package com.example.godsofthebeyond;

import androidx.annotation.NonNull;

public class Character {

    String name;
    Job job;
    private int maxReso;
    int currReso;
    private int maxSan;
    int currSan;
    private int specLevel;
    private int physAtk;
    private int magAtk;
    private int physdef;
    private int magDef;
    private int spd;
    private int acc;
    private int evade;
    private boolean dead;

    public int getCurrReso() {
        return currReso;
    }

    public int getCurrSan() {
        return currSan;
    }

    public int getMagAtk() {
        return magAtk;
    }

    public int getMagDef() {
        return magDef;
    }

    public int getPhysAtk() {
        return physAtk;
    }

    public int getPhysdef() {
        return physdef;
    }

    public int getSpd() {
        return spd;
    }

    public void setCurrReso(int currReso) {
        this.currReso = currReso;
    }

    public void setCurrSan(int currSan) {
        this.currSan = currSan;
    }

    public int getAcc() {
        return acc;
    }

    public int getEvade() {
        return evade;
    }

    public void equipWeapon(Weapon weapon){
        this.physAtk += weapon.getStrVal();
        this.magAtk += weapon.getMagVal();
        this.acc = weapon.getAccVal();
    }

    public void equipArmor(Armor armor){
        this.magDef += armor.getMagDef();
        this.physdef += armor.getPhysDef();
        this.evade = armor.getEvade();
    }

    public void unequipWeapon(Weapon weapon){
        this.physAtk -= weapon.getStrVal();
        this.magAtk -= weapon.getMagVal();
        this.acc = weapon.getAccVal();
    }

    public void unequipArmor(Armor armor){
        this.magDef -= armor.getMagDef();
        this.physdef -= armor.getPhysDef();
        this.evade = armor.getEvade();
    }

    public void setMaxReso(int resolve){

        this.maxReso += job.getBaseReso();

    }

    public void checkDead(){
        if(this.currReso <= 0){
            dead = true;
        }
    }

}