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
import java.util.HashMap;
import java.util.Map;

public class Ej6 {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int option;
        HashMap<String, Double> productos = new HashMap<>();

        do {

            option = switchOption("\nIngrese una opcion, cuando no quiera más mándele 0 nomás mi patrón :)");

            switch (option) {

                case 0:
                    System.out.println("Usted ha salido del programa...\n");
                    break;

                case 1: // introducir elemento
                    hashMapPut(productos);
                    break;

                case 2: // modificar precio
                    hashMapReplace(productos);
                    break;

                case 3: // eliminar producto
                    hashMapRemove(productos);
                    break;

                case 4: // mostrar productos
                    showHashMap(productos);
                    break;

                default:
                    System.out.println("Lel q pusiste mi don?? o_0");
            }

        } while (option != 0);
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
        System.out.println("4: Mostrar Productos\n");
    }

    private static void hashMapPut(HashMap<String, Double> productos) {
        String producto = askProduct("\nIngrese el NOMBRE del producto a agregar chikilin...");
        Double price = askPrice("Ahora ingrese el PRECIO del producto a agregar chikilin...");
        productos.put(producto, price);
    }

    private static String askProduct(String message) {
        System.out.println(message);
        return sc.next();
    }

    private static Double askPrice(String message) {
        System.out.println(message);
        return sc.nextDouble();
    }

    private static void hashMapReplace(HashMap<String, Double> productos) {
        System.out.println("\nQué producto desea cambiar??");
        String producttoChange = sc.next();
        System.out.println("\nDesea cambiar:\n1: el NOMBRE del Producto\n2: el PRECIO del producto");
        int option = sc.nextInt();
        if ((option < 1) || (2 < option)) {
            System.out.println("Q mandaste wachin??");
            return;
        } else if (option == 1) {
            changeKey(productos, producttoChange);
            return;
        }
        changePrice(productos, producttoChange);
    }

    private static void hashMapRemove(HashMap<String, Double> productos) {
        System.out.println("\nQue producto desea BORRAR brou ??");
        productos.remove(verificatedKeyName(productos));
    }

    private static String verificatedKeyName(HashMap<String, Double> productos) {
        String palabra;
        Boolean verification = false;
        do {
            System.out.print("Ingrese hasta dar con un producto con ese nombre...");
            palabra = sc.next();
            for (Map.Entry<String, Double> producto : productos.entrySet()) {
                if (producto.getKey().equals(palabra)) {
                    return producto.getKey();
                }
            }
        } while (verification == false);
        return "NO SE VERIFICÓ"; //esta al pedo no supe como sacarlo
    }

    private static void showHashMap(HashMap<String, Double> productos) {
        System.out.println("");
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            System.out.println("Producto " + producto.getKey() + ", valor: " + producto.getValue());
        }
    }

    private static void changeKey(HashMap<String, Double> productos, String productToChange) {
        String newProduct;
        Double newPrice;
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            if (producto.getKey().equals(productToChange)) {
                System.out.print("Ingrese nuevo PRODUCTO: ");
                newProduct = sc.next();
                newPrice = producto.getValue();
                productos.remove(productToChange);
                productos.put(newProduct, newPrice);
            }
        }
    }

    private static void changePrice(HashMap<String, Double> productos, String productToChange) {
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            if (producto.getKey().equals(productToChange)) {
                String newProduct = productToChange;
                System.out.print("Ingrese el nuevo PRECIO del producto: ");
                Double newPrice = sc.nextDouble();
                productos.remove(productToChange);
                productos.put(newProduct, newPrice);
            }
        }
    }

}
