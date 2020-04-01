/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefactura;

import java.util.Scanner;

/**
 *
 * @author Alejandro Arroyave
 */
public class SoftwareFactura {

    public static void main(String[] args) {
        int option = 0;

        //Scanner teclado = new Scanner(System.in);
        while(true){

            Scanner teclado = new Scanner(System.in);

            System.out.println("Por favor escoge una opción");
            teclado.nextLine();
            option = teclado.nextInt();

            switch (option) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    registrarItem();
                case 3:
                    generarFactura();
                case 4:
                    buscarCliente();
                case 5:
                    buscarFactura();
                case 6:
                    registrarTipoItem();
                case 7:
                    buscarItem();
                case -1:
                    teclado.close();
                default:
                    throw new IllegalArgumentException("Opción no valida");
            }
        }


        }

    private static void buscarItem() {
    }

    private static void registrarTipoItem() {
    }

    private static void buscarFactura() {
    }

    private static void buscarCliente() {
    }

    private static void generarFactura() {
    }

    private static void registrarItem() {
    }


    public static void registrarUsuario(){
            int id;
            String nombre;
            String apellidos;
            char genero;
            String estado_civil;
            String fecha_nacimiento;

            DatabaseDAOImpl implement = new DatabaseDAOImpl();

            Scanner sc = new Scanner(System.in);

            System.out.println("Documento de identidad");
            id = sc.nextInt();
            System.out.println("Nombres del cliente");
            sc.nextLine();
            nombre = sc.nextLine();
            System.out.println("Apellidos del cliente");
            apellidos = sc.nextLine();
            System.out.println("Género del cliente (M/F)");
            genero = sc.next().charAt(0);
            System.out.println("Estado civil");
            sc.nextLine();
            estado_civil = sc.nextLine();
            System.out.println("Fecha de nacimiento (YYYY-MM-DD)");
            fecha_nacimiento = sc.nextLine();

            Cliente client = new Cliente (id,nombre,apellidos, genero,estado_civil,fecha_nacimiento);
            implement.registrarCliente(client);
            sc.close();
       }
    }