
package com.cfs3.proyectopets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class UsuarioCtr {

    List<UsuarioDto> listUsu;
    //constructora

    public UsuarioCtr() {
        this.listUsu = new ArrayList<>();
    }
    //metodos

    void registrarUsuario(int idUsuario, String apellidoYnombre, String correo, String contrasenia, String direccion, int telefono) {
        //agrega un usuario
        //int indice=listUsu.size();
        UsuarioDto usuario = new UsuarioDto(idUsuario, apellidoYnombre, correo, contrasenia, direccion, telefono);
        listUsu.add(usuario);
    }
    void agregarFicha(UsuarioDto usu,FichaDto f){
     List<FichaDto> l=usu.getListaFichas();
     l.add(f);
    }
    private boolean existeUsuario(String nombUsu, String contrasenia) {
        Iterator<UsuarioDto> listU = this.listUsu.iterator();
        boolean corte = false;
        UsuarioDto user;
        while (!corte) {
            if (listU.hasNext()) {
                user = listU.next();
                if ((user.getApellidoynombre().equals(nombUsu)) && (user.getContrasenia().equals(contrasenia))) {
                    corte = true;//el usuario ya existe
                }

            } else {
                return false;//no existe el usuario
            }
        }
        return true;
    }

    private boolean existeUsuarioId(int idUsuario) {
        Iterator<UsuarioDto> listU = this.listUsu.iterator();
        boolean corte = false;
        UsuarioDto user;
        while (!corte) {
            if (listU.hasNext()) {
                user = listU.next();
                if (user.getIdUsuario() == idUsuario) {
                    corte = true;//el usuario existe
                }

            } else {
                return false;//no existe el usuario
            }
        }
        return true;
    }

    public void eliminarUsuario(int i) {
        //elimina el usuario i
        Iterator<UsuarioDto> listU = this.listUsu.iterator();
        boolean corte = false;
        UsuarioDto user;
        while (!corte) {
            if (listU.hasNext()) {
                user = listU.next();
                if (user.getIdUsuario() == i) {
                    this.listUsu.remove(user);
                    System.out.println("Se ha eliminado el usuario: "+user.getIdUsuario()+" "+user.getApellidoynombre());
                    corte = true;//el usuario existe y fue eliminado
                }

            } else {
                System.out.println("El usuario " + i + " " + "no existe");//no existe el usuario
                corte = true;

            }
        }
    }

    public void modificarContraseñia(String nombUsu, String c) {
        Iterator<UsuarioDto> listU = this.listUsu.iterator();
        boolean corte = false;
        UsuarioDto user;
        while (!corte) {
            if (listU.hasNext()) {
                user = listU.next();
                if (user.getApellidoynombre().equals(nombUsu)) {
                    user.setContrasenia(c);
                    corte = true;//el usuario existe
                }

            } else {
                System.out.println("El usuario " + nombUsu + " " + "no existe");//no existe el usuario
                corte=true;
            }
        }
    }

    public void modificarDireccion(String nombUsu, String d) {
        Iterator<UsuarioDto> listU = this.listUsu.iterator();
        boolean corte = false;
        UsuarioDto user;
        while (!corte) {
            if (listU.hasNext()) {
                user = listU.next();
                if (user.getApellidoynombre().equals(nombUsu)) {
                    user.setDireccion(d);
                    corte = true;//el usuario existe
                }

            } else {
                System.out.println("El usuario " + nombUsu + " " + "no existe");//no existe el usuario
                corte=true;
            }
        }
    }

    public void modificarTelefono(String nombUsu, int t) {
        Iterator<UsuarioDto> listU = this.listUsu.iterator();
        boolean corte = false;
        UsuarioDto user;
        while (!corte) {
            if (listU.hasNext()) {
                user = listU.next();
                if (user.getApellidoynombre().equals(nombUsu)) {
                    user.setTelefono(t);
                    corte = true;//el usuario existe
                }

            } else {
                System.out.println("El usuario " + nombUsu + " " + "no existe");//no existe el usuario
                corte=true;
            }
        }
    }
    public UsuarioDto buscarUsuario(int idUs){
        //busca una mascota en base a un ID
      Iterator<UsuarioDto> listU = this.listUsu.iterator();
        boolean corte = false;
        UsuarioDto usu=null;
        while (!corte) {
            if (listU.hasNext()) {
                usu = listU.next();
                if (usu.getIdUsuario()==idUs) {
                    corte = true;//un mascota con ese ID existe
                }

            } else {
                System.out.println("El usuario con ID"+idUs+" "+"no existe");//no existe un usuario con ese ID
                corte=true;
            }
        }
        return usu;
    }

    @Override
    public String toString() {
        String us = "Fin listado Usuarios";
        System.out.println("");
     System.out.println("Listado de usuarios");
        for (UsuarioDto listU : listUsu) {
            System.out.println("ID Usuario: " + listU.getIdUsuario() + " Apellido y nombre: " + listU.getApellidoynombre() + " Correo: " + listU.getCorreo() + " Dirección: " + listU.getDireccion() + " Teléfono: " + listU.getTelefono());
        }
        return us;
    }
    public UsuarioDto UsuarioConContrasenia(String usuario, String contrasenia){
      //busca en la base de datos que el correo (usuario) y la contraseñia coincidan  
      List <UsuarioDto> result = null;
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();

                Query q = session.createQuery("from UsuarioDto where correo=:param1 and contrasenia=:param2");
                q.setParameter("param1", usuario);
                q.setParameter("param2", contrasenia);
                
                result = q.list();

                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result!=null){
             System.out.println("El usuario :"+usuario+" y la contraseña: "+contrasenia+" son correctos!");
        }
        else{
            System.out.println("El usuario :"+usuario+" y la contraseña: "+contrasenia+" no son correctos!");
        }
        return result.get(0);
        }
    public void agregarUsuario(int idUsuario,String nya,String correo, String contrasenia, String direccion, int telefono){
        //agrega un registro a la base de datos
      
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();
                
                Query q = session.createQuery("insert into UsuarioDto(`idUsuario`,`apellidoynombre`,`correo`,`contrasenia`,`direccion`, `telefono`) values (:param1,:param2,:param3,:param4,:param5,:param6)"); 
                q.setParameter("param1",idUsuario);
                q.setParameter("param2",nya);
                q.setParameter("param3",correo);
                q.setParameter("param4",contrasenia);
                q.setParameter("param5",direccion);
                q.setParameter("param6",telefono);
                session.save(q);
                
                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("El usuario :"+idUsuario+"Apellido y nombre: "+"se ha guardado correctamente!");
                
        }
    public void modificarUsuario(int idUsuario,String nya,String correo, String contrasenia, String direccion, int telefono){
        //modifica un registro de la base de datos 
      
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();
                
                Query q = session.createQuery("update UsuarioDto set`idUsuario`=:param1,set `apellidoynombre`=:param2,set `correo`=:param3,set `contrasenia`=:param4,set `direccion`=:param5, set `telefono`=:param6"); 
                q.setParameter("param1",idUsuario);
                q.setParameter("param2",nya);
                q.setParameter("param3",correo);
                q.setParameter("param4",contrasenia);
                q.setParameter("param5",direccion);
                q.setParameter("param6",telefono);
                session.update(q);
                
                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("El usuario :"+idUsuario+"Apellido y nombre: "+"se ha guardado correctamente!");
                
        }
    public UsuarioDto buscarUsuarioBD(int idUsu){
        //busca el usuario con IdUsu en la BD y la devuelve
        UsuarioDto usu= new UsuarioDto();
        List<UsuarioDto> lS=new ArrayList();
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                //guarda mascota en la base de datos
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();

                //buscar en BD   
                Query q = session.createQuery("from UsuarioDto where idUsuario=:param1"); 
                q.setParameter("param1",idUsu);
                lS=q.list(); 
                if (lS.isEmpty()){
                    System.out.println("El usuario con id "+idUsu+" No existe.");
                    
                    }
                else{
                    usu=lS.get(0);
                    System.out.println("La usuario es: "+usu.getIdUsuario() + usu.getApellidoynombre()+ usu.getCorreo() + usu.getDireccion() + usu.getTelefono() + usu.getContrasenia());
                }
                
                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lS.get(0);
    }
    public int ultimoUsuarioBD(){
        //busca el id del ultimo usuario en la BD
        UsuarioDto usu= new UsuarioDto();
        List<UsuarioDto> lS=new ArrayList();
        int ultimo=0;
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                //guarda mascota en la base de datos
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();

                //buscar en BD   
                Query q = session.createQuery("from UsuarioDto"); 
                
                lS=q.list();
                if (q.list().isEmpty()){
                    System.out.println("No hay usuarios cargados");
                    ultimo=0;
                    }
                else{
                    
                    usu=lS.get(q.list().size()-1);
                    ultimo=usu.getIdUsuario();
                    System.out.println("El último usuario es: "+usu.getIdUsuario() + usu.getApellidoynombre()+ usu.getCorreo() + usu.getDireccion() + usu.getTelefono() + usu.getContrasenia());
                }
                
                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ultimo;
    }
}

