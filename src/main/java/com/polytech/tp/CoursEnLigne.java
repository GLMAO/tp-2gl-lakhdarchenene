package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // On conserve la description originale et on ajoute le suffixe
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // On garde la même durée que le cours de base
        return coursDecorated.getDuree();
    }
}

