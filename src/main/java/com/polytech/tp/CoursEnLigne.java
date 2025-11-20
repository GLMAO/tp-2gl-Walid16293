package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    // Ajoute la mention " (En ligne)" à la description
    @Override
    public String getDescription() {
        return super.getDescription() + " (En ligne)";
    }

    // Délègue la durée, car la durée d'un cours en ligne pourrait rester la même.
    @Override
    public double getDuree() {
        return super.getDuree();
    };
}