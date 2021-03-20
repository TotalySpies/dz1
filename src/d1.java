import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        System.out.print("Enter your surname:");
        String surname = in.nextLine();
        System.out.print("Enter your patronymic :");
        String patronymic = in.nextLine();
        System.out.print("Enter your age:");
        int age= in.nextInt();
        System.out.printf("Hello! \n name=%s; surname=%s; patronymic=%s; age=%d;" ,name,surname,patronymic,age );
         int currentYear= 2021;
        System.out.print("Year of birth:");
        System.out.println( currentYear-age);
        in.close();
    }
}
