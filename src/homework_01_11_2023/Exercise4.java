package homework_01_11_2023;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise4 {

    public static void main(String[] args) {
        String pathInput = "text.txt";
        String pathOutput = "long-word-from-text.txt";
        longWord(pathInput, pathOutput);
    }

    private static void longWord(String pathInput, String pathOutput) {
        try (FileReader inputStream = new FileReader(pathInput);
             FileWriter fileWriter = new FileWriter(pathOutput)) {
            int characters;
            StringBuilder stringBuilder = new StringBuilder();
            while ((characters = inputStream.read()) != -1) {
                stringBuilder.append((char) characters);
            }
            stringBuilder.append(characters);
            fileWriter.write(stringBuilder.toString());
            System.out.println("OK");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
