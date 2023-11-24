import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem toan:");
        int math = scanner.nextInt();
        System.out.print("Nhap diem ly:");
        int physic = scanner.nextInt();
        System.out.print("Nhap diem hoa:");
        int chemistry = scanner.nextInt();
        System.out.print("Nhap diem van:");
        int literature = scanner.nextInt();
        System.out.print("Nhap diem tieng anh:");
        int english = scanner.nextInt();

        float average = (float) (math + physic + chemistry + literature + english) /5;

        System.out.printf("Diem trung binh: %.2f\n",average);
        if(average>=0 && average <5) System.out.print("Xep loai yeu");
        else if(average>=5 && average <6.5) System.out.print("Xep loai trung binh");
        else if(average>=6.5 && average <8) System.out.print("Xep loai kha");
        else if(average>=8 && average <9) System.out.print("Xep loai gioi");
        else System.out.print("Xep loai xuat sac");


    }
}
