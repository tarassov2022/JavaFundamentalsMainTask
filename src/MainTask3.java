import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class MainTask3 {
    public static void main(String[] args){
        int i = 1;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter how many random numbers you want:");
            int n = sc.nextInt();
            if (n<0) throw new InputMismatchException();
            System.out.println("Enter the lower limit:");
            Integer a = sc.nextInt();
            System.out.println("Enter the upper limit:");
            Integer b = sc.nextInt();
            if (a>b) throw new InputMismatchException();
            System.out.println("Print from the new line? y or n");
            String yno = sc.next();
            sc.close();
            switch (yno) {
                case ("y"):
                    while (i <= n) {
                       System.out.print(a +  random.nextDouble()*(b - a)+ " ");
                       i = i + 1;
                   }
                   break;
                case "n":
                    while (i <= n) {
                       System.out.println(a +  random.nextDouble()*(b - a) + " ");
                       i = i + 1;
                    }
                   break;
                default:
                       System.out.println(" You should have entered y or n");
            }
        }
        catch (InputMismatchException ae){
            System.out.println("The impossible data is entered!");
        }

    }
}
    

