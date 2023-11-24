import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;
        System.out.print("Nhap ban kinh hinh tron:");
        r = scanner.nextInt();
        System.out.printf("Chu vi = %.2f\nDien tich = %.2f", 2*r*Math.PI, Math.pow(r,2)*Math.PI);
    }
}
