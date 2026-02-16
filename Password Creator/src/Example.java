import java.util.Random;

public class Example {
    Random r = new Random();
    int x = r.nextInt(1000);

    public static void main(String[] args) {
        Example Object = new Example();
        System.out.println(Object.x);
    }
}