package com.mandiri.handson_oop;

public class Tower implements Attackable {
    private Integer hp;

    public Tower(Integer hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "hp=" + hp +
                '}';
    }

    @Override
    public void receivedDamage(Hero hero) {
        this.hp -= hero.getBaseDamage();
    }
}
