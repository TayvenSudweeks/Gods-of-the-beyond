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
    private int physDef;
    private int magDef;
    private int spd;
    private int acc;
    private int evade;
    private boolean dead;

    Character(String name, String job){

        this.name = name;
        this.job.name = job;
        this.dead = false;
    }

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
        return physDef;
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

    public String ToString(){
        return "Max Resolution: " + this.maxReso + "\n" +
                "Max Sanity: " + this.maxSan + "\n" +
                "Phys Attack: " + this.physAtk + "\n" +
                "Magic Attack: " + this.magAtk + "\n" +
                "Phys Defense: " + this.physDef + "\n" +
                "Magic Defense: " + this.magDef + "\n" +
                "Speed: " + this.spd + "\n";
    }

    public void equipWeapon(Weapon weapon){
        this.physAtk += weapon.getStrVal();
        this.magAtk += weapon.getMagVal();
        this.acc = weapon.getAccVal();
    }

    public void equipArmor(Armor armor){
        this.magDef += armor.getMagDef();
        this.physDef += armor.getPhysDef();
        this.evade = armor.getEvade();
    }

    public void unequipWeapon(Weapon weapon){
        this.physAtk -= weapon.getStrVal();
        this.magAtk -= weapon.getMagVal();
        this.acc = weapon.getAccVal();
    }

    public void unequipArmor(Armor armor){
        this.magDef -= armor.getMagDef();
        this.physDef -= armor.getPhysDef();
        this.evade = armor.getEvade();
    }

    public void setupCharacter(){
        this.maxReso = job.getBaseReso();
        this.currReso = job.getBaseReso();
        this.maxSan = job.getBaseSan();
        this.currSan = job.getBaseSan();
        this.physAtk = job.getBasePhysAtk();
        this.physDef = job.getBasePhysDef();
        this.magAtk = job.getBaseMagAtk();
        this.magDef = job.getBaseMagDef();
        this.spd = job.getBaseSpd();
    }

    public void checkDead(){
        if(this.currReso <= 0){
            dead = true;
        }
    }

}