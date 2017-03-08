/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package especificaciones;

import java.util.ArrayList;
import logica.clases.Administrador;
import logica.clases.Aplicacion;
import logica.clases.Bases_datos;
import logica.clases.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar
 */
public class Prot_panel_hostIT {
    
    public Prot_panel_hostIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registro_cliente method, of class Prot_panel_host.
     */
    @Test
    public void testRegistro_cliente() throws Exception {
        System.out.println("registro_cliente");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.registro_cliente(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validacion_registro method, of class Prot_panel_host.
     */
    @Test
    public void testValidacion_registro() {
        System.out.println("validacion_registro");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.validacion_registro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_directorio_virtual_servidor_app method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_directorio_virtual_servidor_app() {
        System.out.println("crear_directorio_virtual_servidor_app");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.crear_directorio_virtual_servidor_app(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_script_directorios method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_script_directorios() {
        System.out.println("crear_script_directorios");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.crear_script_directorios(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_script_directorios_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_script_directorios_aplicacion() {
        System.out.println("crear_script_directorios_aplicacion");
        Aplicacion aplicacion = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.crear_script_directorios_aplicacion(aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_cuenta_ftp_o_repositorio method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_cuenta_ftp_o_repositorio() {
        System.out.println("crear_cuenta_ftp_o_repositorio");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.crear_cuenta_ftp_o_repositorio(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_script_cuentas_ftp_o_repositorios method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_script_cuentas_ftp_o_repositorios() {
        System.out.println("crear_script_cuentas_ftp_o_repositorios");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.crear_script_cuentas_ftp_o_repositorios(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_script_cuentas_ftp_o_repositorios_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_script_cuentas_ftp_o_repositorios_aplicacion() {
        System.out.println("crear_script_cuentas_ftp_o_repositorios_aplicacion");
        Usuario usuario = null;
        Aplicacion aplicacion = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.crear_script_cuentas_ftp_o_repositorios_aplicacion(usuario, aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutar_script method, of class Prot_panel_host.
     */
    @Test
    public void testEjecutar_script() {
        System.out.println("ejecutar_script");
        String nombre_archivo = "";
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.ejecutar_script(nombre_archivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_planes method, of class Prot_panel_host.
     */
    @Test
    public void testListar_planes() {
        System.out.println("listar_planes");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.listar_planes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar_clientes method, of class Prot_panel_host.
     */
    @Test
    public void testAutenticar_clientes() {
        System.out.println("autenticar_clientes");
        String nombre = "";
        String clave = "";
        Prot_panel_host instance = new Prot_panel_host();
        boolean expResult = false;
        boolean result = instance.autenticar_clientes(nombre, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contratar_plan method, of class Prot_panel_host.
     */
    @Test
    public void testContratar_plan() {
        System.out.println("contratar_plan");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.contratar_plan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_nueva_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_nueva_aplicacion() {
        System.out.println("crear_nueva_aplicacion");
        Aplicacion bd = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.crear_nueva_aplicacion(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validación_crear_nueva_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testValidación_crear_nueva_aplicacion() {
        System.out.println("validaci\u00f3n_crear_nueva_aplicacion");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.validación_crear_nueva_aplicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_nueva_base_datos method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_nueva_base_datos() {
        System.out.println("crear_nueva_base_datos");
        Bases_datos bd = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.crear_nueva_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_aplicaciones method, of class Prot_panel_host.
     */
    @Test
    public void testListar_aplicaciones() {
        System.out.println("listar_aplicaciones");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        ArrayList<Aplicacion> expResult = null;
        ArrayList<Aplicacion> result = instance.listar_aplicaciones(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_bases_datos method, of class Prot_panel_host.
     */
    @Test
    public void testListar_bases_datos() {
        System.out.println("listar_bases_datos");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        ArrayList<Bases_datos> expResult = null;
        ArrayList<Bases_datos> result = instance.listar_bases_datos(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compilar_codigo_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testCompilar_codigo_aplicacion() {
        System.out.println("compilar_codigo_aplicacion");
        Aplicacion aplicación = null;
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.compilar_codigo_aplicacion(aplicación, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desplegar_desde_servidor_web method, of class Prot_panel_host.
     */
    @Test
    public void testDesplegar_desde_servidor_web() {
        System.out.println("desplegar_desde_servidor_web");
        Aplicacion aplicacion = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.desplegar_desde_servidor_web(aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subir_archivos_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testSubir_archivos_aplicacion() {
        System.out.println("subir_archivos_aplicacion");
        Usuario usuario = null;
        String nombre_aplicacion = "";
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.subir_archivos_aplicacion(usuario, nombre_aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testModificar_aplicacion() {
        System.out.println("modificar_aplicacion");
        Usuario usuario = null;
        String nombre_aplicacion = "";
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.modificar_aplicacion(usuario, nombre_aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testEliminar_aplicacion() {
        System.out.println("eliminar_aplicacion");
        Aplicacion aplicación = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.eliminar_aplicacion(aplicación);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar_cliente method, of class Prot_panel_host.
     */
    @Test
    public void testModificar_cliente() {
        System.out.println("modificar_cliente");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.modificar_cliente(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restaurar_base_datos method, of class Prot_panel_host.
     */
    @Test
    public void testRestaurar_base_datos() {
        System.out.println("restaurar_base_datos");
        Bases_datos bd = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.restaurar_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of respaldar_base_datos method, of class Prot_panel_host.
     */
    @Test
    public void testRespaldar_base_datos() {
        System.out.println("respaldar_base_datos");
        Bases_datos bd = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.respaldar_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_dominios method, of class Prot_panel_host.
     */
    @Test
    public void testListar_dominios() {
        System.out.println("listar_dominios");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.listar_dominios(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_editar_codigo method, of class Prot_panel_host.
     */
    @Test
    public void testVisualizar_editar_codigo() {
        System.out.println("visualizar_editar_codigo");
        Usuario usuario = null;
        Aplicacion aplicacion = null;
        String archivo = "";
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.visualizar_editar_codigo(usuario, aplicacion, archivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporte_consumo_recursos method, of class Prot_panel_host.
     */
    @Test
    public void testReporte_consumo_recursos() {
        System.out.println("reporte_consumo_recursos");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.reporte_consumo_recursos(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Calcular_espacio_disco_utilizado method, of class Prot_panel_host.
     */
    @Test
    public void testCalcular_espacio_disco_utilizado() {
        System.out.println("Calcular_espacio_disco_utilizado");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.Calcular_espacio_disco_utilizado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Calcular_memoria_por_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testCalcular_memoria_por_aplicacion() {
        System.out.println("Calcular_memoria_por_aplicacion");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.Calcular_memoria_por_aplicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Calcular_transferencia method, of class Prot_panel_host.
     */
    @Test
    public void testCalcular_transferencia() {
        System.out.println("Calcular_transferencia");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.Calcular_transferencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporte_pagos_mensuales method, of class Prot_panel_host.
     */
    @Test
    public void testReporte_pagos_mensuales() {
        System.out.println("reporte_pagos_mensuales");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.reporte_pagos_mensuales(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar_administradores method, of class Prot_panel_host.
     */
    @Test
    public void testAutenticar_administradores() {
        System.out.println("autenticar_administradores");
        String nombre = "";
        String clave = "";
        Prot_panel_host instance = new Prot_panel_host();
        boolean expResult = false;
        boolean result = instance.autenticar_administradores(nombre, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Gestion_administrador method, of class Prot_panel_host.
     */
    @Test
    public void testGestion_administrador() {
        System.out.println("Gestion_administrador");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.Gestion_administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Crear_nuevo_administrador method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_nuevo_administrador() {
        System.out.println("Crear_nuevo_administrador");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.Crear_nuevo_administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Validacion_Crear_nuevo_administrador method, of class Prot_panel_host.
     */
    @Test
    public void testValidacion_Crear_nuevo_administrador() {
        System.out.println("Validacion_Crear_nuevo_administrador");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.Validacion_Crear_nuevo_administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Modificacion_administrador method, of class Prot_panel_host.
     */
    @Test
    public void testModificacion_administrador() {
        System.out.println("Modificacion_administrador");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.Modificacion_administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validacion_Modificacion_administrador method, of class Prot_panel_host.
     */
    @Test
    public void testValidacion_Modificacion_administrador() {
        System.out.println("validacion_Modificacion_administrador");
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.validacion_Modificacion_administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listar_administradores method, of class Prot_panel_host.
     */
    @Test
    public void testListar_administradores() {
        System.out.println("Listar_administradores");
        Prot_panel_host instance = new Prot_panel_host();
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = instance.Listar_administradores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporte_usuarios method, of class Prot_panel_host.
     */
    @Test
    public void testReporte_usuarios() {
        System.out.println("reporte_usuarios");
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.reporte_usuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reporte_ventas method, of class Prot_panel_host.
     */
    @Test
    public void testReporte_ventas() {
        System.out.println("reporte_ventas");
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.reporte_ventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
