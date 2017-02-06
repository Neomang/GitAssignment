package edu.fsu.cs.cen4021.armory;

/**
 * Created by David on 2/6/2017.
 */
public class SimpleAxe extends BasicWeapon implements Weapon{
    SimpleAxe() {super(60);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if(armor < 20){
            armor = 0;
        }

        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
