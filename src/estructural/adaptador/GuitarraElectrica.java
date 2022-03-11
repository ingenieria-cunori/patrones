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
public class GuitarraElectrica {
    private boolean estado;

    public GuitarraElectrica() {
        this.estado = false;
    }
    
    public void encender(){
        if (!estado){
            System.out.println("Encendiendo la guitarra electrica");
            estado = true;
        }else{
            
        }
    }
    
    public void apagar(){
        if (estado) {
            estado = false;
            System.out.println("Apagando guitarra.");
        }
    }
    
    public void subirVolumen(){
        System.out.println("Subiendo volumen!!!");
    }
}
