package manejotienda;
public class InterfaceProducto {
    /*********************************************
     * Método determinar si la tienda esta vacia *
     * retorna un true, caso contrario retorna   *
     * false                                     *
     *********************************************/
    public boolean EstaVacio();//Requerimeinto no funcional
    /*********************************************
     * Método para determinar la cantidad de los *
     * productos de la tienda @return int        *
     *********************************************/
    public int Tamano();//Requerimiento no funcional
    /********************************************
     * Método para vaciar todos los productos de*
     * la tienda                                *
     ********************************************/
    public void Vaciar();//Requerimiento no funcional
   /**************************************
    * Método Agregar producto a la tienda*
    **************************************/
   public void Agregar(Object elemento);//Requerimiento funcional
   /********************************
    * Método para eliminar producto*
    ********************************/
   public boolean Eliminar(Object elemento);//Requerimiento funcional
   /*********************************************
    *Metodo para buscar un producto en la tienda*
    *********************************************/
   public boolean Buscar(String codigo);//Requerimiento funcional
   /***************************************
    * Método para actualizar los productos*
    ***************************************/
   public boolean Editar(String cod, String nomb, String desc, int cant);//Requerimiento funcional
   /*************************
    * Método vender producto*
    *************************/
   public void Vender(String cod, String nomb, String desc, int cant);//Requerimiento funcional
}
