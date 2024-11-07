public class Carac {
    private char caractere;
    public Carac(char caractere) {
        this.caractere = caractere;
    }
    public Carac() {
        this.caractere = ' ';
    }

    public boolean estVoyelle() {
        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char v : voyelles) {
            if (this.caractere == v) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Carac c1 = new Carac('a');
        System.out.println("Est-ce une voyelle ? " + c1.estVoyelle());

        Carac c2 = new Carac('b');
        System.out.println("Est-ce une voyelle ? " + c2.estVoyelle());
    }
}
