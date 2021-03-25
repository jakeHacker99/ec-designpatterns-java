package designpatternproxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("profil.png");

//        image will be loaded from disk
        image.display();
        System.out.println("");


    }
}
