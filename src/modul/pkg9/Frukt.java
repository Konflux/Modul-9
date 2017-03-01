/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9;

/**
 *
 * @author Marius
 */
public class Frukt extends Vare {
    private int weight;
    
    public Frukt (int price, String name, int weight)
    {
            super(price, name);
            this.weight = weight;
    }
    
        @Override
        public void printVare()
    {
        System.out.println("Frukt " + super.getName() + " koster " + super.getPrice() +  " og veier " + this.weight);
        System.out.println();
    }
}
