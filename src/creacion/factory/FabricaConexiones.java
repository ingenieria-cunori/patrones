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
public class FabricaConexiones {
    protected String tipo;

    public FabricaConexiones(String tipo) {
        this.tipo = tipo;
    }
    
    public Conexion CreaConexion(){
        if (tipo.equalsIgnoreCase("Oracle")){
            return new ConexionOracle();
        }
        if (tipo.equalsIgnoreCase("Mysql")){
            return new Mysql();
        }
        if (tipo.equalsIgnoreCase("SqlServer")){
            return new SqlServerConexion();
        }
        throw new IllegalArgumentException("No existe esa conexion");
    }   
    
}
