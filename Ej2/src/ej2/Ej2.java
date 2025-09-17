/*
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le 
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará 
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y 
se mostrará la lista ordenada. 
 */
package ej2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ej2 {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<String> breeds = new ArrayList<>();

        fillBreeds(breeds);
        askBreed(breeds);
        sortBreeds(breeds);
        showBreeds(breeds);

    }

    private static void fillBreeds(ArrayList<String> breeds) {

        String word;
        System.out.println("Cheketeta meta razas de perros, cuando se canse ingrese ENTER...");

        do {
            word = sc.next();

            if (word.equals("")) {
                continue;
            }
            breeds.add(word);

        } while (!word.equals(""));

    }

    private static void askBreed(ArrayList<String> breeds) {

        System.out.println("Ingrese raza a eliminar :c");
        String breedToSearch = sc.next();
        
        boolean success = false;
        Iterator<String> iterator = breeds.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(breedToSearch)) {
                iterator.remove();
                success = true;
            }
        }

        if (success) {
            System.out.println("C borró su raza, RACISTA >:C");
            return;
        }
        
        System.out.println("No C borró ninguna raza C:");

    }
    
    private static void sortBreeds(ArrayList<String> breeds){
        Collections.sort(breeds);
    }
    
    private static void showBreeds(ArrayList<String> breeds){
        for (String elemento : breeds) {
            System.out.println("Raza: " + elemento);
        }
    }
    
}
