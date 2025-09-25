/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para 
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en 
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en 
cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al 
usuario todos sus datos y guardándolos en el objeto Pelicula. 
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si 
quiere crear otra Pelicula o no. 
Después de ese bucle realizaremos las siguientes acciones:  
• Mostrar en pantalla todas las películas. 
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
en pantalla. 
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
en pantalla. 
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla. 
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej4 {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<Pelicula> cartelera = new ArrayList<>();

        addPelis(cartelera);
        showPelis(cartelera);

    }

    private static void addPelis(ArrayList<Pelicula> cartelera) {

        String name;
        String director;
        Double duracion;

        System.out.println("Ingrese pelicula a agregar a la cartelera, cuando se canse ingrese ENTER");

        do {

            name = askName();
            if (name.equals("")) {
                return;
            }
            director = askDirector();
            duracion = askDuration();
            cartelera.add(new Pelicula(name, director, duracion));

        } while (!name.equals(""));

    }

    private static String askName() {
        System.out.print("Ingrese Nombre de la Peli de CUEVANA Lol");
        return sc.next();
    }

    private static String askDirector() {
        System.out.print("Ingrese Director de la Peli en PelisPLUS");
        return sc.next();
    }

    private static Double askDuration() {
        System.out.print("Ingrese Director de la Peli en PelisPLUS");
        return sc.nextDouble();
    }

    private static void showPelis(ArrayList<Pelicula> cartelera){
        
    }
    
}
