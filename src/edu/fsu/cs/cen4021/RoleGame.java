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

        Weapon arrow = WeaponFactory.getWeapon("simplearrow");
        System.out.println("SimpleArrow has " + arrow.hit() + " of damage.");
        System.out.println("SimpleArrow was able to do " + arrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon axe = WeaponFactory.getWeapon("simpleaxe");
        System.out.println("SimpleAxe has " + axe.hit() + " of damage.");
        System.out.println("SimpleAxe was able to do " + axe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon staff = WeaponFactory.getWeapon("simplemagicstaff");
        System.out.println("SimpleMagicStaff has " + staff.hit() + " of damage.");
        System.out.println("SimpleMagicStaff was able to do " + staff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here

    }
}
