import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so sinh vien can dien thong tin: ");
        int n = Integer.parseInt(scanner.nextLine());

        String name[] = new String[n];
        int age[] = new int[n];
        String phone[] = new String[n];
        String email[] = new String[n];

        for (int i=0;i<n;i++){
            System.out.printf("Nhap ho va ten sinh vien thu %d: ",i+1);
            name[i] = scanner.nextLine();
            System.out.printf("Nhap tuoi sinh vien thu %d: ",i+1);
            age[i] = Integer.parseInt(scanner.nextLine());
            System.out.printf("Nhap so dien thoai sinh vien thu %d: ",i+1);
            phone[i] = scanner.nextLine();
            System.out.printf("Nhap email sinh vien thu %d: ",i+1);
            email[i] = scanner.nextLine();
        }

        System.out.println("\b\b\b\b\bDanh Sach Sinh Vien");
        System.out.println("_______________________________________________________________________");
        System.out.println("| STT | Ho va ten      | Tuoi | So dien thoai | email                 |");
        for (int i=0;i<n;i++){
            System.out.printf("| %d   | %s   | %d   | %s    | %s |\n",i+1,name[i],age[i],phone[i],email[i]);
            System.out.println("_______________________________________________________________________");
        }
    }
}
