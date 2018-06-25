/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfs3.proyetomascotasm;

import java.util.Date;

/**
 *
 * @author AleC
 */
public class FichaDto {
 private int idFicha;
 private MascotaDto mascota;
 private UsuarioDto usuario;
 private String estado;
 private String descripcion;
 private Date fecha;
//constructores

 public FichaDto(int idFicha, MascotaDto Mascota, UsuarioDto Usuario, String estado, String descripcion, Date fecha) {
        this.idFicha = idFicha;
        this.mascota = Mascota;
        this.usuario = Usuario;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
//getters & setters 

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public UsuarioDto getUsuario() {
        return this.usuario;
    }

    public void setUsuario(UsuarioDto usuario) {
        this.usuario = usuario;
    }

    public MascotaDto getMascota() {
        return this.mascota;
    }

    public void setMascota(MascotaDto mascota) {
        this.mascota = mascota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
 
 
}
