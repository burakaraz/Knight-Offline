
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : @Knight Offline
//  @ File Name : Grade1Decorator.java
//  @ Date : @31.03.2015
//  @ Author : @Burak Araz
//
//
public class Grade1Decorator extends KnightDecorator {

    
    public Grade1Decorator(Knight knightToBeDecorated) {
        super(knightToBeDecorated);
    }

    @Override
    public void draw(Graphics g) {
        this.knightToDecorated.draw(g);
        
        if (this.getType() == 2) {

            Graphics2D g2d = (Graphics2D) g.create();
            int xtopleft = this.getxPos();
            int ytopleft = this.getyPos();

             g2d.setColor(Color.WHITE);
            g2d.drawOval(xtopleft, ytopleft+40, 3, 3);
            g2d.fillRect(xtopleft, ytopleft+40, 3, 3);
           

        }
        else if (this.getType() == 0) {

            Graphics2D g2d = (Graphics2D) g.create();
            int xtopleft = this.getxPos();
            int ytopleft = this.getyPos();

            g2d.setColor(Color.WHITE);
            g2d.drawOval(xtopleft+20, ytopleft+40, 3, 3);
            g2d.fillRect(xtopleft+20, ytopleft+40, 3, 3);
            

        }
        else if (this.getType() == 1) {

            Graphics2D g2d = (Graphics2D) g.create();
            int xtopleft = this.getxPos();
            int ytopleft = this.getyPos();

            g2d.setColor(Color.WHITE);
            g2d.drawOval(xtopleft+40, ytopleft+20, 3, 3);
            g2d.fillRect(xtopleft+40, ytopleft+20, 3, 3);
            
            
        }
    }
}
