/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfs3.proyetomascotasm;

import com.fasterxml.classmate.AnnotationConfiguration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author AleC
 */
public class petsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creacion usuarios
        UsuarioCtr usCtr = new UsuarioCtr();
        usCtr.registrarUsuario(1, "Almada Ernesto", "almadaernesto@gmail.com", "almadae123", "Laprida 352", 4434477);
        usCtr.registrarUsuario(2, "Bernal Patricia", "bernalpatricia@gmail.com", "bernalp123", "arana 567", 4428943);
        usCtr.registrarUsuario(3, "Santin Mariano", "santinmariano@gmail.com", "santinm123", "brasil 155", 4442390);
        usCtr.registrarUsuario(4, "Rodriguez Lucia", "rodriguezlucia@gmail.com", "rodriguezl123", "estrada 67", 4456799);

        //creacion mascotas
        MascotaCtr mascoCtr = new MascotaCtr();
        mascoCtr.registrarMascota(1, "pepo", "gato", "negro y blanco", "macho");
        mascoCtr.registrarMascota(2, "laica", "perro", "marron", "hembra");
        mascoCtr.registrarMascota(3, "nn", "gato", "gris", "hembra");
        mascoCtr.registrarMascota(4, "nn", "perro", "negro", "macho");
        mascoCtr.registrarMascota(5, "nn", "perro", "gris", "hembra");

        //creacion fichas
        FichaCtr fiCtr = new FichaCtr();
        Date fecha1 = new Date(2018, 6, 15);
        Date fecha2 = new Date(2018, 5, 20);
        Date fecha3 = new Date(2018, 5, 10);
        Date fecha4 = new Date(2018, 6, 9);
        fiCtr.agregarFicha(1, mascoCtr.buscarMascota(2), usCtr.buscarUsuario(1), "perdido", "arana al 500", fecha1);
        fiCtr.agregarFicha(2, mascoCtr.buscarMascota(3), usCtr.buscarUsuario(3), "encontrado", "callao al 200", fecha2);
        fiCtr.agregarFicha(3, mascoCtr.buscarMascota(1), usCtr.buscarUsuario(4), "perdido", "laprida al 300", fecha3);
        fiCtr.agregarFicha(4, mascoCtr.buscarMascota(5), usCtr.buscarUsuario(2), "encontrado", "zona parque", fecha4);
        fiCtr.agregarFicha(5, mascoCtr.buscarMascota(4), usCtr.buscarUsuario(4), "encontrado", "dique parque", fecha3);
        //impresion de las fichas
        fiCtr.toString();

        // eliminacion de usuario y listado
        usCtr.eliminarUsuario(1);
        usCtr.toString();

        //eliminación de mascota y listado
        mascoCtr.eliminarMascota(2);
        mascoCtr.toString();

        //eliminacion de ficha y listado
        fiCtr.eliminarFicha(1);
        fiCtr.toString();

        //buscar mascotas, por ejemplo, encontradas en el parque
        fiCtr.buscarMascotaEn("encontrado", "parque");
        

    }

}
