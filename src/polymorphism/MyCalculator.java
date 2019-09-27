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
public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (n%i == 0){
                sum+=i;
            }
        }
        return sum;
    }
    
    
}
