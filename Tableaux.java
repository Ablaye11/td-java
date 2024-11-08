public class Tableaux {
 
    public static void affiche(double[][] t) {
        for (double[] ligne : t) {
            for (double val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


    public static boolean regulier(double[][] t) {
        int taille = t[0].length;
        for (double[] ligne : t) {
            if (ligne.length != taille) {
                return false;
            }
        }
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (double val : t[i]) {
                sommes[i] += val;
            }
        }
        return sommes;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2) || t1.length != t2.length || t1[0].length != t2[0].length) {
            return null;
        }
        double[][] resultat = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        double[][] t1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] t2 = {{5.0, 6.0}, {7.0, 8.0}};

        System.out.println("Tableau t1:");
        Tableaux.affiche(t1);

        System.out.println("Tableau t2:");
        Tableaux.affiche(t2);

        System.out.println("Somme des lignes de t1:");
        double[] sommes = Tableaux.sommeLignes(t1);
        for (double s : sommes) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Somme de t1 et t2:");
        double[][] somme = Tableaux.somme(t1, t2);
        if (somme != null) {
            Tableaux.affiche(somme);
        } else {
            System.out.println("Les tableaux ne sont pas compatibles pour la somme.");
        }
    }
}
