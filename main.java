import java.util.ArrayList;
import java.util.Random;

import Units.*;


public class main {

    public static void main(String[] args) {
        ArrayList<Unit> list = new ArrayList<>();
        ArrayList<Unit> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            switch (new Random().nextInt(3)){
                case 0:
                    list.add(new Crossbowman(getName()));
                    break;
                case 1:
                    list.add(new Monk(getName()));
                    break;
                default:
                    list.add(new Robber(getName()));
                    break;
            }
            switch (new Random().nextInt(3)){
                case 0:
                    list2.add(new Spearman(getName()));
                    break;
                case 1:
                    list2.add(new Robber(getName()));
                    break;
                default:
                    list2.add(new Sniper(getName()));
                    break;
            }
        }

        list.forEach(u -> u.getNAME());
    }

    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}


