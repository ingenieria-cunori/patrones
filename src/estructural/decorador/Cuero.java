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
public class Cuero extends AutoDecorador{

    public Cuero(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion()+ " + Cuero(+Q4,000)";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 4000;
    }
    
}
