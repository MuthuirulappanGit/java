import java.util.Scanner;

public class EB1 {

    String cname, ctype;
    int cno, pre, cur;

    void setInput() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        cname = s.nextLine();

        System.out.print("Enter Customer Type (Domestic/Commercial): ");
        ctype = s.nextLine();

        System.out.print("Enter Customer Number: ");
        cno = s.nextInt();

        System.out.print("Enter Previous Reading: ");
        pre = s.nextInt();

        System.out.print("Enter Current Reading: ");
        cur = s.nextInt();
    }

    void calculateBill() {
        int units = cur - pre;
        double bill = 0;

        if (ctype.equalsIgnoreCase("Domestic")) {
            if (units <= 100)
                bill = units * 1.0;
            else if (units <= 200)
                bill = 100 * 1.0 + (units - 100) * 2.5;
            else if (units <= 500)
                bill = 100 * 1.0 + 100 * 2.5 + (units - 200) * 4.0;
            else
                bill = 100 * 1.0 + 100 * 2.5 + 300 * 4.0 + (units - 500) * 6.0;
        } else {
            if (units <= 100)
                bill = units * 2.0;
            else if (units <= 200)
                bill = 100 * 2.0 + (units - 100) * 4.5;
            else if (units <= 500)
                bill = 100 * 2.0 + 100 * 4.5 + (units - 200) * 6.0;
            else
                bill = 100 * 2.0 + 100 * 4.5 + 300 * 6.0 + (units - 500) * 7.0;
        }

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Customer Number : " + cno);
        System.out.println("Customer Name   : " + cname);
        System.out.println("Customer Type   : " + ctype);
        System.out.println("Units Consumed  : " + units);
        System.out.println("Bill Amount     : " + bill);
    }

    public static void main(String[] args) {
        EB1 obj = new EB1();
        obj.setInput();
        obj.calculateBill();
    }
}
