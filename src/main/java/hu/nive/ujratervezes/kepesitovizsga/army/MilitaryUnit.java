package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damage;
    protected boolean armor;


    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamagePoints() {
        return damage;
    }

    public boolean isArmor() {
        return armor;
    }

    public abstract int doDamage();

    public abstract void sufferDamage(int damage);

}