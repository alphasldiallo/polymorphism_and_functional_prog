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
public class Horse implements Vehicle {

    @Override
    public void move(String address) {
        System.out.println("I'm moving to "+address);
    }
    
}
