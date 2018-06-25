/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfs3.proyetomascotasm;

/**
 *
 * @author AleC
 */
public class MascotaDto {
  private int idMascota;
  private String nombre;
  private String tipo;
  private String color;
  private String sexo;
 //constructoras 
  public MascotaDto(){
      this.idMascota=0;
      this.nombre="";
      this.tipo="";
      this.color="";
      this.sexo="";
  }

  public MascotaDto(int idMascota, String nombre, String tipo, String color, String sexo) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.sexo = sexo;
        
    }
//getters & setters
    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
  
  
}
