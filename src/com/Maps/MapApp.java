package com.Maps;

import com.Listes.Produit;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String,Double> notes = new HashMap<>();
        //Q2
        notes.put("souhail", 15.5);
        notes.put("khalid", 18.0);
        notes.put("abdo", 9.5);
        notes.put("farid", 14.2);
        //notes.put("hiba", 20.0);

        //Q3
        double noteFarid = notes.get("farid");
        notes.replace("farid",noteFarid+1);
        System.out.println(notes.get("farid"));
        //notes.replace("rachid",notes.get("rachid")+1);

        //Q4
        notes.remove(0);

        //Q5
        System.out.println("Taille de Map : "+ notes.size());

        //Q6
        System.out.println("////////////////");
        double sommeNotes = 0.0;
        double noteMin = Double.MAX_VALUE;
        double noteMax = Double.MIN_VALUE;

        for (double note : notes.values()) {
            sommeNotes += note;
            noteMin = Math.min(noteMin, note);
            noteMax = Math.max(noteMax, note);
        }

        double noteMoyenne = sommeNotes / notes.size();
        System.out.println("Note moyenne : " + noteMoyenne);
        System.out.println("Note minimale : " + noteMin);
        System.out.println("Note maximale : " + noteMax);

        //Q7
        boolean hasNote20 = false;
        for (Double note : notes.values()) {
            if (note == 20.0) {
                hasNote20 = true;
                break;
            }
        }
        System.out.println("Il y a une note égale à 20 : " + hasNote20);

        //Q8
        System.out.println("Liste des notes :");
        notes.forEach((nom, note) -> System.out.println(nom + " : " + note));
    }

}
