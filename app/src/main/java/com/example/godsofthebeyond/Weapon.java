package com.example.godsofthebeyond;

public class Weapon {
    private String weaponName;
    private int strVal, magVal, accVal;
    private String jobReq;
    private boolean legendary;

    Weapon(){

    }
    Weapon(String weaponName){
        this.weaponName = weaponName;
        if(weaponName == "claymore" ){
            this.strVal = 4;
            this.magVal = 0;
            this.accVal = 95;
            this.jobReq = "knight";
        } else if(weaponName == "mace"){
            this.strVal = 6;
            this.magVal = 0;
            this.accVal = 80;
            this.jobReq = "knight";
        } else if(weaponName == "kingdom key"){
            this.strVal = 7;
            this.magVal = 3;
            this.accVal = 90;
            this.jobReq = "knight";
            this.legendary = true;
        } else if(weaponName == "rapier"){
            this.strVal = 3;
            this.magVal = 0;
            this.accVal = 100;
            this.jobReq = "knight";
        } else if(weaponName == "axe"){
            this.strVal = 8;
            this.magVal = 0;
            this.accVal = 70;
            this.jobReq = "knight";
        } else if(weaponName == "syringe"){
            this.strVal = 1;
            this.magVal = 4;
            this.accVal = 95;
            this.jobReq = "alchemist";
        } else if(weaponName == "flask"){
            this.strVal = 0;
            this.magVal = 5;
            this.accVal = 90;
            this.jobReq = "alchemist";
        } else if(weaponName == "chemistry-inator"){
            this.strVal = 1;
            this.magVal = 7;
            this.accVal = 85;
            this.jobReq = "alchemist";
            this.legendary = true;
        } else if(weaponName == "collector's bottle"){
            this.strVal = 1;
            this.magVal = 4;
            this.accVal = 100;
            this.jobReq = "alchemist";
        } else if(weaponName == "reinforced canister"){
            this.strVal = 4;
            this.magVal = 2;
            this.accVal = 85;
            this.jobReq = "alchemist";
        } else if(weaponName == "longbow"){
            this.strVal = 3;
            this.magVal = 3;
            this.accVal = 95;
            this.jobReq = "hunter";
        } else if(weaponName == "crossbow"){
            this.strVal = 4;
            this.magVal = 1;
            this.accVal = 90;
            this.jobReq = "hunter";
        } else if(weaponName == "galadhrim's bow"){
            this.strVal = 4;
            this.magVal = 5;
            this.accVal = 90;
            this.jobReq = "hunter";
            this.legendary = true;
        } else if(weaponName == "recurve bow" ){
            this.strVal = 3;
            this.magVal = 2;
            this.accVal = 100;
            this.jobReq = "hunter";
        } else if(weaponName == "sling" ){
            this.strVal = 6;
            this.magVal = 4;
            this.accVal = 65;
            this.jobReq = "hunter";
        } else if(weaponName == "throwing knife"){
            this.strVal = 3;
            this.magVal = 1;
            this.accVal = 100;
            this.jobReq = "mercenary";
        } else if(weaponName == "dagger"){
            this.strVal = 4;
            this.magVal = 2;
            this.accVal = 90;
            this.jobReq = "mercenary";
        } else if(weaponName == "hidden blade"){
            this.strVal = 4;
            this.magVal = 4;
            this.accVal = 90;
            this.jobReq = "mercenary";
            this.legendary = true;
        } else if(weaponName == "shank"){
            this.strVal = 5;
            this.magVal = 1;
            this.accVal = 85;
            this.jobReq = "mercenary";
        } else if(weaponName == "balisong") {
            this.strVal = 4;
            this.magVal = 1;
            this.accVal = 95;
            this.jobReq = "mercenary";
        } else if(weaponName == "wraps"){
            this.strVal = 5;
            this.magVal = 2;
            this.accVal = 90;
            this.jobReq = "grappler";
        } else if(weaponName == "boxing gloves"){
            this.strVal = 6;
            this.magVal = 1;
            this.accVal = 85;
            this.jobReq = "grappler";
        } else if(weaponName == "an echidna's gloves"){
            this.strVal = 8;
            this.magVal = 0;
            this.accVal = 90;
            this.jobReq = "grappler";
            this.legendary = true;
        } else if(weaponName == "spiked dusters"){
            this.strVal = 6;
            this.magVal = 2;
            this.accVal = 75;
            this.jobReq = "grappler";
        } else if(weaponName == "beast claws"){
            this.strVal = 5;
            this.magVal = 4;
            this.accVal = 80;
            this.jobReq = "grappler";
        }
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getJobReq() {
        return jobReq;
    }

    public int getAccVal() {
        return accVal;
    }

    public int getMagVal() {
        return magVal;
    }

    public int getStrVal() {
        return strVal;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public String toString() {
        return "Weapon Name: " + this.weaponName + "\n" +
                "Strength: " + this.strVal + "\n" +
                "Magic: " + this.magVal + "\n" +
                "Accuracy: " + this.accVal;

    }

}