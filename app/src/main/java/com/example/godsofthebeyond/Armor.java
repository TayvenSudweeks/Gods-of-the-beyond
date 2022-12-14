package com.example.godsofthebeyond;

public class Armor {
    private String name;
    private int physDef, magDef, evade;
    private String jobReq;
    private boolean legendary;

    Armor(){

    }

    Armor(String armorName){
        if(armorName == "heavy armor"){
            this.physDef = 5;
            this.magDef = 3;
            this.evade = 5;
            this.jobReq = "knight";
        } else if(armorName == "light armor"){
            this.physDef = 3;
            this.magDef = 2;
            this.evade = 15;
            this.jobReq = "knight";
        } else if(armorName == "destiny island attire"){
            this.physDef = 4;
            this.magDef = 5;
            this.evade = 10;
            this.jobReq = "knight";
            this.legendary = true;
        } else if(armorName == "plague mask"){
            this.physDef = 1;
            this.magDef = 3;
            this.evade = 5;
            this.jobReq = "alchemist";
        } else if(armorName == "steampunk hat"){
            this.physDef = 2;
            this.magDef = 2;
            this.evade = 5;
            this.jobReq = "alchemist";
        } else if(armorName == "pharmacist-labcoat-inator"){
            this.physDef = 3;
            this.magDef = 2;
            this.evade = 5;
            this.jobReq = "alchemist";
            this.legendary = true;
        } else if(armorName == "leather cloak"){
            this.physDef = 2;
            this.magDef = 2;
            this.evade = 15;
            this.jobReq = "hunter";
        } else if(armorName == "scaled cloak"){
            this.physDef = 4;
            this.magDef = 1;
            this.evade = 10;
            this.jobReq = "hunter";
        } else if(armorName == "elven cloak"){
            this.physDef = 3;
            this.magDef = 4;
            this.evade = 20;
            this.jobReq = "hunter";
            this.legendary = true;
        } else if(armorName == "chain mail"){
            this.physDef = 3;
            this.magDef = 1;
            this.evade = 10;
            this.jobReq = "mercenary";
        } else if(armorName == "magic crest"){
            this.physDef = 1;
            this.magDef = 3;
            this.evade = 15;
            this.jobReq = "mercenary";
        } else if(armorName == "assassin robes"){
            this.physDef = 3;
            this.magDef = 3;
            this.evade = 15;
            this.jobReq = "mercenary";
            this.legendary = true;
        } else if(armorName == "white headbead"){
            this.physDef = 3;
            this.magDef = 1;
            this.evade = 10;
            this.jobReq = "grappler";
        } else if(armorName == "blue headband"){
            this.physDef = 1;
            this.magDef = 3;
            this.evade = 10;
            this.jobReq = "grappler";
        } else if(armorName == "red spikes"){
            this.physDef = 3;
            this.magDef = 3;
            this.evade = 20;
            this.jobReq = "grappler";
            this.legendary = true;
        }
        name = armorName;
    }

    public String getName() {
        return name;
    }

    public String getJobReq() {
        return jobReq;
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

    public boolean isLegendary() {
        return legendary;
    }
}
