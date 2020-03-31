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
public interface DatabaseDAO {
    public void registrarCliente(Cliente cliente);
    public void eliminarCliente(int id);
    public Cliente buscarCliente(int id);
    public List<Cliente> buscarClientes();
    public void registrarFactura(Factura factura);
    public Factura buscarFactura(int nroFactura);
    public List<Factura> buscarFacturas();
    public void registrarItem(Item item);
    public Item buscarItem(int id);
    public void eliminarItem(int id);
    public void registrarTipoItem(TipoItem tipoItem);
    public void eliminarTipoItem(int id);
    public TipoItem buscarTipoItem(int id);
}
