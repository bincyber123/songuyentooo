import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số : ");
        int number = sc.nextInt();
        while (number < 2) {
            System.out.println("loi");
            number = sc.nextInt();
        }
        if (number == 2) {
            System.out.print(number + " is a prime ");
        } else {
            for (int i = 2 ; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            if (check)
                System.out.println(number + " is a prime ");
            else
                System.out.println(number + " is a not prime ");
        }
    }
}