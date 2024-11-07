public class HelloWorldMethod {
    String maChaine;

    public void Hello() {
        System.out.println(this.maChaine);
    }

    
    public static void main(String[] args) {
        HelloWorldMethod s = new HelloWorldMethod();
        s.maChaine = "Salut";
        s.Hello();
    }
}
