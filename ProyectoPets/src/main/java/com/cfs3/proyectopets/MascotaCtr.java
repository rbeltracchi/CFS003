package com.cfs3.proyectopets;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import vistas.CargaMascota;

public class MascotaCtr {

    List<MascotaDto> listMasco;
    int idMasco;
    //constructora

    public MascotaCtr() {
        this.listMasco = new ArrayList<>();
        this.idMasco = 0;
    }

    //metodos
    public List<MascotaDto> getListMasco() {
        return this.listMasco;
    }

    void registrarMascota(String nombre, String tipo, String color, String sexo) {
        //agrega una mascota a la lista
        this.idMasco++;
        MascotaDto mascota = new MascotaDto(idMasco, nombre, tipo, color, sexo);
        listMasco.add(mascota);
    }

    void registrarMascota(MascotaDto m) {
        //registro de mascota usando listas
        this.idMasco++;
        listMasco.add(m);
    }

    void registrarMascota() {
        //registro de mascota por base de datos
        this.idMasco++;
        String idMascoText = String.valueOf(idMasco);
        CargaMascota.main(idMascoText);

    }

    void agregarFicha(MascotaDto m, FichaDto f) {
        List<FichaDto> l = m.getListaFichasm();
        l.add(f);
    }

    private boolean existeMascota(String nombreM) {
        //controla si existe una mascota con el mismo nombre
        Iterator<MascotaDto> listM = this.listMasco.iterator();
        boolean corte = false;
        MascotaDto masco;
        while (!corte) {
            if (listM.hasNext()) {
                masco = listM.next();
                if (masco.getNombre().equals(nombreM)) {

                    corte = true;//un mascota con ese nombre ya existe
                }

            } else {
                return false;//no existe una mascota con ese nombre
            }
        }
        return true;
    }

    private boolean existeMascotaId(int idMascota) {
        //controla si existe una mascota con ese id
        Iterator<MascotaDto> listM = this.listMasco.iterator();
        boolean corte = false;
        MascotaDto masco;
        while (!corte) {
            if (listM.hasNext()) {
                masco = listM.next();
                if (masco.getIdMascota() == idMascota) {
                    corte = true;//un mascota con ese id existe
                }

            } else {
                return false;//no existe una mascota con ese id

            }
        }
        return true;
    }

    public void eliminarMascota(int i) {
        //elimina la mascota i
        Iterator<MascotaDto> listM = this.listMasco.iterator();
        boolean corte = false;
        MascotaDto masco;
        while (!corte) {
            if (listM.hasNext()) {
                masco = listM.next();
                if (masco.getIdMascota() == i) {
                    listMasco.remove(masco);
                    System.out.println("Se ha eliminado la mascota: " + masco.getIdMascota() + " " + masco.getNombre());
                    corte = true;//un mascota con ese nombre existe y fue eliminada
                }

            } else {
                System.out.println("La mascota " + i + " " + "no existe");//no existe una mascota con ese id
                corte = true;
            }
        }
    }

    public void modificarNombreM(String nombreM) {
        //cambia el nombre de una mascota por otro (solo cambia el de la primera)
        Iterator<MascotaDto> listM = this.listMasco.iterator();
        boolean corte = false;
        MascotaDto masco;
        while (!corte) {
            if (listM.hasNext()) {
                masco = listM.next();
                if (masco.getNombre().equals(nombreM)) {
                    masco.setNombre(nombreM);
                    corte = true;//un mascota con ese nombre existe
                }

            } else {
                System.out.println("La mascota " + nombreM + " " + "no existe");//no existe una mascota con ese nombre
                corte = true;
            }
        }
    }

    public void modificarColorM(String nombre, String colorM) {
        //modifica el color de una mascota con nombre "nombre"
        Iterator<MascotaDto> listM = this.listMasco.iterator();
        boolean corte = false;
        MascotaDto masco;
        while (!corte) {
            if (listM.hasNext()) {
                masco = listM.next();
                if (masco.getNombre().equals(nombre)) {
                    masco.setColor(colorM);
                    corte = true;//un mascota con ese nombre existe
                }

            } else {
                System.out.println("La mascota " + nombre + " " + "no existe");//no existe una mascota con ese nombre
                corte = true;
            }
        }
    }

