package com.cfs3.proyectopets;

import com.mysql.cj.jdbc.Blob;
import java.awt.Image;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


public class MascotaDto  implements java.io.Serializable {


     private int idMascota;
     private String nombre;
     private String tipo;
     private String color;
     private String sexo;
     private String nombImagen;
     private byte[] imagen;
     private List<FichaDto> listaFichasm = new ArrayList<>();

    public MascotaDto() {
    }
    public MascotaDto(int idMascota, String nombre, String tipo, String color, String sexo) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.sexo = sexo;
        this.nombImagen="";
        this.imagen=null;
    }
	
    public MascotaDto(int idMascota, String nombre, String tipo, String color, String sexo,String nombre1,byte[] imagen) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.sexo = sexo;
        this.nombImagen=nombre1;
        this.imagen=imagen;
    }
    public MascotaDto(int idMascota, String nombre, String tipo, String color, String sexo, FichaDto listFichasm) {
       this.idMascota = idMascota;
       this.nombre = nombre;
       this.tipo = tipo;
       this.color = color;
       this.sexo = sexo;
       this.listaFichasm.add(listFichasm);
    }
   
    public int getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public List<FichaDto> getListaFichasm() {
        return this.listaFichasm;
    }
    
    public void setListaFichasm(List<FichaDto> listaFichas) {
        this.listaFichasm = listaFichas;
    }

    public String getNombImagen(){
        return this.nombImagen;
    }
    public void setNombImagen(String nomb){
    this.nombImagen=nomb;
}
    public byte[] getImagen(){
        return this.imagen;
    }
    public void setImagen(byte[] imag) {
        this.imagen=imag;
    }
}


