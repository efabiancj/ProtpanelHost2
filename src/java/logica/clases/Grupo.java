// generando base de datos: prot_panel_bd tabla :grupo
// numero de campos : 2
package logica.clases;
public class Grupo{
int id;
String descripcion;

public Grupo(
int id,String descripcion)
{
this.id = id;
this.descripcion = descripcion;
}

public Grupo()
{
this.id = 0;
this.descripcion = "";
}


public int getId() {
return id;
}
public void setId(int id){
this.id = id;
}

public String getDescripcion() {
return descripcion;
}
public void setDescripcion(String descripcion){
this.descripcion = descripcion;
}
}
