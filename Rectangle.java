// Fichier Rectangle.java
public class Rectangle {

    // Attributs largeur et hauteur
    private double largeur;
    private double hauteur;

    // Constructeur sans paramètre
    public Rectangle() {
        this.largeur = 1;
        this.hauteur = 1;
    }

    // Constructeur avec un paramètre
    public Rectangle(double dimension) {
        this.largeur = dimension;
        this.hauteur = dimension;
    }

    // Constructeur avec deux paramètres
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Méthode périmètre
    public double perimetre() {
        return 2 * (this.largeur + this.hauteur);
    }

    // Méthode surface
    public double surface() {
        return this.largeur * this.hauteur;
    }

    // Méthode agrandit
    public void agrandit(double facteur) {
        this.largeur *= facteur;
        this.hauteur *= facteur;
    }

    // Méthode main pour tester la classe
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Périmètre: " + r1.perimetre());
        System.out.println("Surface: " + r1.surface());

        Rectangle r2 = new Rectangle(2);
        System.out.println("Périmètre: " + r2.perimetre());
        System.out.println("Surface: " + r2.surface());

        Rectangle r3 = new Rectangle(3, 4);
        System.out.println("Périmètre: " + r3.perimetre());
        System.out.println("Surface: " + r3.surface());
        r3.agrandit(2);
        System.out.println("Après agrandissement:");
        System.out.println("Périmètre: " + r3.perimetre());
        System.out.println("Surface: " + r3.surface());
    }
}
