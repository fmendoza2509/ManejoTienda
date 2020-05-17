package manejotienda;
public abstract class InterfaceProducto {
    /*********************************************
     * Método determinar si la tienda esta vacia *
     * retorna un true, caso contrario retorna   *
     * false                                     *
     *********************************************/
    public abstract boolean EstaVacio();//Requerimeinto no funcional
    /*********************************************
     * Método para determinar la cantidad de los *
     * productos de la tienda @return int        *
     *********************************************/
    public abstract int Tamano();//Requerimiento no funcional
    /********************************************
     * Método para vaciar todos los productos de*
     * la tienda                                *
     ********************************************/
    public abstract void Vaciar();//Requerimiento no funcional
   /**************************************
    * Método Agregar producto a la tienda*
    **************************************/
   public abstract boolean Agregar(Object elemento);//Requerimiento funcional
   /********************************
    * Método para eliminar producto*
    ********************************/
   public abstract boolean Eliminar(String codigo);//Requerimiento funcional
   /*********************************************
    *Metodo para buscar un producto en la tienda*
    *********************************************/
   public abstract boolean Buscar(String codigo);//Requerimiento funcional
   /***************************************
    * Método para actualizar los productos*
    ***************************************/
   public abstract boolean Editar(String cod, String nomb, String desc, int cant);//Requerimiento funcional
   /*************************
    * Método vender producto*
    *************************/
   public abstract void Vender(String cod, String nomb, String desc, int cant);//Requerimiento funcional
}
