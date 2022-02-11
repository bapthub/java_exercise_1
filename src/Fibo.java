import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Fibo implements Command {

    @Override
    public String name(){
        return "fibo";
    }

    @Override
    public boolean run(Scanner scanner){
        System.out.println("Give the rank n of the fibonacci sequence");
        int n = scanner.nextInt();
        String s = scanner.nextLine();
        if (n == 1)
            System.out.println("1");
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
        return true;
    }
}
