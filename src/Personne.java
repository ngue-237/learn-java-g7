public class Personne {

    private String nom;
    private String prenom;
    private double poids;
    private int age;

    public Personne(){

    }

    public Personne(String nom, String prenom, double p, int ag){
        this.nom = nom;
        this.prenom = prenom;
        this.poids = p;
        age = ag;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenomnom){
        this.prenom = prenom;
    }

    public double getPoids(){
        return this.poids;
    }
    public void setPoids(double poids){
        this.poids = poids;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String nomComplet(){

        String nomComplet = this.nom + " " +this.prenom;
        return nomComplet;
    }

    public void limitationPoids(double limitation){
        if (this.poids < limitation)
            System.out.println("Vous pouvez passer");
        else if(poids == limitation)
            System.out.println("Vous ne pouvez pas passer");
        else
            System.out.println("Veuillez emprunter une route adapter à votre poids");
    }




}
