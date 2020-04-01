/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefactura;

import java.util.List;

/**
 *
 * @author Alejandro Arroyave
 */
public class DatabaseDAOImpl implements DatabaseDAO {

    Database Db;
    
    public DatabaseDAOImpl(){
        Db = Database.getDatabase();
    }
    
    @Override
    public void registrarCliente(Cliente cliente) {
        String res = Db.añadirCliente(cliente);
        System.out.println(res);
    }

    @Override
    public void eliminarCliente(int id) {
        String res = Db.eliminarCliente(id);
        System.out.println(res);
    }

    @Override
    public Cliente buscarCliente(int id) {
        return Db.buscarCliente(id);
    }

    @Override
    public List<Cliente> buscarClientes() {
        return Db.listaClientes();
    }
    
    @Override
    public void registrarFactura(Factura factura) {
        String res = Db.añadirFactura(factura);
        System.out.println(res);
    }

    @Override
    public Factura buscarFactura(int nroFactura) {
        return Db.buscarFactura(nroFactura);
    }

    @Override
    public List<Factura> buscarFacturas() {
        return Db.listaFacturas();
    }
    
    @Override
    public void registrarItem(Item item) {
        String res = Db.añadirItem(item);
        System.out.println(res);
    }

    @Override
    public Item buscarItem(int id) {
        return Db.buscarItem(id);
    }
    
    @Override
    public void eliminarItem(int id) {
        String res = Db.eliminarItem(id);
        System.out.println(res);
    }

    @Override
    public void eliminarTipoItem(int id) {
        String res = Db.eliminarTipoItem(id);
        System.out.println(res);
    }

    @Override
    public void registrarTipoItem(TipoItem tipoItem) {
        String res = Db.añadirTipoItem(tipoItem);
        System.out.println(res);
    }

    @Override
    public TipoItem buscarTipoItem(int id) {
        return Db.buscarTipoItem(id);
    }
}
