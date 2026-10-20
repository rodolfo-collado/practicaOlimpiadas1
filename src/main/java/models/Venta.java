package models;

import java.util.Scanner;

import static persistance.Global.listaSucursales;


public class Venta {
    private long conteoVenta;

    private long agregarVentas(Scanner sc) {
       while (true){
           System.out.print("\nIngrese la sucursal: ");
           String sucursal = sc.nextLine();

           if (listaSucursales.stream().noneMatch(s -> s.getNombre().equalsIgnoreCase(sucursal))) {
               System.out.println("\nNo existe el Sucursal con el mismo nombre");
               continue;
           }

           System.out.print("\nIngresa el importe de la sucursal: ");
           long cantidad;
           try{
               cantidad = Long.parseLong(sc.nextLine());
           }
           catch(NumberFormatException e){
               System.out.println("\nError. Ingrese un importe válido.");
               continue;
           }

           if (cantidad > 1 && cantidad < 100000){
               System.out.println("\nEl importe es inválido. Intenta de nuevo.");
               continue;
           }

           this.conteoVenta += cantidad;
       }


    }
}



