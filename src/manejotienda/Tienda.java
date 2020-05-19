package manejotienda;
public class Tienda {
    private String codigo, nombre, descripcion;
    private int cantidad;

    //constructores
    public Tienda() {
    }
    public Tienda(String codigo, String nombre, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
    //M{etodos Setters

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //M{etodos Getter

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }
    public String toString(){
        return getCodigo() +" - "+getNombre()+" - "+getDescripcion()+" - "+getCantidad();
    }
}
