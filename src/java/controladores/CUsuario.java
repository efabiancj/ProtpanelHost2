/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

/**
 *
 * @author Edgar
 */

import especificaciones.Prot_panel_host;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.SessionScoped;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import logica.clases.Ciudad;
import logica.clases.Grupo;

import logica.clases.Usuario;


/**
 *
 * @author efabiancj
 */

@ViewScoped
@ManagedBean(name = "cUsuario")
@SessionScoped
@RequestScoped
public  class CUsuario implements Serializable{

    private Usuario usuario;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Ciudad> lstciud;
    
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    private String clave;

    private Grupo grupo;
    private int id;
    private String directorio_virtual;
    private Ciudad ciudad;
    private String estado;
   
    private String ciudset;
    private String mensaje;
    private String nickname;
    private int ultimo;
    private String sugerencia;
    private String claveRep;
    public CUsuario() {
        mensaje = "";
        grupo= new Grupo();
       
    }

  

    public String getCiudset() {
        return ciudset;
    }

    public void setCiudset(String ciudset) {
        this.ciudset = ciudset;
    }


   
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }



    public boolean validar_usuario_repetido(FacesContext fc, UIComponent uic, Object o) {
        boolean res = false;
     
        return res;
    }

    public void reset() {

    }

    public void listar_usuarios()
    {
       
    }

    public ArrayList<Ciudad> getLstciud() {
        return lstciud;
    }

    public void setLstciud(ArrayList<Ciudad> lstciud) {
        this.lstciud = lstciud;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectorio_virtual() {
        return directorio_virtual;
    }

    public void setDirectorio_virtual(String directorio_virtual) {
        this.directorio_virtual = directorio_virtual;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    public void ingresar_usuario() throws Exception {
        
      
    }
    
    public boolean controlar_nickname()
    {
        boolean res=false;
        
        return res;
    }
    
    public String generar_nombre_directorio()
    {
        String res="";
    
        return res;
    }
    
    public String generar_sugerencia_nickname()
    {
        return "";
    }
    
    public String generar_directorio_ftp_real(String path)
    {
        
        return "";
    }
    
    public int crear_usuario_bd()
    {
        int res=0;
       
        return res;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getClaveRep() {
        return claveRep;
    }

    public void setClaveRep(String claveRep) {
        this.claveRep = claveRep;
    }
    
}
