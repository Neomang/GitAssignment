package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon arrow = WeaponFactory.getWeapon("basicarrow");
        System.out.println("BasicArrow has " + arrow.hit() + " of damage.");
        int armor = 20;
        System.out.println("BasicArrow was able to do " + arrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon axe = WeaponFactory.getWeapon("basicaxe");
        System.out.println("BasicAxe has " + axe.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + axe.hit(armor) + " of damage due to an armor with " + armor + " points.");


        //TODO: Add the remaining weapons here

    }
}
