package com.mrurespect.studentcrud.logic;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GestionEtudiants {
    static ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>(List.of(new Etudiant("suazvczd", "samira", 18,"img_0.png"),
            new Etudiant("7eebx", "zineb", 9.5,"img_1.png"),
            new Etudiant("jscn7d ", "adam", 16.23,"img_2.png"),
            new Etudiant("masnwiue73", "imad", 8.9,"img_3.png")));
    public static ArrayList<Etudiant> getListeEtudiants(){
        return listeEtudiants;
    }
    public static void addEtudiant(Etudiant etudiant){
        listeEtudiants.add(etudiant);
    }
    public static void deleteEtudiant(String cin){
        listeEtudiants = listeEtudiants.stream().
                filter(etudiant -> !Objects.equals(etudiant.getCin(), cin))
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
