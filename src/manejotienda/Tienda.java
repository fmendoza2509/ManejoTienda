package manejotienda;
public class Tienda {
    private String nombre, direccion;
    public Tienda(){
    }
    public Tienda(String _nomb, String _dir){
        nombre = _nomb;
        direccion = _dir;
    }
    public void setNom(String nomb){
        nombre = nomb;
    }
    public void setDir(String dir){
        direccion = dir;
    }
}
