package com.uas.prakrplbo;

public class Evolusi extends Monster {
    private Monster monster1;
    private Monster monster2;


    public Evolusi(Monster monster1, Monster monster2) {
        super(monster1.getNama() + " " + monster2.getNama());
        this.monster1 = monster1;
        this.monster2 = monster2;

    }

    public String bersuara() {
        String container = "";
        for (int i = 0; i < monster1.bersuara().length(); i++) {
            if (i % 2 == 0) {
                container += monster2.bersuara().charAt(i);
            } else {
                container += monster1.bersuara().charAt(i);
            }

        }
        return container;
//        return monster2.bersuara();
    }
}