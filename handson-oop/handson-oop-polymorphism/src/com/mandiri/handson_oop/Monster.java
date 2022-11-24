package com.mandiri.handson_oop;

public class Monster implements Attackable {
    private String name;
    private Integer hp;

    public Monster(String name, Integer hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Override
    public void receivedDamage(Hero hero) {
        this.hp -= hero.getBaseDamage();
    }
}
