package com.cfs3.proyectopets;

import java.util.Calendar;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import vistas.CargarFicha;
import vistas.VistaPrincipal;

public class petMain {
  
  
    public static void main(String[] args) {
        
        VistaPrincipal vista = new VistaPrincipal();
        vista.setVisible(true);
        
                
    }

    public static void ejemplo1(Session session) {
        // Traigo el cliente con ID 1
        UsuarioDto m = session.load(UsuarioDto.class, 4);
        System.out.println(m.getApellidoynombre() + " " + m.getContrasenia() + " " + m.getCorreo() + " " + m.getDireccion());
//
//        // Imprimo sus teléfonos
//        System.out.println("---Telefonos");
//        for (Telefono telefono : c.getTelefonos()) {
//            System.out.println(telefono.getNumero());
//        }
//
//        // Imprimo sus facturas
//        for (Factura factura : c.getFacturas()) {
//            System.out.println("---Factura");
//            System.out.println(factura);
//            for (DetalleFactura detalleFactura : factura.getDetalleFactura()) {
//                System.out.println(detalleFactura);
//            }
//        }
    }
//
//    public static void ejemplo2(Session session) {
//
//        CriteriaQuery<Cliente> q = session.getCriteriaBuilder().createQuery(Cliente.class);
//        q.select(q.from(Cliente.class));
//        List<Cliente> l = session.createQuery(q).list();
//        System.out.println("Lista de clientes");
//        for (Cliente cl : l) {
//
//            System.out.println(cl);
//        }
//    }
//

    public static void ejemplo3(Session session) {

        //Query q = session.createQuery("from UsuarioDto where direccion = arana", UsuarioDto.class);
        Query q = session.createQuery("from MascotaDto where color = :color");
        q.setParameter("color", "gris");
        List<MascotaDto> l = q.list();
        System.out.println("Lista de mascotas");
        for (MascotaDto mas : l) {
            System.out.println(mas.getNombre() + " " + mas.getColor() + " " + mas.getSexo() + " " + mas.getTipo());
        }
    }

    public static void mostraraca(Session session) {
        Query q = session.createQuery("from MascotaDto");//busca todas las mascotas cargadas en la BD    
        List<MascotaDto> l = q.list();
        for (MascotaDto mas : l) {
            System.out.println(mas.getNombre() + " " + mas.getColor() + " " + mas.getSexo() + " " + mas.getTipo());
        }
    }
}
