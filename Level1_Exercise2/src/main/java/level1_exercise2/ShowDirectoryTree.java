package level1_exercise2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ShowDirectoryTree {

    private static final SimpleDateFormat DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void listDirectoryTree (File directory, int depth) {

        String indent = "- ".repeat(depth);

        if (!directory.exists()) {
            System.err.println("Error: This directory Not exist!");
            return;
        }
        if (!directory.isDirectory()) {
            System.err.println("Error: This file is not a directory!");
            return;
        }

        List<File> filesList = Arrays.asList(Objects.requireNonNull(directory.listFiles()));
        Collections.sort(filesList);

        for (File file : filesList) {

            String type = file.isDirectory() ? "[D]" : "[F]";
            String lastModificationDate = DATE_FORMAT.format(file.lastModified());

            System.out.println(indent + "->" + file.getName() + " is a " + type +
                    ", Last modification: " + lastModificationDate);

            if (file.isDirectory()) {
                listDirectoryTree(file, depth + 1);
            }
        }
    }
}
