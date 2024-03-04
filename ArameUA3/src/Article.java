/*****************************************************************
 ** Nom & prénom : Arame Barre
 ** Numéro	: 2712919
 ** Date	: 07/12/2022
 ** Classe	: Article
 *****************************************************************/

import java.util.Scanner;

public class Article {
    //DÉFINITION  DES ATTRIBUTS
    private int reference;// Doit etre saisie par l'utilisateur
    private String designation;
    private String couleur;// s'applique sur certainarticles
    private double prixHT;
    private final double tauxTVA=13;//constante partagée au niveau de la classe Article

//Définition des constructeurs
public  Article() {} //constructeur sans argument

    public Article(int reference,String designation){
    this.reference=reference;
        this.designation=designation;
         }
    public Article(int reference,String designation,String couleur){
        this.reference=reference;
        this.designation=designation;
        this.couleur=couleur;
    }

    public Article(int reference,String designation ,double prixHT){
        this.reference=reference;
        this.designation=designation;
        this.prixHT=prixHT;
    }
    public Article(int reference,String designation,String couleur ,double prixHT){
        this.reference=reference;
        this.designation=designation;
        this.couleur=couleur;
        this.prixHT=prixHT;

    }
    // MÉTHODES D'ACCÉS AUX ATTRIBUTS SETTER ET GETTER
    public void setreference(int reference){this.reference=reference; }//affectation de lidentifiant
    public int getreference() { return reference;}

    public void setddesignation(String designation){this.designation=designation; }//affectation de lidentifiant
    public String getdesignation() { return designation;}

    public void setcouleur(String couleur){this.couleur=couleur; }//affectation de couleur
    public String couleur() { return couleur;}

    public void setprixHT(double prixHT){this.prixHT=prixHT; }//affectation de prixht
    public double getprixHT() { return prixHT;}

        // LES MÉTHODES D'AFFICHAGE
    public void afficherArticle(){
        System.out.println("Article{" + ": Référence: "+ reference + '\t' +
                ", Désignatiuon: "+ designation + '\t' + ",Couleur: " + couleur + '\t'+
                ",Prix HT: " + prixHT + '\t' + ",Le Prix TTC est: " + prixHT+(prixHT*tauxTVA/100) +
                '}');
        }

        //MÉTHODE POUR CALCULER PRIXTTC
    public double calculerPrixTTC(){
    return prixHT+(prixHT*tauxTVA/100);
    }
    public void setPrixHT(double prixHT) {this.prixHT=prixHT;
         }
}

