public class CustomThread extends Thread{
    String name;

    public CustomThread(String s) {
        this.name = s;
    }

    public void run(){
        System.out.println("Starte Thread " + name);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Beende Thread "+name);
    }

}
