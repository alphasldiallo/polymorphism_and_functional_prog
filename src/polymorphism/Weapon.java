/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Admin
 */
public class Weapon {
    
    private String name;
    private int damage;
    private int ammu;

    public Weapon(String name, int damage, int ammu) {
        this.name = name;
        this.damage = damage;
        this.ammu = ammu;
    }
    
    public int getAmmu() {
        return ammu;
    }

    public void setAmmu(int ammu) {
        this.ammu = ammu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
   
    
}
