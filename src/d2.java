import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input days:");
        int days= in.nextInt();
        System.out.println("Input salary per hour:");
        double salaryPerHour = in.nextDouble();
        double salary =days*salaryPerHour+8;
        System.out.printf(" Your salary is %5.2f$",salary);
        double tax1= salary*0.05;
        System.out.println(" Your salary without tax1:");
        System.out.println(salary-tax1);
        double tax2= salary -tax1-1300;
        System.out.println("Your salary without tax2:");
        System.out.println(tax2);
        System.out.println("Your tax1 :");
        System.out.println(tax1);
        System.out.println("Your tax2:");
        System.out.println(1300);
        in.close();


    }
}
