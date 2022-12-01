package com.example.godsofthebeyond;

import java.util.Arrays;
import java.util.Random;

public class Fight {
    private int hitChance;
    private String first, second, third, fourth;

    public void playerAttack(Character attacker, Monster target){
        hitChance = new Random().nextInt(attacker.getAcc());
        if(hitChance < 10){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - attacker.getPhysAtk());

        }
        if(target.getCurrReso() <= 0){
            endFight();
        }
    }

    public void monsterAttack(Monster attacker, Character target){
        hitChance = new Random().nextInt(100);
        if(hitChance < target.getEvade()){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - (attacker.getPhysAtk() - target.getPhysdef()));
            target.checkDead();
        }
    }

    public void playerSpell(Character attacker, Monster target){
        hitChance = new Random().nextInt(100);
        if(hitChance < 0){
            return;
        } else if(hitChance > 10){
            target.setCurrReso(target.getCurrReso() - attacker.getMagAtk());

        }
        if(target.getCurrReso() <= 0){
            endFight();
        }
    }

    public void endFight(){

    }

    public void setTurnOrder(Character ch1, Character ch2, Character ch3, Monster m1){
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



    }

    public void potionHeal(Character user, Character target){
        target.setCurrReso(target.currReso += user.getMagAtk());
        if(target.currReso > target.getMaxReso()){
            target.setCurrReso(target.getMaxReso());
        }

    }

    public void setTrap(Monster m1){
        m1.setPhysAtk(m1.getPhysAtk() - 2);
    }


}
