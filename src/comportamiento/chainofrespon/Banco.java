/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamiento.chainofrespon;

/**
 *
 * @author hcalderon
 */
public class Banco implements IAprobador{
     private IAprobador next;
 
    @Override
    public void setNext(IAprobador aprobador) {
        this.next = aprobador;
    }

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
        EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
        this.setNext(ejecutivo);
        
        LiderEquipoEjecutivo lider = new LiderEquipoEjecutivo();
        ejecutivo.setNext(lider);
        
        Gerente gerente = new Gerente();
        lider.setNext(gerente);
        
        Director director = new Director();
        gerente.setNext(director);
        
        next.solicitudPrestamo(monto);
    }
}