    public MascotaDto buscarMascota(int idMas) {
        //busca una mascota en base a un ID
        Iterator<MascotaDto> listM = this.listMasco.iterator();
        boolean corte = false;
        MascotaDto masco = null;
        while (!corte) {
            if (listM.hasNext()) {
                masco = listM.next();
                if (masco.getIdMascota() == idMas) {
                    corte = true;//un mascota con ese ID existe
                }

            } else {
                System.out.println("La mascota con ID" + idMas + " " + "no existe");//no existe una mascota con ese ID
                corte = true;
            }
        }
        return masco;
    }

    @Override
    public String toString() {
        //lista todas las mascotas
        String mas = "Fin listado Mascotas";
        System.out.println("");
        System.out.println("Listado de mascotas");
        for (MascotaDto masco : listMasco) {
            System.out.println("ID Mascota: " + masco.getIdMascota() + " Nombre: " + masco.getNombre() + " Tipo: " + masco.getTipo() + " Color: " + masco.getColor() + " Sexo: " + masco.getSexo());
        }
        return mas;
    }

    public byte[] ImagenAByte(FileInputStream imagenMasco) {
        //convertir archivo de imagen a byte[]
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1000000];
        try {
            for (int readNum; (readNum = imagenMasco.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); //lee una cantidad de bytes buf y los guarda en bos
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            System.out.println("error de conversion archivo");
        }
        byte[] bytes = bos.toByteArray();//convierte a ByteArray
        return bytes;
    }

    public MascotaDto buscarMascotaBD(int idMasco) {
        //busca la mascota con IdMasco en la BD y la devuelve
        
        List<MascotaDto> lM = new ArrayList();
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
                Query q = session.createQuery("from MascotaDto where idMascota=:param1");
                q.setParameter("param1", idMasco);
                System.out.println("lista q" + q.list().toString());
                lM=q.list();
                if (lM.isEmpty()) {
                    System.out.println("La mascota con id " + idMasco + " No existe.");
                    
                } else {
                    for ( MascotaDto mas: lM){
                    System.out.println("La mascota encontrada es: " + mas.getIdMascota() + mas.getNombre() + mas.getTipo() + mas.getColor() + mas.getSexo() + mas.getNombImagen());    
                    }
                  
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

        return lM.get(0);
    }

    public void guardarMascotaBD(MascotaDto m) {
        //guarda mascota nueva en base de datos 
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
                System.out.println(m.getIdMascota() + m.getNombre() + m.getTipo() + m.getColor() + m.getSexo() + m.getNombImagen());
                session.save(m);

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

    public void modificarMascotaBD(MascotaDto m) {
        //guarda mascota nueva en base de datos 
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
                Query q = session.createQuery("update MascotaDto set`idMascota`=:param1,set `nombre`=:param2,set `tipo`=:param3,set `color`=:param4,set `sexo`=:param5, set `nombImagen`=:param6 set `imagen`=:param7");
                q.setParameter("param1", m.getIdMascota());
                q.setParameter("param2", m.getNombre());
                q.setParameter("param3", m.getTipo());
                q.setParameter("param4", m.getColor());
                q.setParameter("param5", m.getSexo());
                q.setParameter("param6", m.getNombImagen());
                q.setParameter("param7", m.getImagen());
                System.out.println(m.getIdMascota() + m.getNombre() + m.getTipo() + m.getColor() + m.getSexo() + m.getNombImagen());
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
    }

    public int ultimaMascotaBD() {
        //busca el id de la ultima mascota en la BD
        MascotaDto mas = new MascotaDto();
        List<MascotaDto> lM = new ArrayList();
        int ultimo = 0;
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
                Query q = session.createQuery("from MascotaDto");

                lM = q.list();
                if (q.list().isEmpty()) {
                    System.out.println("No hay mascotas cargados");
                    ultimo = 0;
                } else {

                    mas = lM.get(q.list().size() - 1);
                    ultimo = mas.getIdMascota();
                    System.out.println("La última mascota es: " + mas.getIdMascota() + mas.getNombre() + mas.getTipo() + mas.getSexo() + mas.getColor() + mas.getNombImagen());
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
