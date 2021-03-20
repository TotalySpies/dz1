import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your number:");
        int number= in.nextInt();
        if (number>0 && number<10){
           System.out.println("Положительное число меньше 10 ");
       }
        else if(number>10 || number<0 ){
            System.out.println("Положительное число больше 10 или отрицательное");
        }
        in.close();

    }
}
