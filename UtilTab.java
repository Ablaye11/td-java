// Fichier UtilTab.java
public class UtilTab {

    // Méthode statique somme
    public static double somme(double[] tab) {
        double sum = 0;
        for (double val : tab) {
            sum += val;
        }
        return sum;
    }

    // Méthode statique incre
    public static void incre(double[] tab, double valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] += valeur;
        }
    }

    // Méthode statique pour afficher un tableau
    public static void affiche(double[] tab) {
        for (double val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Méthode main pour tester la classe
    public static void main(String[] args) {
        double[] tab = {1.0, 2.0, 3.0, 4.0};
        System.out.println("Somme: " + UtilTab.somme(tab));
        UtilTab.incre(tab, 2.0);
        System.out.print("Après incrémentation: ");
        UtilTab.affiche(tab);
    }
}
