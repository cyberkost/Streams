package homework_01_11_2023;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise5 {

    public static void main(String[] args) {
        String pathInput = "text.txt";
        String pathOutput = "reverse-text.txt";
        textReverse(pathInput, pathOutput);
    }

    private static void textReverse(String pathInput, String pathOutput) {
        try (FileReader inputStream = new FileReader(pathInput);
             FileWriter fileWriter = new FileWriter(pathOutput)) {
            int m;
            StringBuilder stringBuilder = new StringBuilder();
            while ((m = inputStream.read()) > -1) {
                stringBuilder.append((char) m);
            }
            stringBuilder.reverse();
            fileWriter.write(stringBuilder.toString());
            System.out.println("OK");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
