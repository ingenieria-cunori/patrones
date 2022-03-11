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
public abstract class Auto implements Vendible{
    public String iniciar(){
        return "Iniciado";
    }
    
    public String acelerar(){
        return "Acelerando";
    }
    
    public String frenar(){
        return "Frenando";
    }
}
