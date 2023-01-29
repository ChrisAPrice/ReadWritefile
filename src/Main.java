import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputNumbers = new ArrayList<>();
       // HashMap<Integer, Integer> mathMap = new HashMap<>();

        MathWriter write = new MathWriter("output.txt");

        MathReader read = new MathReader("input.txt");
        inputNumbers = read.readFromFile();
        //System.out.println("Is list populated?\n");
        //inputNumbers.stream().forEach(i-> System.out.println(i));

        write.doMath(inputNumbers);
    }
}