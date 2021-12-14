import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the first number:");
        Integer n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        Integer n2 = sc.nextInt();
            System.out.println("the sum is " + Math.addExact(n1,n2)); // Вызвынный метод позволяет учесть когда значение результата выходит за границы типа
            System.out.println("the product is " + Math.multiplyExact(n1,n2));// Вызвынный метод позволяет учесть когда значение результата выходит за границы типа
        }
        catch (InputMismatchException ae) {
            System.out.println("Аргументы для ввода целые числа от -2147483648 до 2147483647!");
        }
        catch (ArithmeticException ae) {
            System.out.println("The numbers you entered are too big!");//Ловит когда значение результата выходит за границы типа
        }
        sc.close();
    }
}
