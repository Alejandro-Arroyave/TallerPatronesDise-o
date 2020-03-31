/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefactura;

import java.time.LocalDate;

/**
 *
 * @author Alejandro Arroyave
 */
public class Cliente {

    private int Id;
    private String Nombre;
    private String Apellidos;
    private char Genero;
    private String Estado_Civil;
    private LocalDate Fecha_Nacimiento;

    public Cliente(int id, String nombre, String apellidos, char genero,
            String estado_Civil, LocalDate fecha_Nacimiento) {
        Id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        Genero = genero;
        Estado_Civil = estado_Civil;
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String nombre){
        Nombre=nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }
    
    public void setApellidos(String apellidos) {
        Apellidos=apellidos;
    }

    public char getGenero() {
        return Genero;
    }
    
    public void setGenero(char genero){
        Genero=genero;
    }
    
    public String getEstado_Civil(){
        return Estado_Civil;
    }
    
    public void setEstado_Civil(String estado_Civil){
        Estado_Civil=estado_Civil;
    }
    
    public LocalDate getFecha_Nacimiento(){
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(LocalDate fecha_Nacimiento){
        Fecha_Nacimiento=fecha_Nacimiento;
    }
}
