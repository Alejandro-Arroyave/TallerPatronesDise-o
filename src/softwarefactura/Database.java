/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefactura;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Arroyave
 */
public class Database {

    private ArrayList<Cliente> CLIENTES;
    private ArrayList<Item> ITEMS;
    private ArrayList<Factura> FACTURAS;
    private ArrayList<TipoItem> TIPOITEMS;
    private static Database miDatabase;

    private Database() {
        CLIENTES = new ArrayList<>();
        ITEMS = new ArrayList<>();
        FACTURAS = new ArrayList<>();
        TIPOITEMS = new ArrayList<>();
    }

    public static Database getDatabase() {
        if (miDatabase == null) {
            miDatabase = new Database();
            System.out.println("Conectando a base de datos...");
            System.out.println("...");
            System.out.println("");
        } else {
            System.out.println("Ya está conectado a la base de datos");
        }
        return miDatabase;
    }

    public String añadirCliente(Cliente cliente) {
        CLIENTES.add(cliente);
        return "Cliente agregado";
    }

    public String eliminarCliente(int id) {
        CLIENTES.stream().filter((c) -> (c.getId() == id)).forEachOrdered((c) -> {
            CLIENTES.remove(c);
        });
        return "Cliente eliminado";
    }
    
    public Cliente buscarCliente(int id){
        for(Cliente c: CLIENTES){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Cliente> listaClientes(){
        return CLIENTES;
    }
    
    public String añadirFactura(Factura factura) {
        FACTURAS.add(factura);
        return "Factura agregada";
    }

    public String eliminarFactura(int nroFactura) {
        FACTURAS.stream().filter((f) -> (f.getNroFactura() == nroFactura)).forEachOrdered((f) -> {
            FACTURAS.remove(f);
        });
        return "Factura eliminada";
    }
    
    public Factura buscarFactura(int nroFactura){
        for(Factura f: FACTURAS){
            if(f.getNroFactura() == nroFactura){
                return f;
            }
        }
        return null;
    }
    
    public ArrayList<Factura> listaFacturas(){
        return FACTURAS;
    }
    
    public String añadirItem(Item item) {
        ITEMS.add(item);
        return "Item agregado";
    }

    public String eliminarItem(int id) {
        ITEMS.stream().filter((i) -> (i.getId() == id)).forEachOrdered((i) -> {
            ITEMS.remove(i);
        });
        return "Factura eliminada";
    }
    
    public Item buscarItem(int id){
        for(Item i: ITEMS){
            if(i.getId()== id){
                return i;
            }
        }
        return null;
    }
    
    public ArrayList<Item> listaItem(){
        return ITEMS;
    }
    
    public String añadirTipoItem(TipoItem tipoitem) {
        TIPOITEMS.add(tipoitem);
        return "TipoItem agregado";
    }

    public String eliminarTipoItem(int id) {
        TIPOITEMS.stream().filter((i) -> (i.getId()== id)).forEachOrdered((i) -> {
            TIPOITEMS.remove(i);
        });
        return "TipoItem eliminado";
    }
    
    public TipoItem buscarTipoItem(int id){
        for(TipoItem i: TIPOITEMS){
            if(i.getId()== id){
                return i;
            }
        }
        return null;
    }
    
    public ArrayList<TipoItem> listaTipoItem(){
        return TIPOITEMS;
    }
}
