package level1_exercise1;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ShowSortedDirectory {

    public void listDirectory(File directory) {

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

        System.out.println("Directory files list:");
        for (File file : filesList) {
            System.out.println("_ " + file);
        }
    }
}
