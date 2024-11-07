public class UtilTab {

    public static double somme(double[] tableau) {
        double somme = 0;
        for (double valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }


    public static void incre(double[] tableau, double increment) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] += increment;
        }
    }

    public static void afficher(double[] tableau) {
        for (double valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}
//essaie
public class TestUtilTab {
    public static void main(String[] args) {
        double[] tableau = {1.0, 2.5, 3.8, 4.2};

        System.out.print("Tableau initial : ");
        UtilTab.afficher(tableau);

        double somme = UtilTab.somme(tableau);
        System.out.println("Somme des valeurs : " + somme);

        UtilTab.incre(tableau, 2.0);
        System.out.print("Tableau après incrément de 2.0 : ");
        UtilTab.afficher(tableau);
    }
}



//method sans static

public class UtilTab {
    
    public double somme(double[] tableau) {
        double somme = 0;
        for (double valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }

    public void incre(double[] tableau, double increment) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] += increment;
        }
    }

    public void afficher(double[] tableau) {
        for (double valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}
//essai
public class TestUtilTab {
    public static void main(String[] args) {
        UtilTab util = new UtilTab();
        double[] tableau = {1.0, 2.5, 3.8, 4.2};

        System.out.print("Tableau initial : ");
        util.afficher(tableau);

        double somme = util.somme(tableau);
        System.out.println("Somme des valeurs : " + somme);

        util.incre(tableau, 2.0);
        System.out.print("Tableau après incrément de 2.0 : ");
        util.afficher(tableau);
    }
}

