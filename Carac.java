// Fichier Carac.java
public class Carac {

    // Attribut caractère
    private char caractere;

    // Constructeur avec paramètre
    public Carac(char caractere) {
        this.caractere = caractere;
    }

    // Constructeur sans paramètre
    public Carac() {
        this.caractere = ' ';
    }

    // Méthode estVoyelle
    public boolean estVoyelle() {
        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char v : voyelles) {
            if (this.caractere == v) {
                return true;
            }
        }
        return false;
    }

    // Méthode main pour tester la classe
    public static void main(String[] args) {
        Carac c1 = new Carac('a');
        System.out.println("Est-ce une voyelle ? " + c1.estVoyelle());

        Carac c2 = new Carac('b');
        System.out.println("Est-ce une voyelle ? " + c2.estVoyelle());
    }
}
