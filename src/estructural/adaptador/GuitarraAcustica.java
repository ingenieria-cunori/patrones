/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural.adaptador;

/**
 *
 * @author hcalderon
 */
public class GuitarraAcustica extends Instrumento{

    @Override
    public void interpretar() {
        System.out.println("Tocando la Guitarra...");
    }

    @Override
    public void silencio() {
        System.out.println("Silencio...");
    }
    
}
