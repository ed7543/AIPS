import java.util.Scanner;

class Input {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: \n");

        int number = sc.nextInt();

        System.out.println("You entered " + number);

        sc.close(); */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = input.nextLine();

        System.out.println(name);

        input.close();
    }
}