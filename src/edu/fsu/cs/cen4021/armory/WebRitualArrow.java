package edu.fsu.cs.cen4021.armory;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by David on 2/8/2017.
 */
public class WebRitualArrow extends BasicWeapon implements Weapon {

    WebRitualArrow() { super(70); }

    @Override
    public int hit() {
        return getDamage();
    }

    @Override
    public int hit(int armor) {
        if (armor >= 5) {
            armor = armor - 10;
        } else {
            armor = 0;
        }

        int damage = getDamage() - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

    private int getDamage(){
        Document doc = new Document("http://ww2.cs.fsu.edu/~escobara/courses/cen4021.html");

        try {
            doc = Jsoup.connect("http://ww2.cs.fsu.edu/~escobara/courses/cen4021.html").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String textContents = doc.select("h1").first().text();

        return Integer.parseInt(textContents);
    }
}

