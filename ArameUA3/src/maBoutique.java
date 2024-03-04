
import java.util.ArrayList;
import java.util.Scanner;

/*****************************************************************
 ** Nom & prénom : Arame Barre
 ** Numéro	: 2712919
 ** Date	: 07/12/2022
 ** Classe	: maBoutique
 *****************************************************************/

public class maBoutique {
    public static void main(String[] args) {
        // Tester Client
        System.out.println("-----------------   main : Client -----------------------------");
        Client c1 = new Client("nom1", "prenom1", "1234567890", "A1A0A0");
        c1.afficherClient();

       // Tester l'article.
       System.out.println("-----------------   main : Article -----------------------------");

       Article a1 = new Article();
       Article a2 = new Article(2,"a2");
       Article a3 = new Article(3,"a3","bleue");
       Article a4 = new Article(4,"a4",4);
       Article a5 = new Article(5,"a5","bleue",5);
       a1.afficherArticle();
       a2.afficherArticle();
       a3.afficherArticle();
       a4.afficherArticle();
       a5.afficherArticle();
       System.out.println("-- calculerPrixTTC  : "+a5.calculerPrixTTC());
       System.out.println("\n");

        // Tester ElementPanier
       System.out.println("-----------------   main : ElementPanier -----------------------------");
       ElementPanier ep1 = new ElementPanier(a5,5);
       ep1.afficherElementPanier();
       System.out.println("\n");
       // Tester Panier
     System.out.println("-----------------   main : Panier -----------------------------");
     Panier panier1 = new Panier();
     panier1.afficherPanier();
     System.out.println("\n");
     System.out.println("------------ Panier : ajouter ------------------------");
     panier1.ajouterArticle(a5, 10);
     panier1.afficherPanier();
     Article a6 = new Article(5,"a5");
     panier1.ajouterArticle(a6, 10);
     panier1.afficherPanier();
     panier1.supprimerArticle(a6);
     panier1.afficherPanier();

   System.out.println("\n");
         System.out.println("***********************************************");
         System.out.println("-*** 999 ********   main : Panier ************");
         panier1.ajouterArticle(a6, 10);
         panier1.afficherPanier();

         System.out.println("------------ Panier : Modifier ------------------------");
          panier1.modifierQuantiteArticle(a6, 20);
          panier1.afficherPanier();

          System.out.println("------------ Panier : Montant ------------------------");
          panier1.rechercherElementPanier(a6).getArticle().setPrixHT(10);
          panier1.ajouterArticle(a4,10);
          panier1.rechercherElementPanier(a4).getArticle().setPrixHT(10);
          panier1.afficherPanier();
          System.out.println("Le montant du panier est : " + panier1.getMontantPanier());

          System.out.println("------------ Panier : Vider ------------------------");
          panier1.viderPanier();
          panier1.afficherPanier();

         System.out.println("\n");System.out.println("\n");System.out.println("\n");

    }
}
