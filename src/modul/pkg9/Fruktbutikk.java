/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg9;
import java.util.ArrayList;

/**
 *
 * @author Marius
 */
public class Fruktbutikk {
    private ArrayList<Vare> inventar;
    
    public Fruktbutikk(int price, String name)
    {
        inventar = new ArrayList<>();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fruktbutikk butikken = new Fruktbutikk(0, "sampleButikk");
        butikken.addFrukt(0, "sampleFruit", 0);
        butikken.listVarer();
    }
    
    public void addToList(Vare a)
    {
        inventar.add(a);
    }
    
    public void listVarer()
    {
        for(Vare item: inventar){
            item.printVare();
        }
    }
    
    public void addFrukt(int price, String name, int weight)
    {
        Frukt enFrukt = new Frukt(price, name, weight);
    }
        
}
