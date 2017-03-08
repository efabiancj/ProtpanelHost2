package especificaciones;





import logica.clases.Aplicacion;

import logica.clases.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import logica.clases.Administrador;
import logica.clases.Bases_datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class Prot_panel_host 
{
  // --------------------------------------------------------------------------------------------------------
  //  Especificaciones para actor visitante
  //---------------------------------------------------------------------------------------------------------  
    public int registro_cliente(Usuario usuario) throws Exception
    {
       //boolean res = FUsuarios.ingresar(usuario);
       return 0;  
    }
    
    public int validacion_registro()
    {
       // int res = FUsuarios.repetidos();
        return 0;
    }
    
    public int crear_directorio_virtual_servidor_app(Usuario usuario)
    {
        crear_script_directorios(usuario);
        return 0;
    }
    
    public String crear_script_directorios(Usuario usuario)
    {
        String nombre ="";

        return nombre;
    }
    
    public String crear_script_directorios_aplicacion(Aplicacion aplicacion)
    {
        String nombre ="";
        nombre = aplicacion.getNombre();
       
        String script   = "mkdir "+ aplicacion.getDirectorio()+""+nombre +"\n";
        script = script + "mkdir "+ aplicacion.getArchivo_war()+""+nombre +"\n";
      //  FArchivos.crear_archivo("/temp/", "directorios_app_"+nombre+".sh", script);
        nombre = "directorios_app_"+nombre+".sh";
        return nombre;
    }
    
    public int crear_cuenta_ftp_o_repositorio(Usuario usuario)
    {
        crear_script_cuentas_ftp_o_repositorios(usuario);
        return 0;
    }
    
    public int crear_script_cuentas_ftp_o_repositorios(Usuario usuario)
    {   
        String nombre ="";
     //   nombre = FStrings.rellenar_espacios(nombre,'_');
        String script  = "useradd -g ftp -d /home/"+nombre+usuario.getId() +" "+ nombre+usuario.getId() +"\n";
        script  = script + "svnadmin create repo-"+nombre+usuario.getId();
        script  = script + "chown -R apache:apache repo-"+nombre+usuario.getId();
     //   FArchivos.crear_archivo("/temp/", "cuentas"+nombre+usuario.getId()+".sh", script);
        return 0;
    }
    
    public int crear_script_cuentas_ftp_o_repositorios_aplicacion(Usuario usuario, Aplicacion aplicacion)
    {   
        String nombre ="";
       // nombre = FStrings.rellenar_espacios(nombre,'_');
        String script  = "useradd -g ftp -d /home/"+nombre+usuario.getId() +" "+ nombre+usuario.getId() +"\n";
        script  = script + "svnadmin create repo-"+nombre+usuario.getId();
        script  = script + "chown -R apache:apache repo-"+nombre+usuario.getId();
      //  FArchivos.crear_archivo("/temp/", "cuentas"+nombre+usuario.getId()+".sh", script);
        return 0;
    }
    public int ejecutar_script(String nombre_archivo)
    {
        int res=0;
        
        return res;
    }
    public int listar_planes()
    {
         return 0;
    }
   //------------------------------------------------------------------------------------------------------------ 
    
  // --------------------------------------------------------------------------------------------------------
  //  Especificaciones para actor usuario - cliente
  //---------------------------------------------------------------------------------------------------------    
    public boolean autenticar_clientes(String nombre, String clave)
    {
        return false;
    }
    
      
    public int contratar_plan()
    {
        return 0;
    }
    
    public int crear_nueva_aplicacion(Aplicacion bd)
    {
        return 0; 
        
    }
    public int validación_crear_nueva_aplicacion()
    {
        return 0;
    }
    public int crear_nueva_base_datos(Bases_datos bd)
    {
        return 0; 
    }
    
    public ArrayList<Aplicacion>  listar_aplicaciones(Usuario usuario)
    {
        return null;
    }
    
    public ArrayList<Bases_datos> listar_bases_datos(Usuario usuario)
    {
        return null;
    }
    
    public int compilar_codigo_aplicacion(Aplicacion aplicación,Usuario usuario)
    {
        return 0;
    }
    
    public int desplegar_desde_servidor_web(Aplicacion aplicacion)
    {
        return 0;
    }
    
    public int subir_archivos_aplicacion(Usuario usuario, String nombre_aplicacion)
    {
       return 0;
    }
    
    public int modificar_aplicacion(Usuario usuario, String nombre_aplicacion)
    {
       return 0;
    }
    
    public int eliminar_aplicacion(Aplicacion aplicación)
    {
        return 0; 
    }
    
    public int  modificar_cliente(Usuario usuario)
    {
        return 0;
    }
    
    public int restaurar_base_datos(Bases_datos bd)
    {
        return 0;
    }
    
    public String respaldar_base_datos(Bases_datos bd)
    {
        return null;
    }
       
    
    public String  listar_dominios(Usuario usuario)
    {
        return null;
    }
    
    public String  visualizar_editar_codigo(Usuario usuario, Aplicacion aplicacion, String archivo)
    {
        return null;
    }
    
    public String  reporte_consumo_recursos(Usuario usuario)
    {
        return null;
    }
    
    public int Calcular_espacio_disco_utilizado()
    {
        return 0;
    }
    
    public int Calcular_memoria_por_aplicacion()
    {
        return 0;
    }
    
    public int Calcular_transferencia()
    {
        return 0;
    }
       
    
    public String  reporte_pagos_mensuales(Usuario usuario)
    {
        return null;
    }
//-------------------------------------------------------------------------------------------------------------     
// --------------------------------------------------------------------------------------------------------
//  Especificaciones para actor administrador
//---------------------------------------------------------------------------------------------------------       
       
    public boolean autenticar_administradores(String nombre, String clave)
    {   
        return false;
    }
    
    public int Gestion_administrador()
    {
        return 0;
    }
    
    public int Crear_nuevo_administrador()
    {
        return 0;
    }
    
    public int Validacion_Crear_nuevo_administrador()
    {
        return 0;
    }
    
    public int Modificacion_administrador()
    {
        return 0;
    }
    
    public int validacion_Modificacion_administrador()
    {
        return 0;
    }
    
    public ArrayList<Administrador> Listar_administradores()
    { 
        return null;
    }
    
    public String  reporte_usuarios()
    {
        return null;
    }
    
    public String  reporte_ventas()
    {
        return null;
    }
    
}
