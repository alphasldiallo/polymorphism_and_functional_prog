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
public abstract class Player {

    protected String name;
    private int points;
    private int lives;
    private int power;
    
     //Constructeur de la classe Player: Définit les valeurs par défaut
    public Player(){
        this.name="Peach";
        this.points=0;
        this.lives=3;
        this.power=0;
    }
    
    public void PlayerState(){
        System.out.println("I'm a player");
        System.out.println("My name is "+name);
        System.out.println("I have "+lives+" lives remaining");
        System.out.println("My power is "+power);
    }
    
    public int getPoints(){
        return this.points;
    }
    
   
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getPower() {
        return power;
    }

    void setPower(int power) {
        this.power = power;
    }
    
    public void equipPlayer(Weapon weapon, Integer ammu){
        
    }
    
   //Les méthodes surchargées doivent forcément être définies dans les classes enfants
   public abstract boolean hasSword();
   public abstract boolean hasGun();
    
    
}
