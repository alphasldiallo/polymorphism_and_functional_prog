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
public class Soar {

    public static void main(String[] args) {
        //p1 get the same attributes than Player
        Infantry p1 = new Infantry();
        
        //Polymorphism or generalisation
        Knight p2 = new Knight("Arthur");
        
        //Knight will have 4 lives because the value of lives has been overrided in Knight's class
        System.out.println(p1.getLives());
        System.out.println(p2.getLives());
        
        //Interfaces
        Horse h1 = new Horse();
        
        //Player 2 move with horse h1
        p2.move(h1);
        
        MyCalculator m = new MyCalculator();
        System.out.println(m.divisor_sum(6)+"\n");
        
        //test
        
        
    }
    
}
