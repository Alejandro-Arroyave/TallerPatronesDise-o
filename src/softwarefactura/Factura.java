/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefactura;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alejandro Arroyave
 */
public class Factura {
    private int NroFactura;
    private LocalDate Fecha;
    private Cliente Cliente;
    private int totalCosto = 0;
    private int Faltaitems;
    
    public Factura(int nroFactura, Cliente cliente){
        NroFactura=nroFactura;
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Fecha = LocalDate.now();
        Cliente=cliente;
    }
    
    public int getNroFactura(){
        return NroFactura;
    }
    
    public LocalDate getFecha(){
        return Fecha;
    }
    
    public Cliente getCliente(){
        return Cliente;
    }
    
    public int getTotalCosto(){
        return totalCosto;
    }
}
