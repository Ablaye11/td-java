public class Rectangle {

    private double largeur;
    private double hauteur;
    
    public Rectangle() {
        this.largeur = 1;
        this.hauteur = 1;
    }

   
    public Rectangle(double dimension) {
        this.largeur = dimension;
        this.hauteur = dimension;
    }

   
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double perimetre() {
        return 2 * (this.largeur + this.hauteur);
    }

    public double surface() {
        return this.largeur * this.hauteur;
    }


    public void agrandit(double facteur) {
        this.largeur *= facteur;
        this.hauteur *= facteur;
    }

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
