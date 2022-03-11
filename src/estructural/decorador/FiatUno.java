/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural.decorador;

/**
 *
 * @author Hendrick
 */
public class FiatUno extends Auto{

    @Override
    public String getDescripcion() {
        return "Fiat Uno modelo 2006";
    }

    @Override
    public int getPrecio() {
        return 20000;
    }
    
}
