public class Greeting {
    public static void main(String... args) {
        System.out.println("Здравствуйте, Иван Валентинович!");
        int a=355;
        int b=113;
        double p = pi(a,b);
        System.out.println(p);
        System.out.println(Math.PI);
    }

    public static double pi(int a, int b) {
        return (double)a/b;
    }
}
