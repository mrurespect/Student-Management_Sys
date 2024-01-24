package com.mrurespect.studentcrud.logic;

public class Etudiant {
    private String cin;
    private String nom ;
    private double moyenne;
    private String image;

    public Etudiant(String cin, String nom, double moyenne) {
        this.cin = cin;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public Etudiant(String cin, String nom, double moyenne, String image) {
        this.cin = cin;
        this.nom = nom;
        this.moyenne = moyenne;
        this.image = image;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    public boolean equals(Etudiant etudiant){
        return this.cin.equals(etudiant.cin);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
