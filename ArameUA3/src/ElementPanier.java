/*****************************************************************
 ** Nom & prénom : Arame Barre
 ** Numéro	: 2712919
 ** Date	: 07/12/2022
 ** Classe	: ElementPanier
 *****************************************************************/
public class ElementPanier {
    //DÉFINITION  DES ATTRIBUTS
 Article article;
private int qteArticle=0;
//Définition des constructeurs
    public ElementPanier(Article article,int qteArticle){
        this.qteArticle=qteArticle;
        this.article=article;
    }

    // MÉTHODES D'ACCÉS AUX ATTRIBUTS SETTER ET GETTER
public void setArticle(Article article){this.article=article;}
    public Article getArticle(){return article;}

    public void setqtearticle(int qteArticle){this.qteArticle=qteArticle;}
    public int getqtearticle() {return qteArticle++;}

    // LES MÉTHODES D'AFFICHAGE
    public void afficherElementPanier() {
        this.article.afficherArticle();
        System.out.println("Quantite est :" + qteArticle);
    }
    // ajouter une quantite
    public void ajouterQuantite(int quantite){
      quantite=qteArticle+10;
      }

}