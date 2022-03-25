package com.ug7.game;

public class Karakter
{
    private Player player;
    private int HP;
    private int money;
    private int weapon;
    private boolean isWalk;

    public Karakter(final Player player) {
        this.HP = 100;
        this.money = 5000;
        this.weapon = 0;
        this.isWalk = false;
        this.player = new Player(player.getUsername(), player.getPassword());
    }

    public void buyWeapon(final int weapon) {
        if (weapon <= 0 || weapon >= 5) { System.out.println("Pilihan yang kamu masukkan salah!");
            return;
        }
        int price = 0;
        switch (this.weapon = weapon) {
            case 1: {
                price = 500;
                break;
            }
            case 2: {
                price = 3000;
                break;
            }
            case 3: {
                price = 2000;
                break;
            }
            case 4: {
                price = 4000;
                break;
            }
            default: {
                price = 0;
                break;
            }
        }
        if (this.money >= price) { this.money -= price; System.out.println("Berhasil membeli senjata! Uang sekarang: " + this.getMoney());
            return;
        }
        System.out.println("Maaf uang kamu tidak mencukupi!");
    }

    public void abilityAttack(final Karakter karakter) { karakter.HP -= 0; karakter.receiveDamage(0); }

    public void normalAttack(final Karakter karakter) {
        int damage = 0;
        switch (this.weapon) {
            case 1: {
                damage = 20;
                break;
            }
            case 2: {
                damage = 60;
                break;
            }
            case 3: {
                damage = 25;
                break;
            }
            case 4: {
                damage = 50;
                break;
            }
            default: {
                damage = 0;
                break;
            }
        }
        karakter.receiveDamage(damage);
    }

    public void receiveDamage(final int damage) {
        this.HP -= damage;
        System.out.println(this.getPlayer().getUsername() + " terkena serangan! Sisa HP " + this.getPlayer().getUsername() + ": " + this.getHP());
        if (this.getHP() <= 0) { this.HP = 0; System.out.println(this.getPlayer().getUsername() + " mati!"); }
    }

    public void receiveHP(final int hp) {
        this.HP += hp;
        if (this.getHP() > 100) { this.HP = 100; }
        System.out.println("HP sekarang: " + this.getHP());
    }

    public void getInfo() {
        System.out.println("Username: " + this.getPlayer().getUsername());
        System.out.println("Level: " + this.getPlayer().getLevel());
        System.out.println("Money: " + this.getMoney());
        String isDie = "";
        if (this.getHP() <= 0) { isDie = "[Mati]"; }
        System.out.println("HP: " + this.getHP() + " " + isDie);
        String weapon = null;
        switch (this.weapon) {
            case 1: {
                weapon = "Pisau";
                break;
            }
            case 2: {
                weapon = "Tongkat Sihir";
                break;
            }
            case 3: {
                weapon = "Tongkat";
                break;
            }
            case 4: {
                weapon = "Katana";
                break;
            }
            default: {
                weapon = "Knife";
                break;
            }
        }
        System.out.println("Weapon: " + weapon);
        String movement;
        if (this.isWalk) { movement = "Berjalan"; }
        else { movement = "Berlari"; }
        System.out.println("Movement: " + movement);
        System.out.println();
    }

    public void walk(final boolean type) {
        this.isWalk = type;
    }

    public Player getPlayer() {
        return this.player;
    }

    public int getHP() {
        return this.HP;
    }

    public int getMoney() {
        return this.money;
    }

    public int getWeapon() {
        return this.weapon;
    }

    public boolean isWalk() {
        return this.isWalk;
    }
}
