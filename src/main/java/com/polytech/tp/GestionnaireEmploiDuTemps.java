package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {

    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        if (o != null && !observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        String msg = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(msg);
        notifyObservers(msg);
    }

    public void modifierCours(ICours cours, String message) {
        // Ici tu peux ajouter la logique de modification si besoin
        System.out.println("Cours modifié : " + message);
        notifyObservers(message);
    }

    // Méthode utilisée explicitement dans TpTests.java
    public void setChangement(String message) {
        // Cette méthode représente un changement quelconque dans l'emploi du temps
        notifyObservers(message);
    }
}

