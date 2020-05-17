package manejotienda;
public class Productos implements InterfaceProducto{
    private Object[] productos;
    /************************************************
     * Constructor por defecto, crea un vector de 20*
     * objetos con valores null                     *
     ************************************************/
    public Productos(){
        this(20);
    }
    /************************************************
     * Constructor sobrecargado, crea un arreglo con*
     * un numero determinado de elementos con valo- *
     *res nulos                                     *
     ************************************************/
    public Productos(int tam){
        productos = new Object[tam <= 0 ? 20: tam];
        for(int i = 0;i<productos.length;i++){
           productos[i] = null;
        }
    }
    /************************************************
     *Constructor sobrecargado, crea un arreglos con*
     *productos de otra tienda, es decir lo clona   *
     ************************************************/
    public Productos(Productos pro){
        productos = new Object[pro.productos.length];
        for(int i = 0;i<pro.productos.length;i++){
            productos[i] = pro.productos[i];
        }
    }
}
