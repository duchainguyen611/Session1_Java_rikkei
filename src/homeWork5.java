import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem toan:");
        float math = scanner.nextFloat();
        System.out.print("Nhap diem van:");
        float literature = scanner.nextFloat();
        System.out.print("Nhap diem tieng anh:");
        float english = scanner.nextFloat();

        float sum = math + literature + english;
        float average = (float) (math + literature + english) / 3;

        System.out.printf("Tong diem = %.2f\nDiem trung binh = %.2f",sum,average);
    }
}
