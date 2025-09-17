/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si 
decide salir, se mostrará todos los perros guardados en el ArrayList. 
 */
package ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

    static private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<String> breeds = new ArrayList<>();
        askBreeds(breeds);
        showBreeds(breeds);

    }

    private static void askBreeds(ArrayList<String> breeds) {

        System.out.println("Ooola chikitiin ingrese razas de perras ugu y cuando no quiera mas solo ingrese enter :)");
        String word = "hola";

        do {
            word = sc.next();

            if (word.isEmpty()) {
                break;
            }
            
            breeds.add(word);
        } while (!word.isEmpty());

    }

    private static void showBreeds(ArrayList<String> breeds) {
        System.out.println("Las razas son: ");
        for (String element : breeds) {
            System.out.println(element);
        }
    }

}
