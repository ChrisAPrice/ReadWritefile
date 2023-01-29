import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MathWriter {
    String fileToWriteTo = "";
    HashMap<Integer, Integer> mathMap = new HashMap<>();
    public MathWriter(String fileNameIn){
        //Constructor
        fileToWriteTo = fileNameIn;
    }

    public void doMath(List<Integer> numbers){
        numbers.stream().forEach(i -> mathMap.put(i, i*2));
        writeToFile();
    }

    private void writeToFile(){
        try (PrintWriter pw = new PrintWriter(fileToWriteTo)) {

            for(Map.Entry m: mathMap.entrySet())
            {
                pw.println(m.getKey() + " * 2 = " + m.getValue());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
