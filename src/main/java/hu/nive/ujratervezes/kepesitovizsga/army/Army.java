package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){
        army.add(militaryUnit);
    }

    public int getArmySize(){
        return army.size();
    }
    public int getArmyDamage(){
        int sum = 0;
        for(MilitaryUnit item : army){
            sum += item.doDamage();
        }
        return sum;
    }

    public void damageAll(int damage){
        for(MilitaryUnit item : army){
            item.sufferDamage(damage);
        }
        Iterator<MilitaryUnit> iterator = army.iterator();
        while (iterator.hasNext()) {

            if (iterator.next().hitPoints < 25) {
                iterator.remove();
            }
        }
    }


}
