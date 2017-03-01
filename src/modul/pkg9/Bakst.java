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
public class Bakst extends Vare {
    private boolean wholeWheat = false;
    
    public Bakst (int price, String name, boolean wholeWheat)
    {
        super(price, name);
        this.wholeWheat = wholeWheat;
    }
   
    @Override
    public void printVare()
    {
        System.out.println("Bakst " + super.getName() + " koster " + super.getPrice() + " er helhvete? " + this.wholeWheat);
        System.out.println();
    }
}
