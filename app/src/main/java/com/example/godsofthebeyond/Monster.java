package com.example.godsofthebeyond;

public class Monster {

    private int maxReso, currReso;
    private int PhysAtk, MagAtk;
    private int spd;

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
}
