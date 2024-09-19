import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedit diisne chislo n: ");
        double nDouble = scanner.nextDouble();
        System.out.print("Vvedit diisne chislo m: ");
        double mDouble = scanner.nextDouble();

        double result1 = calculateExpression(nDouble, mDouble);
        System.out.println("Result (diisni vhidni, diisnui result): " + result1);

        System.out.print("Vvedit tsile chislo n: ");
        int nInt = scanner.nextInt();
        System.out.print("Vvedit tsile chislo m: ");
        int mInt = scanner.nextInt();

        double result2 = calculateExpression(nInt, mInt);
        System.out.println("Result (tsili vhidni, diisnui result): " + result2);

        int result3 = (int) calculateExpression(nDouble, mDouble);
        System.out.println("Result (diisni vhidni, tsilui result): " + result3);

        scanner.close();
    }

    public static double calculateExpression(double n, double m) {
        return ((n + 1) / (n * n * m + 2)) + ((m + n) / (m - n)) + Math.pow(n, 3);
    }
}
