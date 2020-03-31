package softwarefactura;

/**
 * Class Item
 * @author Alejandro Arroyave
 */
public class Item {
    private final int Id;
    private String Descripcion;
    //Falta tipo item
    private int Valor;
    
    public Item(int id, String descripcion, int valor){
        Id=id;
        Descripcion=descripcion;
        Valor=valor;
    }
    
    public int getId(){
        return Id;
    }
    
    public String getDescripcion(){
        return Descripcion;
    }
    
    public void setDescripcion(String descripcion){
        Descripcion=descripcion;
    }
    
    public int getValor(){
        return Valor;
    }
    
    public void setValor(int valor){
        Valor=valor;
    }
}
