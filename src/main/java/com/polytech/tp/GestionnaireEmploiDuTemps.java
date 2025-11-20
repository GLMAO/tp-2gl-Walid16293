package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    // Liste des observateurs abonnés
    private List<Observer> observateurs = new ArrayList<>();
    private String changement; // État du Sujet

    // Méthodes de l'interface Subject
    @Override
    public void attach(Observer o) {
        observateurs.add(o);
        System.out.println(o.getClass().getSimpleName() + " abonné.");
    }

    @Override
    public void detach(Observer o) {
        observateurs.remove(o);
        System.out.println(o.getClass().getSimpleName() + " désabonné.");
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : observateurs) {
            obs.update(message);
        }
    }
    // --- Fin des méthodes Subject ---

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        String message = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(message);
        // Notifier les observateurs
        setChangement(message);
    }

    public void modifierCours(ICours cours, String detailModification) {
        // Logique de modification...
        String message = "Modification du cours " + cours.getDescription() + " : " + detailModification;
        System.out.println(message);
        // Notifier les observateurs ici aussi
        setChangement(message);
    }

    // Méthode pour définir l'état et notifier
    public void setChangement(String message) {
        this.changement = message;
        notifyObservers(message);
    }
}