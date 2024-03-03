package com.Listes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        List<Produit> listProuduits =new ArrayList<>();

        // Ajout de quelques produits
        listProuduits.add(new Produit(1, "Produit1", 1500));
        listProuduits.add(new Produit(2, "Produit2", 1700));
        listProuduits.add(new Produit(3, "Produit3", 45500));
        listProuduits.add(new Produit(4, "dell", 5500));

        System.out.println(listProuduits);
        System.out.println("******************");

        // Suppression d'un produit par indice
        listProuduits.remove(0);

        // Affichage de la liste mise à jour
        for (Produit p:listProuduits) {
            System.out.println(p);
        }

        System.out.println("********Q4**********");
        // Modification d'un produit par indice
       // listProuduits.set(0,new Produit(4,"Produit4",35000));

        listProuduits.get(0).setPrix(2500);
        for (Produit p:listProuduits) {
            System.out.println(p);
        }

        System.out.println("*********Q5*********");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un mot clé");
        String keyWord =scanner.next();
        for (Produit p :listProuduits) {
            if (p.getNom().contains(keyWord)){

                System.out.println(p);
            }
        }
    }
}
