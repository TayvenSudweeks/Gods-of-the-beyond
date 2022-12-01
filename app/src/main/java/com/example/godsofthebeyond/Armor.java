package com.example.godsofthebeyond;

public class Armor {
    private int physDef, magDef, evade;



    Armor(String armorName){
        if(armorName == "heavy armor"){
            this.physDef = 4;
            this.magDef = 2;
            this.evade = 5;

        }
    }

    public int getEvade() {
        return evade;
    }

    public int getMagDef() {
        return magDef;
    }

    public int getPhysDef() {
        return physDef;
    }
}
