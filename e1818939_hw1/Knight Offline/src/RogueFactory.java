//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : @Knight Ofline
//  @ File Name : RogueFactory.java
//  @ Date : @31.03.2015
//  @ Author : @Burak Araz
//
//

public class RogueFactory extends SoldierFactory {

    @Override
    public Knight produce(int team, int id) {
        // TODO Auto-generated method stub
        if (team == 0) { //KARUS
            Strategy strategy = new MoveRandomly();

            Rogue rogue = new Rogue(id, 200, 550, 150, 0, 100, 500, strategy, 0, 0, null);

            Simulation.getInstance().getKarusList().add(rogue);
        } else {
            Strategy strategy = new MoveRandomly();

            Rogue rogue = new Rogue(id, 900, 200, 150, 0, 100, 500, strategy, 1, 0, null);

            Simulation.getInstance().getElmoradList().add(rogue);
        }
        return null;
    }
}
