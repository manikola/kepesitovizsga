package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    private int hitPoints;
    private int damage;
    private boolean armor;


    public Archer() {
        this.hitPoints = 50;
        this.damage = 20;
        this.armor = false;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isShield() {
        return armor;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -= damage;
    }
}



