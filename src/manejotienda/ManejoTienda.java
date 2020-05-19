package manejotienda;
public class ManejoTienda {
    public static void main(String[] args) {
        Tienda t1 = new Tienda("001","ricas","galletas ricas de nestle",6);
        Tienda t2 = new Tienda("002","maria","galletas maria de nabisco",12);
        
        Productos tienda = new Productos(2);
        
        tienda.Agregar(t1);
        tienda.Agregar(t2);
        
        System.out.println("los productos de la tienda son");
        tienda.Imprimir();
    }

}
