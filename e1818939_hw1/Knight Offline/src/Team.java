//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : @Knight Ofline
//  @ File Name : Team.java
//  @ Date : @31.03.2015
//  @ Author : @Burak Araz
//
//

import java.awt.Color;

public class Team {

    public int score;
    public Color color;
    public int killNumber;
    public int totalDamage;
    public String name;
    public SoldierFactory factories;

    public Team(int score, Color color, int killNumber, int totalDamage, String name, SoldierFactory factories) {
        this.score = score;
        this.color = color;
        this.killNumber = killNumber;
        this.totalDamage = totalDamage;
        this.name = name;
        this.factories = factories;
    }

}
