package com.Sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Q1
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();
        //Q2
        groupeA.add("Ali");
        groupeA.add("Chaimae");
        groupeA.add("Karim");

        groupeB.add("Hamza");
        groupeB.add("Mohssin");
        groupeB.add("Chaimae");

        //Q3
        groupeA.retainAll(groupeB);
        System.out.println("Intersection des groupes A et B : " + groupeA);

        //Q4
        groupeA.addAll(groupeB);
        System.out.println("Union des groupes A et B : " + groupeA);

    }
}
