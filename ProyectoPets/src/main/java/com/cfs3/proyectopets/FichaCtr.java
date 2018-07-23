package com.cfs3.proyectopets;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FichaCtr {

    Session session;
    List<FichaDto> listFicha;
    //constructora

    public FichaCtr() {
        this.listFicha = new ArrayList<>();
    }
    //metodos

    void agregarFicha(int idFicha, MascotaDto mascota, UsuarioDto usuario, String estado, String descripcion, Date fecha) {
        //agrega una ficha
        FichaDto ficha = new FichaDto(idFicha, mascota, usuario, estado, descripcion, fecha);
        listFicha.add(ficha);
    }

    private boolean existeFicha(UsuarioDto usuario, MascotaDto mascota, String estado) {
        //controla si existe una ficha con una mascota y un estado determinado
        Iterator<FichaDto> listF = this.listFicha.iterator();
        boolean corte = false;
        FichaDto ficha;
        while (!corte) {
            if (listF.hasNext()) {
                ficha = listF.next();

                if (ficha.getUsuario().equals(usuario) && ficha.getMascota().equals(mascota) && ficha.getEstado().equals(estado)) {
                    corte = true;//un ficha para un idMascota con un IdSuario y un estado existe.
                }

            } else {
                return false;//no existe una ficha con ese IdUsuario IdMascota y ese estado.
            }
        }
        return true;
    }

    public void eliminarFicha(int i) {
        //elimnina la ficha i
        Iterator<FichaDto> listF = this.listFicha.iterator();
        boolean corte = false;
        FichaDto ficha;
        while (!corte) {
            if (listF.hasNext()) {
                ficha = listF.next();
                if (ficha.getIdFicha() == i) {
                    this.listFicha.remove(ficha);
                    System.out.println("Se ha eliminado la ficha: " + ficha.getIdFicha() + " Mascota: " + ficha.getMascota().getIdMascota());
                    corte = true;//la ficha con idFicha existe y fue eliminada.
                }

            } else {
                System.out.println("La ficha " + i + " " + "no existe");//no existe una ficha con ese id
                corte = true;
            }
        }
    }

    public void eliminarFichasMasco(MascotaDto mascota) {
        //elimina todas las fichas relacionadas con una mascota
        Iterator<FichaDto> listF = this.listFicha.iterator();
        boolean corte = false;
        FichaDto ficha;
        while (listF.hasNext()) {
            ficha = listF.next();
            if (ficha.getMascota().equals(mascota)) {
                System.out.println("Se ha eliminado la ficha: " + ficha.getIdFicha() + "Mascota: " + ficha.getMascota().getIdMascota());
                listF.remove();
            }

        }

    }

    public void cambiarUsuario(UsuarioDto usuario, UsuarioDto nuevoU) {
        Iterator<FichaDto> listF = this.listFicha.iterator();
        boolean corte = false;
        FichaDto ficha;
        while (!corte) {
            if (listF.hasNext()) {
                ficha = listF.next();
                if (ficha.getUsuario().equals(nuevoU)) {
                    ficha.setUsuario(nuevoU);
                    corte = true;//un usuario con ese id existe y fue reemplazado
                }

            } else {
                System.out.println("El usuario " + nuevoU.getIdUsuario() + " " + "no existe en una ficha");//no existe un usuario con ese número de id
                corte = true;
            }
        }
    }

    public void modificarEstado(int idFicha, String estado) {
        Iterator<FichaDto> listF = this.listFicha.iterator();
        boolean corte = false;
        FichaDto ficha;
        while (!corte) {
            if (listF.hasNext()) {
                ficha = listF.next();
                if (ficha.getIdFicha() == idFicha) {
                    ficha.setEstado(estado);
                    corte = true;//la ficha con idFicha existe y su estado fue reemplazado.
                }

            } else {
                System.out.println("La ficha " + idFicha + " " + "no existe");//no existe una ficha con ese id
                corte = true;
            }
        }
    }

    public List<FichaDto> buscarMascotaenFicha(String estado, String descripcion) {
        //devuelve una lista de fichas de un determinado estado y descripción
        List<FichaDto> resultado = new ArrayList<>();
        Iterator<FichaDto> listF = this.listFicha.iterator();
        FichaDto ficha;

        while (listF.hasNext()) {
            ficha = listF.next();

            if ((ficha.getDescripcion().contains(descripcion)) && (ficha.getEstado() == estado)) {
                resultado.add(ficha);
            }
        }
        return resultado;

    }

    public FichaDto buscarFicha(int idFicha) {
        //busca una ficha con IdFicha en base de datos
        Iterator<FichaDto> listF = this.listFicha.iterator();
        boolean corte = false;
        FichaDto ficha = null;
        while (!corte) {
            if (listF.hasNext()) {
                ficha = listF.next();
                if (ficha.getIdFicha() == idFicha) {
                    corte = true;//ficha con ese Id encontrada!
                }

            } else {
                System.out.println("La ficha con ID" + idFicha + " " + "no existe");//no existe una ficha con ese ID
                corte = true;
            }
        }
        return ficha;
    }

    public void buscarMascotaEn(String estado1, String descripcion1) {
        List<FichaDto> lfi = new ArrayList<>();
        lfi = this.buscarMascotaenFicha(estado1, descripcion1); //busca en ficha mascotas en un estado que cumpla una descripcion dada
        System.out.println(" ");
        System.out.println("Listado de Mascotas en estado: " + estado1 + " descripción: " + descripcion1);
        for (FichaDto i : lfi) {
            //genera una lista de mascotas con las mascotas que cumplen los criterios

            System.out.println("idMascota " + i.getMascota().getIdMascota() + " " + " Nombre: " + i.getMascota().getNombre() + " " + " Encontrado en: " + i.getDescripcion());
        }
    }

    @Override
    public String toString() {
        String fi = "Fin listado Fichas";
        System.out.println("");
        System.out.println("Listado de fichas");
        for (FichaDto f : listFicha) {
            System.out.println("ID ficha " + f.getIdFicha() + " ID Mascota " + f.getMascota().getIdMascota() + " ID usuario " + f.getUsuario().getIdUsuario() + " Estado " + f.getEstado() + " Descripción " + f.getDescripcion() + " Fecha " + f.getFecha());
        }
        return fi;
    }

    public List<FichaDto> getFichas(String estado) {   //devuelve una lista de fichas en un estado determinado
        List<FichaDto> result = new ArrayList();
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();

                Query q = session.createQuery("FROM FichaDto WHERE estado =:param1");
                q.setParameter("param1", estado);
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
        System.out.println("conseguir fichas result: "+result.toString()+result.size());
        return result;
    }
    public FichaDto getFicha(int idFicha1) {   //devuelve una lista de fichas en un estado determinado
        List<FichaDto> result = new ArrayList();
        FichaDto fi=new FichaDto();
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();

                Query q = session.createQuery("FROM FichaDto WHERE idFicha =:param1");
                q.setParameter("param1", idFicha1);
                
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
        if (result==null){
            System.out.println("No hay fichas con idFicha: "+idFicha1);
            result.set(0,null);
        }
        else{
        System.out.println("La ficha resultante es: "+result.get(0).toString());
        }
        return result.get(0);
    }
public List<FichaDto> getFichas(String estado, String tipo, String sexo, String color, String descripcion) {   
    //devuelve una lista de fichas en un estado, tipo, sexo, color, descripcion determinado    
    List<FichaDto> result = new ArrayList();
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();

                Query q = session.createQuery("from FichaDto where estado=:param1 and descripcion=:param5 and idMascota in (from MascotaDto where tipo=:param2 and sexo=:param3 and color=:param4)");
                q.setParameter("param1", estado);
                q.setParameter("param2", tipo);
                q.setParameter("param3", sexo);
                q.setParameter("param4", color);
                q.setParameter("param5", descripcion);
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
        System.out.println("Se obtuvieron fichas: "+result.toString()+result.size());
        return result;
    }    
public List<MascotaDto> getListaMascotaFicha(String estado) {   
//devuelve una lista de mascotas de mascotas de fichas en un estado determinado        
        List<MascotaDto> listM=new ArrayList();
        List<FichaDto> listFichas=new ArrayList();
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();
                //obtiene lista de mascotas en un estado  
                Query q = session.createQuery("from MascotaDto where idMascota in(from FichaDto where estado=:param1)");
                q.setParameter("param1", estado);
                listM = q.list();
                
                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("se conseguieron fichas mascota : "+listM.toString()+listM.size());
        return listM;
    }
public List<MascotaDto> getListaMascotaFicha(String estado1, String tipo, String sexo,String color,String descripcion1) {
        //devuelve una lista de mascotas de mascotas de fichas con un estado, tipo, color, sexo y descripción determinados        
        List<MascotaDto> listM=new ArrayList();
        List<FichaDto> listFichas=new ArrayList();
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();
                //obtiene lista de mascotas en un estado  
                Query q = session.createQuery("from MascotaDto where tipo=:param2 and sexo=:param3 and color=:param4 and idMascota in(FROM FichaDto where (estado=:param1) and (descripcion=:param5))");
                q.setParameter("param1", estado1);
                q.setParameter("param2", tipo);
                q.setParameter("param3", sexo);
                q.setParameter("param4", color);
                q.setParameter("param5", descripcion1);
                listM = q.list();
                
                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("se encontraron las mascotas : "+estado1+" "+tipo+" "+sexo+" "+color+" "+listM.toString()+listM.size());
        return listM;     
    }

public int ultimaFichaBD(){
        //busca el id de la última ficha en la BD
        FichaDto fi= new FichaDto();
        List<FichaDto> lF=new ArrayList();
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
                Query q = session.createQuery("from FichaDto"); 
                
                lF=q.list();
                if (q.list().isEmpty()){
                    System.out.println("No hay fichas cargadas");
                    ultimo=0;
                    }
                else{
                    
                    fi=lF.get(q.list().size()-1);
                    ultimo=fi.getIdFicha();
                    System.out.println("La última ficha es: "+fi.getIdFicha() + fi.getEstado()+ fi.getFecha()+fi.getMascota().getIdMascota()+ fi.getDescripcion());
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
public void guardarMascotaBD(FichaDto f) {
        //guarda ficha nueva en base de datos 
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();
            try {
                //guarda mascota en la base de datos
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();

                //guarda en BD 
                
                System.out.println(f.getIdFicha() + f.getEstado() + f.getMascota().getNombre()+f.getUsuario().getApellidoynombre()+f.getDescripcion());
                session.save(f);

                session.getTransaction().commit();
                session.close();
                sessionFactory.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
