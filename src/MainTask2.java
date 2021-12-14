import java.util.Scanner; // импортируем класс Scanner

public class MainTask2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter something:");
            String b = new StringBuilder(sc.nextLine()).reverse().toString();
            sc.close();
        System.out.println(b);

    }
}
