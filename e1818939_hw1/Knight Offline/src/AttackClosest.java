
import java.awt.Rectangle;
import static java.lang.Math.abs;
import java.util.Random;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : @Knight Offline
//  @ File Name : AttackClosest.java
//  @ Date : @31.03.2015
//  @ Author : @Burak Araz
//
//
public class AttackClosest extends Strategy {
    @Override
    public void act(Knight knight) {
        // TODO Auto-generated method stub
        Random rand = new Random();
        int chance = rand.nextInt(5);
        
        if (knight.getTeam() == 0) {
            int minDist = 4000;
            for (int j = 0; j < Simulation.getInstance().elmoradList.size(); j++) {
                int xdist = abs(knight.getxPos() - Simulation.getInstance().elmoradList.get(j).getxPos());
                int ydist = abs(knight.getyPos() - Simulation.getInstance().elmoradList.get(j).getyPos());
                if (xdist + ydist < minDist && Simulation.getInstance().elmoradList.get(j).getDead() == 0) {
                    knight.setTarget(Simulation.getInstance().elmoradList.get(j));
                    minDist = xdist + ydist;
                }
            }
        } else if (knight.getTeam() == 1) {
            int minDist = 4000;
            for (int j = 0; j < Simulation.getInstance().karusList.size(); j++) {
                int xdist = abs(knight.getxPos() - Simulation.getInstance().karusList.get(j).getxPos());
                int ydist = abs(knight.getyPos() - Simulation.getInstance().karusList.get(j).getyPos());
                if (xdist + ydist < minDist && Simulation.getInstance().karusList.get(j).getDead() == 0) {
                    knight.setTarget(Simulation.getInstance().karusList.get(j));
                    minDist = xdist + ydist;
                }
            }
        }
        boolean touch = false;
        if (knight.getTarget() != null) {
            if (chance == 0 || knight.getSpecialFlag() == 1) {
                touch = knight.rangedAttack();
            } 
            else if (knight.getSpecialFlag() != 1) {
                touch = knight.meleeAttack();
            }
            
            if (!touch) {
                if (knight.getxPos() - knight.getTarget().getxPos() < -20) {
                    knight.setxPos(knight.getxPos() + knight.getSpeed() / 25);
                } else if (knight.getxPos() - knight.getTarget().getxPos() > 20) {
                    knight.setxPos(knight.getxPos() - knight.getSpeed() / 25);
                }
                if (knight.getyPos() - knight.getTarget().getyPos() < -20) {
                    knight.setyPos(knight.getyPos() + knight.getSpeed() / 25);
                } else if (knight.getyPos() - knight.getTarget().getyPos() > 20) {
                    knight.setyPos(knight.getyPos() - knight.getSpeed() / 25);
                }
            }
        }
    }

    public boolean checkPosNormalAttack(Knight k, Knight e) {

        Rectangle rectK = new Rectangle(k.getxPos(), k.getyPos(), 40, 40);
        Rectangle rectE = new Rectangle(e.getxPos(), e.getyPos(), 40, 40);
        if (rectK.intersects(rectE)) {
            return true;
        }
        return false;
    }
}
