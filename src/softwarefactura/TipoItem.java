/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefactura;

/**
 *
 * @author Alejandro Arroyave
 */
public class TipoItem {
    private int Id;
    private String Description;
    
    public TipoItem(int id, String description){
        Id = id;
        Description = description;
    }
    
    public int getId(){
        return Id;
    }
    
    public String getDescription(){
        return Description;
    }
    
    public void setDescription(String description){
        Description=description;
    }
}