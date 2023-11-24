import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhap so nguyen co 4 chu so:");
            number = Integer.parseInt(scanner.nextLine());
        } while (number < 1000 || number > 9999);

        // tach cac chu so trong so nhap vao
        int a = number / 1000;
        int b = (number - a * 1000) / 100;
        int c = (number - a * 1000 - b * 100) / 10;
        int d = number % 10;

        int Sum = a + b + c + d;

        System.out.printf("Tong cac chu so la: %d\nNghich dao la: %d%d%d%d", Sum, d, c, b, a);
    }
}
