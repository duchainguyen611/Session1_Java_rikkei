import java.util.Scanner;

public class lesson7 {
    static String[] arrNum = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhap so can doc tu 0 den 9:");
            number = scanner.nextInt();
        }while (number<0 || number>9);
        String numWord = "";

        switch (number) {
            case 0:
                numWord = arrNum[0];
                break;
            case 1:
                numWord = arrNum[1];
                break;
            case 2:
                numWord = arrNum[2];
                break;
            case 3:
                numWord = arrNum[3];
                break;
            case 4:
                numWord = arrNum[4];
                break;
            case 5:
                numWord = arrNum[5];
                break;
            case 6:
                numWord = arrNum[6];
                break;
            case 7:
                numWord = arrNum[7];
                break;
            case 8:
                numWord = arrNum[8];
                break;
            case 9:
                numWord = arrNum[9];
                break;
        }
        System.out.println(numWord);
    }
}
