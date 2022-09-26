public class Main {
    public static void main(String[] args) {
        CustomThread t1 =new CustomThread("Erster Fred:)");
        CustomThread t2 =new CustomThread("Zweiter Fred:)");

        t1.start();
        t2.start();
    }
}
