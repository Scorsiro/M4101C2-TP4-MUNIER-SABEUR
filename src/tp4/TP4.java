/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import Controleur.Controleur;
import Modele.Batiment;
import Modele.Carte;
import Modele.Employé;
import Modele.GroupePersonne;
import Modele.GroupePortes;
import Modele.Porte;

/**
 *
 * @author munierto
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controleur controleur = new Controleur();
        
        Batiment batA = new Batiment("A");
        Porte porteA1 = new Porte();
        Porte porteA2 = new Porte();
        GroupePortes groupePortesA = new GroupePortes(batA);
        groupePortesA.addPorte(porteA1);
        groupePortesA.addPorte(porteA2);
        
        
        Batiment batB = new Batiment("B");
        Porte porteB1 = new Porte();
        Porte porteB2 = new Porte();
        Porte porteB3 = new Porte();
        
        GroupePortes groupePortesB1 = new GroupePortes(batB);
        groupePortesB1.addPorte(porteB1);
        
        GroupePortes groupePortesB23 = new GroupePortes(batB);
        groupePortesB23.addPorte(porteB2);
        groupePortesB23.addPorte(porteB3);
        
        
        
        Employé tom = new Employé("MUNIER","TOM");
        Employé oussama = new Employé("SABEUR","OUSSAMA");
        
        GroupePersonne employesBatA = new GroupePersonne("A");
        employesBatA.addEmploye(tom);
        employesBatA.addGroupePortes(groupePortesA);
        
        GroupePersonne employesBatBPorteB1 = new GroupePersonne("B");
        employesBatBPorteB1.addEmploye(oussama);
        employesBatBPorteB1.addGroupePortes(groupePortesB1);
        
        GroupePersonne employesBatBPorteB23 = new GroupePersonne("B");
        employesBatBPorteB1.addEmploye(oussama);
        employesBatBPorteB1.addEmploye(tom);
        employesBatBPorteB23.addGroupePortes(groupePortesB23);
        
        Carte carteTom = new Carte(tom);
        Carte carteOussama = new Carte(oussama);
    }
    
}
