package com.polytech.tp;

public class CoursBuilder {
    // Les champs doivent correspondre aux paramètres du constructeur de Cours
    private String matiere = "Non Défini";
    private String enseignant = "Non Défini";
    private String salle = "À Déterminer";
    private String date = "Inconnue";
    private String heureDebut = "00:00";
    private boolean estOptionnel = false;
    private String niveau = "L3";
    private boolean necessiteProjecteur = false;

    // Les méthodes set renvoient l'objet Builder lui-même (this) pour le chaînage
    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setEstOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    // La méthode build crée et retourne l'objet final Cours
    public Cours build() {
        return new Cours(matiere, enseignant, salle, date,
                heureDebut, estOptionnel, niveau, necessiteProjecteur);
    }
}