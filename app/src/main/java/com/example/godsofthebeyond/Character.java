package com.example.godsofthebeyond;


public class Character {

    String name;
    Job job;
    private int maxReso ;
    int currReso;
    private int maxSan;
    int currSan;
    private int specLevel;
    private int physAtk;
    private int setPhysAtk;
    private int magAtk, setMagAtk;
    private int physDef, setPhysDef;
    private int magDef, setMagDef;
    private int spd, setSpd;
    private int acc;
    private int evade;
    private boolean weaponLegendary = false;
    private boolean armorLegendary = false;
    public boolean dead;

    public boolean getWeaponLegendary(){

        return weaponLegendary;

    }

    public boolean getArmorLegendary(){

        return armorLegendary;

    }

    Character(String name, String job){
        this.name = name;
        this.job = new Job(job);
        setupCharacter();
    }

    public int getCurrReso() {
        return currReso;
    }

    public int getMaxReso() {
        return maxReso;
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

    public String toString(){
        return  "Name: " + this.name + "\n" +
                "Resolution: " + this.currReso + "/" + this.maxReso + "\n" +
                "Sanity: " + this.currSan + "/" + this.maxSan + "\n" +
                "Phys Attack: " + this.physAtk + "\n" +
                "Magic Attack: " + this.magAtk + "\n" +
                "Phys Defense: " + this.physDef + "\n" +
                "Magic Defense: " + this.magDef + "\n" +
                "Speed: " + this.spd + "\n";
    }

    public void equipWeapon(Weapon weapon){
        this.physAtk += weapon.getStrVal();
        this.setPhysAtk += weapon.getStrVal();
        this.magAtk += weapon.getMagVal();
        this.setMagAtk += weapon.getMagVal();
        this.acc = weapon.getAccVal();
        if(weapon.isLegendary()){

            weaponLegendary = true;

        }
    }

    public void equipArmor(Armor armor){
        this.magDef += armor.getMagDef();
        this.setMagDef += armor.getMagDef();
        this.physDef += armor.getPhysDef();
        this.setPhysDef += armor.getPhysDef();
        this.evade = armor.getEvade();
        if(armor.isLegendary()){

            armorLegendary = true;

        }
    }

    public void unequipWeapon(){
        this.physAtk -= job.getBasePhysAtk();
        this.setPhysAtk -= job.getBasePhysAtk();
        this.magAtk -= job.getBaseMagAtk();
        this.setMagAtk -= job.getBasePhysAtk();
        this.acc = 75;
        weaponLegendary = false;
    }

    public void unequipArmor(){
        this.magDef -= job.getBaseMagDef();
        this.setMagDef -= job.getBaseMagDef();
        this.physDef -= job.getBasePhysDef();
        this.setPhysDef -= job.getBasePhysDef();
        this.evade = 0;
        armorLegendary = false;

    }

    public void setupCharacter(){
        this.maxReso = job.getBaseReso();
        this.currReso = job.getBaseReso();
        this.maxSan = job.getBaseSan();
        this.currSan = job.getBaseSan();
        this.physAtk = job.getBasePhysAtk();
        this.setPhysAtk = job.getBasePhysAtk();
        this.physDef = job.getBasePhysDef();
        this.setPhysDef = job.getBasePhysDef();
        this.magAtk = job.getBaseMagAtk();
        this.setMagAtk = job.getBaseMagAtk();
        this.magDef = job.getBaseMagDef();
        this.setMagDef = job.getBaseMagDef();
        this.spd = job.getBaseSpd();
        this.setSpd = job.getBaseSpd();
        this.dead = false;
    }



    public void setPhysAtk(int physAtk) {
        this.physAtk = physAtk;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public void setMagDef(int magDef) {
        this.magDef = magDef;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public void resetStats(){
        this.physAtk = this.setPhysAtk;
        this.physDef = this.setPhysDef;
        this.magAtk = this.setMagAtk;
        this.magDef = this.setMagDef;
        this.spd = this.setSpd;
    }


}