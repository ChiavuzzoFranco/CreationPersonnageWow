import java.util.ArrayList;
import java.util.Scanner;

public class Compte {
    String pseudo;
    String mdp;
    Compte(String pseudo , String mdp) {
        this.pseudo = pseudo;
        this.mdp = mdp;
    }
    static ArrayList<Compte> listeComptes = new ArrayList<Compte>();
    public static void creationCompte(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------Creation de Compte--------------------------------------");
        System.out.println("Veuillez entrer votre nom de compte");
        String nomDecompte = scanner.next();

        System.out.println("Veuillez entrer un mdp");
        String mdp = scanner.next();

        Compte nomDeCompte = new Compte(nomDecompte, mdp);
        System.out.println(nomDeCompte + "," + nomDeCompte.pseudo + "," + nomDeCompte.mdp);
        Compte.listeComptes.add(nomDeCompte);


    }
    public static void connection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------Se Connecter-------------------------------------------");
        System.out.println("Veuillez entrer votre nom de compte");
        String nomDecompte = scanner.next();

        System.out.println("Veuillez entrer un mdp");
        String mdp = scanner.next();

        // Si pseudo est dans la liste de compte et que pseudo.mdp === mdp return true;
        for(int i=0; i< listeComptes.size();i++){
            System.out.println(listeComptes.get(i).pseudo + " " + nomDecompte);
            if(listeComptes.get(i).pseudo.equals(nomDecompte) && listeComptes.get(i).mdp.equals(mdp))
                System.out.println("Bienvenue :)");
            else
                System.out.println("Votre pseudo et/ou mdp est errone");
        }
        System.out.println("----------------------------------------------------------------------------------");
    }

}
