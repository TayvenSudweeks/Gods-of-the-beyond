package com.example.godsofthebeyond;

import java.util.Arrays;
import java.util.Random;

public class Fight {

    private int hitChance;
    private String first, second, third, fourth;
    private Character monsterTarget;
    boolean spellFail;

    public void playerAttack(Character attacker, Monster target){
        hitChance = new Random().nextInt(attacker.getAcc());
        if(hitChance < 10){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - attacker.getPhysAtk());

        }
        checkMonDead(target);
    }

    public void monsterAttack(Monster attacker, Character target){
        hitChance = new Random().nextInt(100);
        if(hitChance < target.getEvade()){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - (attacker.getPhysAtk() - target.getPhysdef()));
            checkDead(target);
        }
    }

    public void monsterSpell(Monster attacker, Character target){
        hitChance = new Random().nextInt(100);
        if(hitChance < target.getEvade()){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - attacker.getMagAtk());

        }
        checkDead(target);
    }

    public void playerSpell(Character attacker, Monster target){
        hitChance = new Random().nextInt(100);
        if(hitChance < 0){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - attacker.getMagAtk());

        }
        checkMonDead(target);
    }

    public void endFight(Character ch1, Character ch2, Character ch3){
        ch1.resetStats();
        ch2.resetStats();
        ch3.resetStats();
    }

    /*public void setTurnOrder(Character ch1, Character ch2, Character ch3, Monster m1){
        int char1 = ch1.getSpd();
        int char2 = ch2.getSpd();
        int char3 = ch3.getSpd();
        int mon1 = m1.getSpd();
        int values[] = {char1, char2, char3, mon1};
        Arrays.sort(values);
        if(values[0] == mon1){
            this.fourth = m1.getMonsterName();
            if(values[1] == mon1){
                this.third = m1.getMonsterName();
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char1){
                this.third = ch1.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char2){
                this.third = ch2.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char3){
                this.third = ch3.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            }
        } else if(values[0] == char1){
            this.fourth = ch1.name;
            if(values[1] == mon1){
                this.third = m1.getMonsterName();
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char1){
                this.third = ch1.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char2){
                this.third = ch2.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char3){
                this.third = ch3.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            }
        } else if(values[0] == char2){
            this.fourth = ch2.name;
            if(values[1] == mon1){
                this.third = m1.getMonsterName();
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char1){
                this.third = ch1.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char2){
                this.third = ch2.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char3){
                this.third = ch3.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            }
        } else if(values[0] == char3){
            this.fourth = ch3.name;
            if(values[1] == mon1){
                this.third = m1.getMonsterName();
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char1){
                this.third = ch1.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char2){
                this.third = ch2.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            } else if(values[1] == char3){
                this.third = ch3.name;
                if(values[2] == mon1){
                    this.second = m1.getMonsterName();
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char1){
                    this.second = ch1.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char2){
                    this.second = ch2.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                } else if(values[2] == char3){
                    this.second = ch3.name;
                    if(values[3] == mon1){
                        this.first = m1.getMonsterName();
                        return;
                    } else if(values[3] == char1){
                        this.first = ch1.name;
                        return;
                    } else if(values[3] == char2){
                        this.first = ch2.name;
                        return;
                    } else if(values[3] == char3){
                        this.first = ch3.name;
                        return;
                    }
                }
            }
        }



    }*/

    public void potionHeal(Character ch1, Character ch2, Character ch3, Character user){
        if(user.currSan > 0) {

            ch1.setCurrReso(ch1.currReso += user.getMagAtk());
            if (ch1.currReso > ch1.getMaxReso()) {
                ch1.setCurrReso(ch1.getMaxReso());
            }
            ch2.setCurrReso(ch2.currReso += user.getMagAtk());
            if (ch2.currReso > ch2.getMaxReso()) {
                ch2.setCurrReso(ch2.getMaxReso());
            }
            ch3.setCurrReso(ch3.currReso += user.getMagAtk());
            if (ch3.currReso > ch3.getMaxReso()) {
                ch3.setCurrReso(ch3.getMaxReso());
            }
            user.currSan = user.currSan - 2;
            spellFail = false;
        } else {
            spellFail = true;
        }
    }

    public void setTrap(Character user, Monster m1){
        if(user.currSan > 0) {

            m1.setPhysAtk(m1.getPhysAtk() - 2);
            user.currSan = user.currSan - 2;
            spellFail = false;
        } else{
            spellFail = true;
        }
    }

    public void suplex(Character user, Monster m1){
        if(user.currSan > 0) {

            if (user.getPhysAtk() > m1.getPhysAtk()) {
                m1.setCurrReso(m1.getCurrReso() - 14);
            }
            user.currSan = user.currSan - 3;
            spellFail = false;
        } else{
            spellFail = true;
        }
    }

    public void taunt(Character user, Monster target){
        if(user.currSan > 2) {

            target.setMagAtk(target.getMagAtk() - 2);
            user.currSan = user.currSan - 2;
            spellFail = false;
        } else{
            spellFail = true;
        }
    }

    public void valorForm(Character char1){
        if(char1.currSan > 3) {
            char1.setPhysDef(char1.getPhysdef() - 3);
            char1.setPhysAtk(char1.getPhysAtk() + 3);
            char1.currSan = char1.currSan - 3;
            spellFail = false;
        } else{
            spellFail = true;
        }
    }

    public void strengthInator(Character char1, Character char2, Character char3, Character user){
        if(user.currSan > 4) {
            char1.setPhysAtk(char1.getPhysAtk() + 2);
            char2.setPhysAtk(char2.getPhysAtk() + 2);
            char3.setPhysAtk(char3.getPhysAtk() + 2);
            user.currSan = user.currSan - 4;
            spellFail = false;
        } else{
            spellFail = true;
        }
    }

    public void sevenEmeralds(Character char1){
        if(char1.currSan > 0) {
            char1.setPhysDef(char1.getPhysdef() + 3);
            char1.setMagDef(char1.getMagDef() + 3);
            char1.currSan = char1.currSan - 2;
            spellFail = false;
        } else{
            spellFail = true;
        }
    }

    public void lockTarget(Character char1){
        if(char1.currSan > 0) {

            char1.setAcc(100);
            char1.currSan = char1.currSan - 1;
            spellFail = false;
        } else{
            spellFail = true;
        }
    }

    public void assassinate(Character user, Monster target){
        if(user.currSan > 4) {
            if(!target.isBoss()) {
                if(target.getCurrReso() <= target.getMaxReso() / 2){
                    target.setCurrReso(0);
                }
                user.currSan = user.currSan - 4;
                spellFail = false;
            }
        } else{
            spellFail = true;
        }
    }

    public void herbalBrew(Character user, Character ch1, Character ch2, Character ch3){
        if(user.currSan > 0) {
            ch1.setCurrReso(ch1.currReso + (user.getMagAtk() - 2));
            ch2.setCurrReso(ch2.currReso + (user.getMagAtk() - 2));
            ch3.setCurrReso(ch3.currReso + (user.getMagAtk() - 2));
            if (ch1.currReso > ch1.getMaxReso()) {
                ch1.setCurrReso(ch1.getMaxReso());
            }
            if (ch2.currReso > ch2.getMaxReso()) {
                ch2.setCurrReso(ch2.getMaxReso());
            }
            if (ch3.currReso > ch3.getMaxReso()) {
                ch3.setCurrReso(ch3.getMaxReso());
            }
            user.currSan = user.currSan - 2;
            spellFail = false;
        } else{
            spellFail = true;
        }
    }

    public Character chooseTarget(Monster m1, Character ch1, Character ch2, Character ch3){
        int target = new Random().nextInt(3);
        switch (target) {
            case 0: return ch1;
            case 1: return ch2;
            case 2: return ch3;
        }
        return null;
    }



    public void checkDead(Character ch1){
        if(ch1.currReso <= 0){
            ch1.dead = true;
        }
    }

    public void checkMonDead(Monster m1){
        if(m1.getCurrReso() <= 0){
            m1.dead = true;
        }
    }

    public void acidSpray(Character ch1, Character ch2, Character ch3){
        ch1.setCurrReso(ch1.getCurrReso() - 3);
        ch2.setCurrReso(ch2.getCurrReso() - 3);
        ch3.setCurrReso(ch3.getCurrReso() - 3);
    }

    public void imprison(Character ch1){
        ch1.setPhysAtk(ch1.getPhysAtk() - 2);
    }

    public void callUponGod(Monster m1){
        m1.setMagAtk(m1.getMagAtk() + 2);
    }

    public void mendSelf(Monster m1){
        m1.setCurrReso(m1.getCurrReso() + 35);
        if(m1.getCurrReso() > m1.getMaxReso()){
            m1.setCurrReso(m1.getMaxReso());
        }
    }

    public void randomMonsterAttack(Monster user, Character target, Character ch1, Character ch2, Character ch3){
        int attack = new Random().nextInt();
        while(!user.isBoss() && attack > 1){
            attack = new Random().nextInt();
        }
        switch (attack) {
            case 0:
                monsterAttack(user, target);
                break;
            case 1:
                monsterSpell(user, target);
                break;
            case 2:
                if (user.getMonsterName() == "mass of vines" || user.getMonsterName() == "astoth") {
                    acidSpray(ch1, ch2, ch3);
                } else {
                    randomMonsterAttack(user, target, ch1, ch2, ch3);
                }
                break;
            case 3:
                if (user.getMonsterName() == "jailer" || user.getMonsterName() == "astoth") {
                    imprison(target);
                } else {
                    randomMonsterAttack(user, target, ch1, ch2, ch3);
                }
                break;
            case 4:
                if (user.getMonsterName() == "cult leader" || user.getMonsterName() == "astoth"){
                    callUponGod(user);
                } else {
                    randomMonsterAttack(user, target, ch1, ch2, ch3);
                }
                break;
            case 5: if(user.getMonsterName() == "eldritch draugr" || user.getMonsterName() == "astoth") {
                mendSelf(user);
            } else {
                randomMonsterAttack(user, target, ch1, ch2, ch3);
            }
            break;
        }
    }
}