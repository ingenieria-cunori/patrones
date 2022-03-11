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
public class EjecutivoDeCuenta implements IAprobador{
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
        if (monto <= 10000){
            System.out.println("Lo manejo yo, el ejecutivo de cuentas");
        }else{
            next.solicitudPrestamo(monto);
        }
    }
    
}
