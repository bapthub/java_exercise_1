import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Launcher {
    public static void main(String[] args)
    {
        List<Command> commands = new ArrayList<Command>();
        commands.add(new Freq());
        commands.add(new Fibo());
        commands.add(new Quit());
        System.out.println("Welcome !");
        Scanner scanner = new Scanner(System.in);
        boolean test = true;
        while (test)
        {
            String txt = scanner.nextLine();
            Command comm = commands.stream().filter(writtenCMD -> txt.equals(writtenCMD.name())).findAny()
                .orElse(null);
            if (Objects.isNull(comm)) {
                System.out.println("Unknown command");
            } else {
                test = comm.run(scanner);
            }
        }
        scanner.close();
    }
}
