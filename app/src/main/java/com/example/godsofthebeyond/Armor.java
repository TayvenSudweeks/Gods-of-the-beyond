package com.example.godsofthebeyond;

public class Armor {
    private int physDef, magDef, evade;
    private String jobReq;

    Armor(String armorName){
        if(armorName == ""){
            this.physDef = 4;
            this.magDef = 2;
            this.evade = 5;
            this.jobReq = "";
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
