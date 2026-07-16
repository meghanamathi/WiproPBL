package LogicBuilding.Day3and4;

    import java.util.Scanner;

public class AddLAstDigits {

    public static int addLastDigits(int input1, int input2) {

        int digit1 = Math.abs(input1 % 10);

        int digit2 = Math.abs(input2 % 10);

        return digit1 + digit2;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");

        int number1 = sc.nextInt();

        System.out.print("Enter Second Number: ");

        int number2 = sc.nextInt();

        System.out.println(addLastDigits(number1, number2));

        sc.close();

    }

}
