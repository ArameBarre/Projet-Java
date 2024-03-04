/*****************************************************************
 ** Nom & prénom : Arame Barre
 ** Numéro	: 2712919
 ** Date	: 07/12/2022
 ** Classe	: Panier
 *****************************************************************/


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

//DÉFINITION  DES ATTRIBUTS
public class Panier {
    private String client;
    ArrayList<ElementPanier> listeElementPanier = new ArrayList<ElementPanier>();  // liste article
   private int  numPanier; // Numero automatique du panier
   private int  num = 0; // Nombre des paniers

    // Constructeur
    public Panier() { }  //Définition d'un constructeur sans argument

    // Getter et Setter
    public void setClient(String Client) {this.client=client; }
public String getClient(){return client; }

    public void setListeElementPanier( ArrayList<ElementPanier>listeElementPanier) { }
    public ArrayList<ElementPanier> getListeElementPanier() {
        return listeElementPanier;
     }
    public void setNumPanier(int numPanier) {this.numPanier=numPanier; }
    public int getNumPanier(){return numPanier; }

    public void setnum(int num) {this.num=num; }
    public int getnum(){return num++; }

    //methodes
    //afficher le panier
    public void afficherPanier() {
        System.out.println( "----------------- Panier -------------------");
        if (this.listeElementPanier.size() == 0)
            System.out.println("** Le Panier numero " +this.getNumPanier()+" est vide **");
        else  {
            System.out.println("** Le panier numero " +this.getNumPanier()+" contient les articles suivants : **");
            for (int i = 0; i < listeElementPanier.size(); i++){
                listeElementPanier.get(i).getArticle().afficherArticle();
                System.out.println("  Quantite : " + listeElementPanier.get(i).getqtearticle());
            }
        }
    }

// rechercher l'article a
   public int rechercherArticle(Article a,int num ) {
       //retourne num si l'article existe dans la liste
if (listeElementPanier.contains(a)){
    return num;
 }
//retourne 0 si l'article n'existe pas dans le panier
     else {
         return 0;
     }

    }
// rechercherElementPanier
   public ElementPanier rechercherElementPanier(Article a){
        for (int i=0;i<listeElementPanier.size();i++){
            ElementPanier elementPanier=listeElementPanier.get(i);

        if (elementPanier.getArticle()==a){
            return elementPanier;
        }
   }
  return null;
       }
       //ajouterArticle
  public void ajouterArticle(Article a, int quantite){
for (int i=0;i<listeElementPanier.size();i++){
    ElementPanier element = listeElementPanier.get(i);
//si l'article existe dans le panier
    if (element.getArticle()==a){
        element.setqtearticle(quantite);
        return;}
     }
// si l'article n'existe pas dans le panier,elle ajoute l'article et la qte au panier
      ElementPanier element = new ElementPanier(a,quantite);
listeElementPanier.add(element);
    }

    //supprimerArticle
 public void supprimerArticle(Article a){
     for (int i=0;i<listeElementPanier.size();i++){
         ElementPanier element = listeElementPanier.get(i);
         if (element.getArticle()==a){
             listeElementPanier.remove(i);
         }
     }
      }
//modifierquantiteArticle
    public void modifierQuantiteArticle(Article a,int quantite){
        for (int i=0;i<listeElementPanier.size();i++){
            ElementPanier element = listeElementPanier.get(i);
            if (element.getArticle()==a){ element.setqtearticle(quantite);
               }
            }
      }
//montantpanier
    //return la somme des montants des articles du panier

    public double getMontantPanier() {  double montant = 0 ;
        for (int i=0;i<listeElementPanier.size();i++){

        }
        return Math.round(montant*100)/100;

    }
    //viderpanier
    public void viderPanier() {
        this.listeElementPanier.clear();
    }

 }














