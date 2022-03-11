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
public class Mysql extends Conexion{

    public Mysql() {
    }
    
    @Override
    public String descripcion(){
        return "Conexión MYSQL";
    }
}
