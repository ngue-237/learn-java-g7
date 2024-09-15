import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      Personne p1 = new Personne();
      p1.setNom("Tougoum");
      p1.setPrenom("Benjamin");
      p1.setAge(25);
      p1.setPoids(24);
      System.out.println(p1.getNom() + " " + p1.getPrenom());
      Personne p2 = new Personne("Ngué", "Emmanuel", 75.5, 25);

      System.out.println("Nom complet :" + p2.nomComplet());
      System.out.println("Entrez la limitation de poids");
      double limitation = sc.nextDouble();
      p1.limitationPoids(limitation);
      p2.limitationPoids(limitation);
    }
}