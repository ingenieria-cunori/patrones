/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacion.factory;

/**
 *
 * @author Hendrick
 */
public class ConexionOracle extends Conexion{

    public ConexionOracle() {
    }
    
    @Override
    public String descripcion(){
        return "Conexión ORACLE!!";
    }
}
