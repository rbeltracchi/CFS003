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
public class UsuarioDto {
    private int idUsuario;
    private String apellidoYnombre;
    private String correo;
    private String contrasenia;
    private String direccion;
    private int telefono;
 //constructoras
    public UsuarioDto(int idUsuario, String apellidoYnombre, String correo, String contrasenia, String direccion,int telefono) {
        this.idUsuario = idUsuario;
        this.apellidoYnombre = apellidoYnombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }
// getters & setters 

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getApellidoYnombre() {
        return apellidoYnombre;
    }

    public void setApellidoYnombre(String apellidoYnombre) {
        this.apellidoYnombre = apellidoYnombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    
}
