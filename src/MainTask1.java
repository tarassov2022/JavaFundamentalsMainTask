import java.util.Scanner; // импортируем класс Scanner

public class MainTask1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Name:");
    String a = sc.next();
    sc.close();
    System.out.println("Hello," + a);

}
}
