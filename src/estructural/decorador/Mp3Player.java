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
public class Mp3Player extends AutoDecorador{

    public Mp3Player(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion()+ " +Mp3 Player (+Q2,000)";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio()+ 2000;
    }
    
}
