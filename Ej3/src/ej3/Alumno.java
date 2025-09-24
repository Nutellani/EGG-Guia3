package ej3;

import java.util.ArrayList;

public class Alumno {

    private String name;
    private ArrayList<Integer> notas; // de 3 notas

    public Alumno() {
        this.notas = new ArrayList<>();
    }

    public Alumno(String name, ArrayList<Integer> notas) {
        this.name = name;
        this.notas = notas;
    }

    ////    GETTERS N STTERS    ////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public Double notaFinal() {

        Double promedio = 0d;
        for (int i = 0; i < notas.size(); i++) {
            promedio += notas.get(i);
        }
        
        return (promedio/notas.size());
    }

}
