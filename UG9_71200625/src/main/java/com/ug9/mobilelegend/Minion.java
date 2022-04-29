package com.ug9.mobilelegend;

public class Minion extends NPC{
    public Minion(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if (enemy instanceof Creep){
            System.out.println("Terjadi kesalahan! Creep tidak dapat menyerang minion maupun creep lainnya.");
        }else{
            super.attack(enemy);
        }
    }
}