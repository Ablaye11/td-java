// Fichier HelloWorldWithAttribut.java
public class HelloWorldWithAttribut {

    // Attribut maChaine
    String maChaine;

    // Méthode Hello
    public void Hello() {
        System.out.println(this.maChaine);
    }

    // Méthode main
    public static void main(String[] args) {
        // Instanciation de la classe
        HelloWorldWithAttribut s = new HelloWorldWithAttribut();
        // Affectation de l'attribut
        s.maChaine = "Salut";
        // Appel de la méthode Hello
        s.Hello();
    }
}
