import java.util.Scanner;

public class GUIDE_CONSTRUCTION {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Étape 1: Demander à l'utilisateur de scanner son plan
        System.out.println("Bienvenue dans GUIDE CONSTRUCTION!");
        System.out.println("Veuillez scanner votre plan ou entrer le nom du fichier du plan:");
        String planFileName = scanner.nextLine();

        // Étape 2: Proposer des plans à l'utilisateur
        System.out.println("Voici quelques plans disponibles:");
        System.out.println("1. Plan de maison simple");
        System.out.println("2. Plan de maison avec garage");
        System.out.println("3. Plan de maison avec jardin");
        System.out.print("Veuillez choisir un plan (1, 2 ou 3): ");
        int planChoice = scanner.nextInt();

        // Étape 3: Donner les étapes de la construction du plan choisi
        System.out.println("Voici les étapes de construction pour le plan choisi:");
        switch (planChoice) {
            case 1:
                System.out.println("1. Préparer le terrain");
                System.out.println("2. Construire les fondations");
                System.out.println("3. Eriger les murs");
                System.out.println("4. Installer le toit");
                System.out.println("5. Faire les finitions");
                break;
            case 2:
                System.out.println("1. Préparer le terrain");
                System.out.println("2. Construire les fondations");
                System.out.println("3. Eriger les murs de la maison");
                System.out.println("4. Construire le garage");
                System.out.println("5. Installer le toit");
                System.out.println("6. Faire les finitions");
                break;
            case 3:
                System.out.println("1. Préparer le terrain");
                System.out.println("2. Construire les fondations");
                System.out.println("3. Eriger les murs de la maison");
                System.out.println("4. Installer le toit");
                System.out.println("5. Aménager le jardin");
                System.out.println("6. Faire les finitions");
                break;
            default:
                System.out.println("Choix invalide.");
                return;
        }

        // Étape 4: Donner les dimensions et les matériaux nécessaires
        System.out.println("Voici les dimensions et les matériaux nécessaires pour la construction:");
        System.out.println("Dimensions des murs: 10m x 5m");
        System.out.println("Nombre de portes: 2");
        System.out.println("Nombre de fenêtres: 4");
        System.out.println("Quantité de sable nécessaire: 5 tonnes");
        System.out.println("Quantité de fer nécessaire: 200 kg");
        System.out.println("Quantité de ciment nécessaire: 10 sacs");
        System.out.println("Nombre de briques pour chaque coin et murs: 5000 briques");

        scanner.close();
    }
}
