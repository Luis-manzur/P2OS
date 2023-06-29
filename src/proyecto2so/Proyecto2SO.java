/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2so;
import Classes.Processor;
import Interface.main;

/**
 *
 * @author luism
 */
public class Proyecto2SO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        main inter = new main();
        inter.setVisible(true);
        Processor processor = new Processor(inter);
        
    }
    
}
