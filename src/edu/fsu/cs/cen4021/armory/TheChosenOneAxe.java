package edu.fsu.cs.cen4021.armory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by David on 2/6/2017.
 */
public class TheChosenOneAxe extends BasicWeapon implements Weapon {

    TheChosenOneAxe() {super(60);}

    @Override
    public int hit(){
        try {
            return getDamage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int hit(int armor){
        if(armor < 20){
            armor = 0;
        }

        int damage = 0;
        try {
            damage = getDamage() - armor;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

    public int getDamage() throws IOException {
        int damage = 0;
        BufferedReader br = new BufferedReader(new FileReader("conf/thechosenone.txt"));
        String line = null;
        while ((line = br.readLine()) != null){
            if(line.contains("polo")){
                return damage;
            }
            damage++;
        }

        return 0;
    }
}
