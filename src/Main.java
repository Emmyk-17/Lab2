import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random gen = new Random();
        int x = gen.nextInt(10);
        int y;

        System.out.format("This is x and its value is %d\n", x);

        y = x + gen.nextInt(4) + 11;
        x += 3;
        System.out.println("Hello world!");
        System.out.println("this is y its value is " + y);
        System.out.format("This is x and its new value is %d\n", x);
    }
}
