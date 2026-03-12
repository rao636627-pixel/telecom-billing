import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Package (A/B/C): ");
        String pkg = sc.nextLine();

        System.out.print("Enter Minutes Used: ");
        int minutes = sc.nextInt();

        Customer c = new Customer(name, phone, pkg, minutes);

        c.display();
    }
}