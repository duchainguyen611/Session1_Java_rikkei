import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien USD:");
        int usd = Integer.parseInt(scanner.nextLine());
        int vnd = usd*23000;
        System.out.printf("%d USD = %d VND",usd,vnd);
    }
}
