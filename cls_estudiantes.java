import java.sql.Struct;

public class cls_estudiantes{
    //Atributos de clase
    private String str_id;
    private String str_nombre;
    private String str_contacto;
    private String str_correo;
    private String str_edad;

    //Metodo constructor
    public cls_estudiantes(String id, String nombre, String contacto, String correo, String edad) {
        this.str_id = id;
        this.str_nombre = nombre;
        this.str_contacto = contacto;
        this.str_correo = correo;
        this.str_edad = edad;}
    //Metodos setters
    public void setNombre(String nombre) {this.str_nombre = nombre;}
    public void setContacto(String contacto) {this.str_contacto = contacto;}
    public void setCorreo(String correo) {this.str_correo = correo;}
    public void setEdad(String edad) {this.str_edad = edad;}

    //Metodos getters
    public String getId() {return this.str_id;}
    public String getNombre() {return this.str_nombre;}
    public String getContato() {return this.str_contacto;}
    public String getCorreo() {return this.str_correo;}
    public String getEdad() {return this.str_edad;}
}
