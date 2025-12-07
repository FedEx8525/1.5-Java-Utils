package level1_exercise3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DirectoryTreeToFile {
    private static final SimpleDateFormat DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void listDirectoryTreeToFile (File directory, int depth) {

        if (!directory.exists()) {
            System.err.println("Error: This directory Not exist!");
            return;
        }
        if (!directory.isDirectory()) {
            System.err.println("Error: This file is not a directory!");
            return;
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("directoryTree.txt"));
            writer.println("\n --- Directory Tree List ---\n");
            listDirectoryTree(directory, depth, writer);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

         public void listDirectoryTree(File directory, int depth, PrintWriter writer) {
             String indent = "- ".repeat(depth);
             List<File> filesList = Arrays.asList(Objects.requireNonNull(directory.listFiles()));
             Collections.sort(filesList);

             for (File file : filesList) {

                 String type = file.isDirectory() ? "[D]" : "[F]";
                 String lastModificationDate = DATE_FORMAT.format(file.lastModified());

                 writer.println(indent + "->" + file.getName() + " is a " + type +
                         ", Last modification: " + lastModificationDate);

                 if (file.isDirectory()) {
                     listDirectoryTree(file, depth + 1, writer);
                 }
             }
        }

}
