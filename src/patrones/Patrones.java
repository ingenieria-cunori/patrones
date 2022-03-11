/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import comportamiento.chainofrespon.Banco;
import creacion.factory.Conexion;
import creacion.factory.FabricaConexiones;
import creacion.singleton.Usuario;
import estructural.decorador.AireAcondicionado;
import estructural.decorador.Cuero;
import estructural.decorador.FiatUno;
import estructural.decorador.FordFiesta;
import estructural.decorador.Mp3Player;
import estructural.decorador.Vendible;

/**
 *
 * @author hendrick
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = Usuario.getInstance();
        System.out.println(usuario.toString());
        usuario.setNickname("Ingenieria");
        Usuario usuario2 = Usuario.getInstance();
        System.out.println(usuario2.toString());

        System.out.println("--------------------------");

        Vendible auto = new FiatUno();
        auto = new AireAcondicionado(auto);
        auto = new Mp3Player(auto);

        System.out.println(auto.getDescripcion());
        System.out.println("Precio: " + auto.getPrecio());

        Vendible auto2 = new FordFiesta();
        System.out.println(auto2.getDescripcion());
        System.out.println("Precio: " + auto2.getPrecio());

        auto2 = new AireAcondicionado(auto2);
        auto2 = new Cuero(auto2);
        System.out.println(auto2.getDescripcion());
        System.out.println("Precio: " + auto2.getPrecio());

        System.out.println("--------------------------");
        
        FabricaConexiones miFabrica;
        Conexion miConexion;

        miFabrica = new FabricaConexiones("Mysql");
        miConexion = miFabrica.CreaConexion();
        System.out.println("Cuenta con: " + miConexion.descripcion());
        
        miFabrica = new FabricaConexiones("Oracle");
        miConexion = miFabrica.CreaConexion();
        System.out.println("Cuenta con: " + miConexion.descripcion());
        
        System.out.println("--------------------------");
        Banco banco = new Banco();
        banco.solicitudPrestamo(150000);

    }

}
