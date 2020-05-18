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
    /*************************************************
     *Método para imprimir los datos de los conjuntos*
     *************************************************/
    public void Imprimir(){
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i].toString());
        }
    }
    /***********************************************
     *Método para verificar si la tienda esta vacia*
     ***********************************************/
    public boolean EstaVacio(){
        for(int i=0;i<productos.length;i++){
            if(productos[i] != null) return false;
        }
        return true;
    }
    public int Tamano(){
        int Tam = 0;
        for(int i=0;i<productos.length;i++){
            if(productos[i] != null) Tam++;
        }
        return Tam;
    }
    public void Vaciar(){
        for(int i=0;i<productos.length;i++){
            prductos[i]=null;
        }
    }
    public boolean Contiene(Object elemento){
        if(!EstaVacio()){
            for(int i=0;i<productos.length;i++){
                if(elemento.equals(productos[i])){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean Eliminar(Object elemento){
        if(!EstaVacio()){
            for(int i=0;i<productos.length;i++){
                if(elemento.equals(productos[i])){
                    productis[i]=null;
                    return true;
                }
            }
        }
        return false;
    }
    public Agregar(Object elemento){
        if(!Contiene(elemento)){
            for(int i=0;i<productos.length;i++){
                if(productos[i]==null){
                    productos[i]=elemento;
                    return;
                }
            }
        }else {
            throw new IllegalArgumentException("El producto ya existe");
        }
    }
}
