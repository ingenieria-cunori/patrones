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
public class GuitarraElectricaAdaptador extends Instrumento{
    GuitarraElectrica guitarraElectrica;

    public GuitarraElectricaAdaptador(GuitarraElectrica guitarraElectrica) {
        super();
        this.guitarraElectrica = guitarraElectrica;
    }
        
    
    @Override
    public void interpretar() {
        guitarraElectrica.encender();
        guitarraElectrica.subirVolumen();
        System.out.println("Tocando la Guitarra electrica");
    }

    @Override
    public void silencio() {
        guitarraElectrica.apagar();
        System.out.println("Silencio......");
    }
    
}
