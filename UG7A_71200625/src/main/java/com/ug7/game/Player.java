package com.ug7.game;

public class Player {
    private String username;
    private String password;
    private int level = 1;

    public Player(String username, String password) {this.username = username; this.password = password;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public int getLevel() {return level;}

    public void levelUp() {this.level += 1;}
}
