// Fichier UtilTab.java
public class UtilTab {

    // Méthode somme
    public double somme(double[] tab) {
        double sum = 0;
        for (double val : tab) {
            sum += val;
        }
        return sum;
    }

    // Méthode incre
    public void incre(double[] tab, double valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] += valeur;
        }
    }

    // Méthode pour afficher un tableau
    public void affiche(double[] tab) {
        for (double val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Méthode main pour tester la classe
    public static void main(String[] args) {
        UtilTab util = new UtilTab();
        double[] tab = {1.0, 2.0, 3.0, 4.0};
        System.out.println("Somme: " + util.somme(tab));
        util.incre(tab, 2.0);
        System.out.print("Après incrémentation: ");
        util.affiche(tab);
    }
}
