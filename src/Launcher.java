import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

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
            if (txt.equals("freq"))
            {
                System.out.println("Give the path of the file");
                String s = scanner.nextLine();
                Map<String, Integer> map = new HashMap<String, Integer>();
                try
                {
                    Scanner txtFile = new Scanner(new File(s));

                    while (txtFile.hasNext())
                    {
                        String word = txtFile.next().toLowerCase().replaceAll("[,!?;'\n.]", " ");
                        if (map.containsKey(word))
                        {
                            int count = map.get(word) + 1;
                            map.put(word, count);
                        }
                        else
                        {
                            map.put(word, 1);
                        }
                    }
                    txtFile.close();
                }catch (FileNotFoundException e)
                {
                    System.out.println("Unreadable file: ");
                }
                //map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(3).forEachOrdered(System.out::print);
                map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(3).forEachOrdered(entry -> {System.out.print(entry.getKey() + " "); });
                System.out.println();
            }
            else
                System.out.println("Unknown command");
        }
    }
}
