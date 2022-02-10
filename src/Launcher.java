import java.util.Scanner;

public class Launcher {
    public static void main(String[] args)
    {
        System.out.println("Welcome !");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String txt = scanner.nextLine();
            if (txt.equals("quit"))
                System.exit(0);
            else
                System.out.println("Unknown command");
        }
    }
}
