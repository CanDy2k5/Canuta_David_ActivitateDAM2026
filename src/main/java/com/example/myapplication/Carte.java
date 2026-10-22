package com.example.myapplication;
import java.io.Serializable;
public class Carte implements Serializable {
    private String titlu;
    private String autor;
    private int numarPagini;
    private boolean citita;
    private String format;
    private String gen;
    private float evaluare;
    private boolean disponibila;

    public Carte(String titlu, String autor, int numarPagini,
                 boolean citita, String format, String gen,
                 float evaluare, boolean disponibila) {

        this.titlu = titlu;
        this.autor = autor;
        this.numarPagini = numarPagini;
        this.citita = citita;
        this.format = format;
        this.gen = gen;
        this.evaluare = evaluare;
        this.disponibila = disponibila;
    }

    public void afisare() {
        System.out.println("Titlu: " + titlu);
        System.out.println("Autor: " + autor);
        System.out.println("Numar pagini: " + numarPagini);
        System.out.println("Citita: " + citita);
        System.out.println("Format: " + format);
        System.out.println("Gen: " + gen);
        System.out.println("Evaluare: " + evaluare);
        System.out.println("Disponibila: " + disponibila);
    }


    @Override
    public String toString() {
        return "Titlu: " + titlu +
                "\nAutor: " + autor +
                "\nNumar pagini: " + numarPagini +
                "\nCitita: " + citita +
                "\nFormat: " + format +
                "\nGen: " + gen +
                "\nEvaluare: " + evaluare +
                "\nDisponibila: " + disponibila;
    }
}

