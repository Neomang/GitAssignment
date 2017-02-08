package edu.fsu.cs.cen4021.armory;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by David on 2/7/2017.
 */
public class AncientMagicStaff extends BasicWeapon implements Weapon {

    AncientMagicStaff() {
        super(70);
    }

    @Override
    public int hit() {
        return getDamage();
    }

    @Override
    public int hit(int armor) {
        return getDamage() - (int) (armor * .75);
    }

    private int getDamage() {
        int damage = 0;

        List<Integer> object = null;

        try {
            FileInputStream fileIn = new FileInputStream("conf/ancientstaff.obj");
                    ObjectInputStream objIn = new ObjectInputStream(fileIn);
            object = (List<Integer>) objIn.readObject();
            objIn.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < object.size(); i++) {
            int item = object.get(i);
            item = (int) Math.pow(item, 2);
            object.set(i, item);
        }

        object.remove(2);
        object.remove(5);

        Collections.reverse(object);

        for (int i = 0; i < object.size(); i++) {
            damage += object.get(i);
        }

        return damage;
    }
}
