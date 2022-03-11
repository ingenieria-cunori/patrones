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
public class FordFiesta extends Auto{

    @Override
    public String getDescripcion() {
        return "Ford Fiesta modelo 2008";
    }

    @Override
    public int getPrecio() {
        return 35000;
    }
    
}
