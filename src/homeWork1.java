import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen:");
        int num = scanner.nextInt();

        System.out.printf("Binh phuong %d la: %d",num,(int)Math.pow(num,2));
    }
}
