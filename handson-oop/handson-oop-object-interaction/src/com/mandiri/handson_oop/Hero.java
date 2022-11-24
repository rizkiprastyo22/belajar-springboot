package com.mandiri.handson_oop;

public class Hero {
    private String name;
    private Integer hp;
    private Integer mana;
    private Integer baseDamage;

    public Hero(String name, Integer hp, Integer mana, Integer baseDamage) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                '}';
    }

    public void attack(Hero enemy) {
        if (enemy.hp <= 0) {
            System.out.println("Musuh sudah mati");
        } else {
            enemy.receivedDamage(this.baseDamage);
        }

//        enemy.hp -= this.baseDamage;

//        enemy.hp = enemy.hp - this.baseDamage;

//        Integer myDamage = this.baseDamage;
//        Integer hpEnemy = enemy.getHp();
//        enemy.setHp(hpEnemy - myDamage);
    }

    public void receivedDamage(Integer damage) {
        if ((this.hp - damage) < 0) {
            this.hp = 0;
        } else {
            this.hp -= damage;
        }
    }

    public void heal(Hero healedHero) {
        if (this.hp < this.mana) {
            System.out.println("Kamu tidak bisa heal");
        } else {
            healedHero.receivedHeal(this.mana);
            this.receivedDamage(this.mana);
        }
    }

    public void receivedHeal(Integer heal) {
        this.hp += heal;
    }

}
