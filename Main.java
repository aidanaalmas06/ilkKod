public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
                sum += number * number * number;
            }
        }

        System.out.println("1 ile 20 arasındaki çift sayıların küpleri toplamı: " + sum);
    }
}
