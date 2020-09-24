public class Greeting {
    public static void main(String... args) {
        System.out.println("Здравствуйте, Иван Валентинович!");
        int iab = 400;
        double delta = 0.00001;
        for (int i = 1; i < iab; i++) {
            for (int j = iab; j > 2; j--) {
                double p = CalcAB.pi(i, j);
                if (Math.abs((p - Math.PI)/p)  < delta) {
                    System.out.println(i + " " + j + " " + p);
                }
            }
        }
    }
}
