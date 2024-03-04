/*****************************************************************
 ** Nom & prénom : Arame Barre
 ** Numéro	: 2712919
 ** Date	: 07/12/2022
 ** Classe	: Client
 *****************************************************************/
public class Client {

    //DÉFINITION  DES ATTRIBUTS
    private int identifiant;// generer automatiquement
    private String nom;
    private String prenom;
    private String tel;
    private String codePostal;
    private int num=0; // Nombre des clients

    //Définition des constructeurs
     public  Client() { }//Définition d'un constructeur sans argument
    public Client(String nom,String prenom,String tel,String codePostal){
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.codePostal=codePostal;

    }
    //MÉTHODES D'ACCÉS AUX ATTRIBUTS  GETTER ET SETTER
    public void setidentifiant(int identifiant){this.identifiant=identifiant; }//affectation de lidentifiant
    public int getIdentifiant() { return identifiant;}

    public void setnom(String nom){this.nom=nom; }//affectation du nom
    public String getnom() { return nom;}

    public void setPrenom(String prenom){ this.prenom=prenom;}//affectation de prenom
    public String getPrenom() { return prenom;}

    public void setTel(String tel){this.tel=tel; }//affectation de tel
    public String gettel() { return tel;}

    public void setCodePostal(String codePostal){this.codePostal=codePostal; }//affectation du code postal
    public String getCodePostal() { return codePostal;}

    public void setnumt(int num){this.num=num;
     num++;}//affectation de lidentifiant
    public int getnum() { return num;}

//LES METHODES
public void afficherClient(){
        System.out.println( "Client{" + "Identifiant='" + identifiant +  '\''+  "Nom='" + nom
        +'\''+ "Prenom='" + prenom + '\''+ "Tel='" + tel + '\''+
                "CodePostal='" + codePostal + '}' );
}
}