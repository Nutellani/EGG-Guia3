/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los 
distintos productos que venderemos y el precio que tendrán. Además, se necesita 
que la aplicación cuente con las funciones básicas. Estas las realizaremos en el
main. Como, introducir un elemento, modificar su precio, eliminar un producto y
mostrar los productos que tenemos con su precio (Utilizar Hashmap). El HashMap
tendrá de llave el nombre del producto y de valor el precio. Realizar un menú
para lograr todas las acciones previamente mencionadas.
 */
package ej6;

import java.util.Scanner;

public class Ej6 {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int option;

        do {

            option = switchOption("Ingrese una opcion, cuando no quiera más mándele 0 nomás mi patrón :)");

            switch (option) {
                case 0:

                    break;

                case 1: // introducir elemento

                    break;

                case 2: // modificar precio

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println("Lel q pusiste mi don?? o_0");
            }

        } while (option == 0);

        // eliminar producto
        // mostrar productos
    }

    static private int switchOption(String message) {
        System.out.println(message);
        reedSwitchOptions();
        return sc.nextInt();
    }

    static private void reedSwitchOptions() {
        System.out.println("\n0: Salir");
        System.out.println("1: Introducir Elemento");
        System.out.println("2: Modificar Precio");
        System.out.println("3: Eliminar Producto");
        System.out.println("4: Mostrar Productos");
    }

}
