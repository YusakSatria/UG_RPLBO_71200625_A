package com.ug8.dota;

public class App
{
    public static void main( String[] args )
    {
        Creep creep1 = new Creep("Creep1",20,200);
        Creep creep2 = new Creep("Creep2",20,200);
        Creep creep3 = new Creep("Creep3",20,200);

        LoneDruid loneDruid = new LoneDruid();
        Warlock warlock = new Warlock();
        SpiritBear spiritBear = loneDruid.summon();
        Golem golem = warlock.summon();

        System.out.println("Sebelum SpiritBear dan Golem Di Serang");
        spiritBear.showCharacterInfo();
        System.out.println("\n");
        warlock.showCharacterInfo();
        System.out.println("\n");

        creep1.attack(spiritBear);
        creep1.attack(golem);

        System.out.println("Setelah SpiritBear dan Golem Di Serang");
        spiritBear.showCharacterInfo();
        warlock.showCharacterInfo();

        System.out.println("Sebelum Creep1, Creep2, dan Creep3 di Serang");
        creep1.showCharacterInfo();
        System.out.println("\n");
        creep2.showCharacterInfo();
        System.out.println("\n");
        creep3.showCharacterInfo();
        System.out.println("\n");

        System.out.println("Setelah Creep1, Creep2, dan Creep3 Di Serang");
        loneDruid.attack(creep1);
        spiritBear.attack(creep2);
        warlock.attack(creep3);

        System.out.println("Sebelum Creep1 dan Creep2 Di Serang");
        creep1.showCharacterInfo();
        System.out.println("\n");
        creep2.showCharacterInfo();
        System.out.println("\n");

        System.out.println("Setelah Creep1 dan Creep2 Di Serang");
        golem.attack(creep1);
        golem.attack(creep2);
        Golem minigolem = (Golem) golem.summon();

        loneDruid.showCharacterInfo();
        System.out.println("\n");
        spiritBear.showCharacterInfo();
        System.out.println("\n");
        minigolem.showCharacterInfo();

    }
}