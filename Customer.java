public class Customer {

    String name;
    String phone;
    String packageType;
    int minutesUsed;

    Customer(String name, String phone, String packageType, int minutesUsed) {
        this.name = name;
        this.phone = phone;
        this.packageType = packageType;
        this.minutesUsed = minutesUsed;
    }

    double calculateBill() {

        double bill = 0;

        switch(packageType) {

            case "A":
                bill = 300;
                if(minutesUsed > 100)
                    bill += (minutesUsed - 100) * 2;
                break;

            case "B":
                bill = 500;
                if(minutesUsed > 250)
                    bill += (minutesUsed - 250) * 1.5;
                break;

            case "C":
                bill = 800;
                break;

            default:
                System.out.println("Invalid Package");
        }

        return bill;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Package: " + packageType);
        System.out.println("Minutes Used: " + minutesUsed);
        System.out.println("Bill: " + calculateBill());
    }
}
