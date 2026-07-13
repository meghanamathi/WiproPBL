package IOStreams.IOoperations.Assignment3;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) {

        if (args.length != 2) {

            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;

        }

        String inputFile = args[0];
        String outputFile = args[1];

        // TreeMap automatically sorts keys alphabetically
        Map<String, Integer> wordCount = new TreeMap<>();

        try {

            Scanner fileReader = new Scanner(new File(inputFile));

            while (fileReader.hasNext()) {

                String word = fileReader.next();

                // Remove punctuation and convert to lowercase
                word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                if (!word.isEmpty()) {

                    wordCount.put(word,
                            wordCount.getOrDefault(word, 0) + 1);

                }

            }

            fileReader.close();

            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {

                writer.println(entry.getKey() + " : " + entry.getValue());

            }

            writer.close();

            System.out.println("Word count successfully written to " + outputFile);

        }

        catch (IOException e) {

            System.out.println("Error : " + e.getMessage());

        }

    }

}