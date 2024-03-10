import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner name =new Scanner(System.in);
        System.out.println("Enter your name>");
      String message=  name.nextLine();
System.out.println("Hello "+message);
    }
}