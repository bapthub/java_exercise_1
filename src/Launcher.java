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
            if (txt.equals("fibo"))
            {
                System.out.println("Give the rank n of the fibonacci sequence");
                int n = scanner.nextInt();
                String s = scanner.nextLine();
                if (n == 1)
                {
                    System.out.println("1");
                }
                else
                {
                    long n1 = 0;
                    long n2 = 1;
                    long res = 0;
                    while (n >= 2)
                    {
                        res = n1 + n2;
                        n1 = n2;
                        n2 = res;
                        n-=1;
                    }
                    System.out.println(res);
                }
            }
            else
                System.out.println("Unknown command");
        }
    }
}
