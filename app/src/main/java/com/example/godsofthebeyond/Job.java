package com.example.godsofthebeyond;

public class Job {

    String name;
    private int baseReso;
    private int baseSan;
    private int basePhysAtk;
    private int baseMagAtk;
    private int basePhysDef;
    private int baseMagDef;
    private int baseSpd;
    private String specialty;
    private int specLevel;

    Job(String name){

        this.name = JobNames.valueOf(name.toLowerCase()).toString();
        if(this.name == "knight"){

            this.specialty = "tactics";
            this.specLevel = 4;
            this.baseReso = 13;
            this.baseSan = 6;
            this.basePhysAtk = 5;
            this.baseMagAtk = 1;
            this.basePhysDef = 6;
            this.baseMagDef = 2;
            this.baseSpd = 1;

        }
        else if(this.name == "mercenary"){

            this.specialty = "perception";
            this.specLevel = 3;
            this.baseReso = 7;
            this.baseSan = 7;
            this.basePhysAtk = 9;
            this.baseMagAtk = 6;
            this.basePhysDef = 4;
            this.baseMagDef = 2;
            this.baseSpd = 4;

        }
        else if(this.name == "alchemist"){

            this.specialty = "alchemy";
            this.specLevel = 7;
            this.baseReso = 5;
            this.baseSan = 12;
            this.basePhysAtk = 1;
            this.baseMagAtk = 4;
            this.basePhysDef = 2;
            this.baseMagDef = 5;
            this.baseSpd = 3;

        }
        else if(this.name == "hunter"){

            this.specialty = "tracking";
            this.specLevel = 10;
            this.baseReso = 6;
            this.baseSan = 11;
            this.basePhysAtk = 3;
            this.baseMagAtk = 5;
            this.basePhysDef = 3;
            this.baseMagDef = 4;
            this.baseSpd = 5;

        }
        else if(this.name == "grappler"){

            this.specialty = "evasion";
            this.specLevel = 5;
            this.baseReso = 8;
            this.baseSan = 7;
            this.basePhysAtk = 8;
            this.baseMagAtk = 2;
            this.basePhysDef = 3;
            this.baseMagDef = 2;
            this.baseSpd = 8;

        }
    
    }

    public int getBaseReso(){

        return this.baseReso;

    }

    public int getBaseSan(){

        return this.baseSan;

    }

    public int getBasePhysAtk(){

        return this.basePhysAtk;

    }

    public int getBaseMagAtk(){

        return this.baseMagAtk;

    }

    public int getBasePhysDef(){

        return this.basePhysDef;

    }

    public int getBaseMagDef(){

        return this.baseMagDef;

    }

    public int getBaseSpd(){

        return this.baseSpd;

    }

    public String getSpecialty(){

        return this.specialty;

    }

    public int getSpecLevel(){

        return this.specLevel;

    }

    public void setBaseMagAtk(int baseMagAtk) {
        this.baseMagAtk = baseMagAtk;
    }

    public void setBaseMagDef(int baseMagDef) {
        this.baseMagDef = baseMagDef;
    }


}
