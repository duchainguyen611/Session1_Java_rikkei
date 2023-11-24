import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d,r;
        do{
            System.out.print("Nhap chieu dai:");
            d = scanner.nextInt();
            System.out.print("Nhap chieu rong:");
            r = scanner.nextInt();
            if(d<=r){
                System.out.println("Chieu dai phai lon hon chieu rong");
            }
        }while (d<=r);
        System.out.printf("Chu vi = %d\nDien tich = %d",(d+r)*2,d*r);
    }
}
