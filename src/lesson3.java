import java.util.Scanner;


public class lesson3 {
    static String[] arrNum = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] arrNum2 = {"twenty", "thirty", "forty", "fifty", "seventy", "eighty", "ninety"};

    public static String readNum2(int num) {
        String numWord = "";
        switch (num) {
            case 1:
                numWord = arrNum[0];
                break;
            case 2:
                numWord = arrNum[1];
                break;
            case 3:
                numWord = arrNum[2];
                break;
            case 4:
                numWord = arrNum[3];
                break;
            case 5:
                numWord = arrNum[4];
                break;
            case 6:
                numWord = arrNum[5];
                break;
            case 7:
                numWord = arrNum[6];
                break;
            case 8:
                numWord = arrNum[7];
                break;
            case 9:
                numWord = arrNum[8];
                break;
        }
        return numWord;
    }

    public static String readNum3(int num) {
        String numWord = "";
        switch (num) {
            case 10:
                numWord = "ten";
                break;
            case 11:
                numWord = "eleven";
                break;
            case 12:
                numWord = "twelve";
                break;
            case 13:
                numWord = "thirteen";
                break;
            case 14:
                numWord = "fourteen";
                break;
            case 15:
                numWord = "fifteen";
                break;
            case 16:
                numWord = arrNum[5] + "teen";
                break;
            case 17:
                numWord = arrNum[6] + "teen";
                break;
            case 18:
                numWord = arrNum[7] + "een";
                break;
            case 19:
                numWord = arrNum[8] + "teen";
                break;
        }
        return numWord;
    }

    public static String readNum4(int num) {
        String numWord = "";
        switch (num) {
            case 2:
                numWord = arrNum2[0];
                break;
            case 3:
                numWord = arrNum2[1];
                break;
            case 4:
                numWord = arrNum2[2];
                break;
            case 5:
                numWord = arrNum2[3];
                break;
            case 6:
                numWord = arrNum2[4];
                break;
            case 7:
                numWord = arrNum2[5];
                break;
            case 8:
                numWord = arrNum2[6];
                break;
            case 9:
                numWord = arrNum2[7];
                break;
        }
        return numWord;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can doc tu 0 den 999:");
        int number = scanner.nextInt();

        int numberHundreds, numberDozens, numberUnitRow, numberDozensUnitRow;

        if (number == 0) {
            System.out.printf("So %d doc la: zero", number);
        }
        if (number > 0 && number < 10) {
            System.out.printf("So %d doc la: %s", number, readNum2(number));
        } else if (number >= 10 && number < 20) {
            System.out.printf("So %d doc la: %s", number, readNum3(number));
        } else if (number >= 20 && number < 100) {
            numberDozens = number / 10;
            numberUnitRow = number % 10;
            if (number % 10 == 0) {
                System.out.printf("So %d doc la: %s", number, readNum4(numberDozens));
            } else {
                System.out.printf("So %d doc la: %s %s", number, readNum4(numberDozens), readNum2(numberUnitRow));

            }
        } else if (number == 100) {
            System.out.printf("So %d doc la: one hundred", number);
        } else if (number > 100 && number <= 999) {
            numberHundreds = number / 100;
            numberDozensUnitRow = number - numberHundreds * 100;
            numberDozens = (numberDozensUnitRow) / 10;
            numberUnitRow = (numberDozensUnitRow) % 10;
            if (numberDozens == 0) {
                System.out.printf("So %d doc la: %s hundred and %s", number, readNum2(numberHundreds), readNum2(numberUnitRow));
            } else if (numberDozens < 2) {
                System.out.printf("So %d doc la: %s hundred and %s", number, readNum2(numberHundreds), readNum3(numberDozensUnitRow));
            } else if (number % 10 == 0) {
                System.out.printf("So %d doc la: %s hundred and %s", number, readNum2(numberHundreds), readNum4(numberDozens));
            }else {
                System.out.printf("So %d doc la: %s hundred and %s %s", number, readNum2(numberHundreds), readNum4(numberDozens), readNum2(numberUnitRow));
            }
        }else{
            System.out.print("So nay sai dieu kien");
        }
    }
}
