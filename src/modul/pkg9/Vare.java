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
public class Vare {
    private int price;
    private String name;
 
    public Vare(int price, String name)
    {
        this.price = price;
        this.name = name;
    }
    
    public void printVare()
    {
        System.out.println("Vare " + name + " Koster" + price);
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public String getName()
    {
        return this.name;
    }
}
