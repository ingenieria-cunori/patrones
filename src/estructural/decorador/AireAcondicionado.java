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
public class AireAcondicionado extends AutoDecorador{

    public AireAcondicionado(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return getVendible().getDescripcion() + " + Aire Acondicionado(+Q1,500)";
    }

    @Override
    public int getPrecio() {
        return getVendible().getPrecio() + 1500;
    }
    
}
