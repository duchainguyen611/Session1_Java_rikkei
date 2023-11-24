import java.util.Scanner;

public class homeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap 3 so nguyen:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        int min = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.printf("So lon nhat la: %d\nSo be nhat la: %d", max, min);
    }
}
