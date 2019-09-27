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
public class Knight extends Player {

    private String kingsName;
    
    public Knight(String kingsName) {
        this.kingsName = kingsName;
    }
    
    //Now, the knights can get by default 4 lives
    @Override
    public int getLives(){
        //A knight cannot die
        return 4;
    }
 
    
    public String getKingsName() {
        return kingsName;
    }

    public void setKingsName(String kingsName) {
        this.kingsName = kingsName;
    }
    

    @Override
    public boolean hasSword() {
        return true;
    }

    @Override
    public boolean hasGun() {
        return false;
    }
    
    public void move(Vehicle horse){
        horse.move("Lausanne");
    }
    
}
