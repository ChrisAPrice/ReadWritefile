import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathReader {
    String fileToReadFrom = "";
    public MathReader(String fileNameIn){
        fileToReadFrom = fileNameIn;
    }
    public List<Integer> readFromFile(){
        List<Integer> reader = new ArrayList<>();
        try (Scanner r1 = new Scanner(new FileReader("input.txt"))) {
            int i = 0;

            while (r1.hasNextInt()) {
                i = r1.nextInt();
                reader.add(i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return reader;
    }
}
