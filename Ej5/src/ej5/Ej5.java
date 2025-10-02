/*
5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen 
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se 
guardará el país en el conjunto y después se le preguntará al usuario si quiere 
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países 
guardados en el conjunto.  
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto 
recordar como se ordena un conjunto. 
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, 
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que 
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto 
se le informará al usuario. 
 */
package ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Ej5 {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        HashSet<String> paises = new HashSet<>();
        String pais;

        System.out.println("Ingrese un país, cuando no quiera mas mi sempai ingrese ENTER");

        do {
            pais = sc.next();
            if (pais.equals("")) {
                System.out.println("No se le pedirán más países\n");
                break;
            }
            paises.add(pais);
            System.out.print("Pais siguiente: ");
        } while (!pais.equals(""));

        ArrayList<String> paisesList = new ArrayList(paises);
        Collections.sort(paisesList);
        showList(paisesList);
        deleteElement(paises);
    }

    static private void showList(ArrayList<String> paisesList) {
        for (String pais : paisesList) {
            System.out.println(pais);
        }
        System.out.println("");
    }
    
    private static void deleteElement(HashSet<String> paises){
        
        System.out.println("Que elemento desea borrar??");
        String wordToDelete = sc.next();
        
        boolean seEncuentra = paises.contains(wordToDelete);
        paises.remove(wordToDelete);
        
        System.out.println("La palabra" + (seEncuentra ? " SI " : " NO ") + "se encuentra en el Conjunto");
    }
}
