/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de 
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de 
tipo Integer con sus 3 notas.  
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la 
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no. 
Después de ese bluce tendremos el siguiente método en la clase Alumno:  
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su 
nota final y se lo busca en la lista de Alumnos.  Si está en la lista, se llama al método. 
Dentro del método se usará la lista notas para calcular el promedio final de alumno. 
Siendo este promedio final, devuelto por el método y mostrado en el main. 
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.
 */
package ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej3 {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        askStudents(alumnos);
        searchStudent(alumnos);

    }

    private static void askStudents(ArrayList<Alumno> alumnos) {

        String option;
        int notes = 3;

        do {

            Alumno alumno = new Alumno();
            System.out.print("Ingrese el nombre del alumno hasta que ingrese ENTER: ");
            option = sc.next();
            if (option.equals("")) {
                break;
            }

            alumno.setName(option);

            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 0; i < notes; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno " + alumno.getName() + ": ");
                notas.add(sc.nextInt());
            }
            System.out.println("");

            alumno.setNotas(notas);

            alumnos.add(alumno);
        } while (!option.equals(""));

    }

    private static void searchStudent(ArrayList<Alumno> alumnos) {

        String student;

        do {
            System.out.println("Que hd.. alumno desea sacar el promediux?? Hasta que ingrese ENTER ");
            student = sc.next();
            if (student.equals("")) {
                break;
            }

            for (Alumno elemento : alumnos) {
                if (elemento.getName().equalsIgnoreCase(student)) {
                    System.out.print("Ingresando en las notas del señorito/a " + elemento.getName() + " >:) ");
                    System.out.println(elemento.notaFinal());
                }
            }

        } while (!student.equals(""));

    }

}
