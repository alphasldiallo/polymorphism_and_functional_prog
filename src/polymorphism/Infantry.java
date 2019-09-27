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
public class Infantry extends Player {

    private String name;
    private String Rang;

    public Infantry() {
        this.name = name;
        this.Rang = Rang;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRang() {
        return Rang;
    }

    public void setRang(String Rang) {
        this.Rang = Rang;
    }

    

    @Override
    public boolean hasSword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasGun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
