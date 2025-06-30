public class Main {
    public static void main(String[] args) {
        Factory factory1 = new Factory();

        Shape s1 =factory1.getShape("Circle");
        s1.draw();

        Shape s2 =factory1.getShape("Square") ;
        s2.draw();
    }
}
