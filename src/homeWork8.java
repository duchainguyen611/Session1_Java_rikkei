import java.util.Scanner;

public class homeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap nam sinh:");
        int yearBorn = scanner.nextInt();
        int yearNow = Integer.parseInt(String.valueOf(java.time.Year.now()));

        int age = yearNow - yearBorn;
        System.out.printf("Tuoi cua ban la: %d\n",age);
        if(age%2==0) System.out.print("Tuoi cua ban chan");
        else System.out.print("Tuoi cua ban le");
    }
}
