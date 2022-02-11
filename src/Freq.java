import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class Freq implements Command {

    @Override
    public String name(){
        return "freq";
    }

    @Override
    public boolean run(Scanner scanner){
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
        return true;
    }
}
