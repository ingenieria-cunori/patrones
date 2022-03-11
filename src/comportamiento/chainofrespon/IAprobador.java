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
public interface IAprobador {
    public void setNext(IAprobador aprobador);
    public IAprobador getNext();
    public void solicitudPrestamo(int monto);    
}
