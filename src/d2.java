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
        System.out.println(" Your tax1:"+salary/100*5);
        double tax1= in.nextDouble();
        int tax2=1300;
        System.out.println("Your tax2:"+salary-tax2);
        System.out.println(salary-tax1-tax2);
        in.close();


    }
}
