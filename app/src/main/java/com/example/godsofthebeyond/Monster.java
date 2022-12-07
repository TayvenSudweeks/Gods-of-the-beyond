package com.example.godsofthebeyond;

public class Monster {

    private int maxReso, currReso;
    private int PhysAtk, MagAtk;
    private int spd;
    private String roomtype;
    private boolean boss;
    private String monsterName;
    public boolean dead;

    Monster(){

    }

    Monster(String monsterName){
        if(monsterName == "oozing slime"){
            this.monsterName = monsterName;
            this.maxReso  = 30;
            this.currReso = 20;
            this.PhysAtk = 5;
            this.MagAtk = 2;
            this.spd = 2;
            this.roomtype = "prison";
        } else if(monsterName == "skeleton"){
            this.monsterName = monsterName;
            this.maxReso = 35;
            this.currReso = 35;
            this.PhysAtk = 6;
            this.MagAtk = 1;
            this.spd = 3;
            this.roomtype = "catacombs";
        } else if(monsterName == "overgrowth"){
            this.monsterName = monsterName;
            this.maxReso = 24;
            this.currReso = 24;
            this.PhysAtk = 6;
            this.MagAtk = 0;
            this.spd = 5;
            this.roomtype = "garden";
        } else if(monsterName == "jailer"){
            this.monsterName = monsterName;
            this.maxReso = 60;
            this.currReso = 60;
            this.PhysAtk = 9;
            this.MagAtk = 3;
            this.spd = 3;
            this.roomtype = "prison";
            this.boss = true;
        } else if(monsterName == "goblin"){
            this.monsterName = monsterName;
            this.maxReso = 32;
            this.currReso = 32;
            this.PhysAtk = 4;
            this.MagAtk = 2;
            this.spd = 5;
            this.roomtype = "all";
        } else if(monsterName == "kobold"){
            this.monsterName = monsterName;
            this.maxReso = 34;
            this.currReso = 34;
            this.PhysAtk = 2;
            this.MagAtk = 4;
            this.spd = 4;
            this.roomtype = "all";
        } else if(monsterName == "eldritch draugr"){
            this.monsterName = monsterName;
            this.maxReso = 50;
            this.currReso = 50;
            this.PhysAtk = 3;
            this.MagAtk = 6;
            this.spd = 2;
            this.roomtype = "catacombs";
            this.boss = true;
        } else if(monsterName == "cult leader"){
            this.monsterName = monsterName;
            this.maxReso = 45;
            this.currReso = 45;
            this.PhysAtk = 7;
            this.MagAtk = 7;
            this.spd = 3;
            this.roomtype = "belfry";
            this.boss = true;
        } else if(monsterName == "gargoyle"){
            this.monsterName = monsterName;
            this.maxReso = 40;
            this.currReso = 40;
            this.PhysAtk = 4;
            this.MagAtk = 0;
            this.spd = 1;
            this.roomtype = "belfry";
        } else if(monsterName == "mass of vines"){
            this.monsterName = monsterName;
            this.maxReso = 80;
            this.currReso = 80;
            this.PhysAtk = 6;
            this.MagAtk = 4;
            this.spd = 3;
            this.roomtype = "garden";
            this.boss = true;
        } else if(monsterName == "amogus"){
            this.monsterName = monsterName;
            this.maxReso = 1;
            this.currReso = 1;
            this.PhysAtk = 14;
            this.MagAtk = 14;
            this.spd = 6;
            this.roomtype = "all";
            this.boss = true;
        } else if(monsterName == "astoth"){
            this.monsterName = monsterName;
            this.maxReso = 150;
            this.currReso = 150;
            this.PhysAtk = 10;
            this.MagAtk = 8;
            this.spd = 5;
            this.roomtype = "final";
            this.boss = true;
        }

    }

    public int getMagAtk() {
        return MagAtk;
    }

    public int getPhysAtk() {
        return PhysAtk;
    }

    public int getCurrReso() {
        return currReso;
    }

    public void setCurrReso(int currReso) {
        this.currReso = currReso;
    }

    public int getSpd() {
        return spd;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public boolean isBoss() {
        return boss;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setPhysAtk(int physAtk) {
        PhysAtk = physAtk;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public void setMagAtk(int magAtk) {
        MagAtk = magAtk;
    }

    public int getMaxReso() {
        return maxReso;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}