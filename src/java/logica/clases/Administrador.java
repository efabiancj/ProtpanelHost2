// generando base de datos: prot_panel_bd tabla :administrador
// numero de campos : 8
package logica.clases;

public class Administrador {

    String codigo;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String email;
    String clave;
    Grupo grupo;
    String estado;

    public Administrador(
            String codigo, String nombres, String apellidos, String direccion, String telefono, String email, String clave, Grupo grupo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.clave = clave;
        this.grupo = grupo;
    }

    public Administrador() {
        this.codigo = "";
        this.nombres = "";
        this.apellidos = "";
        this.direccion = "";
        this.telefono = "";
        this.email = "";
        this.clave = "";
        this.grupo = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
