package level1_exercise3;

import java.io.File;

public class MainEx3 {
    public static void main(String[] args) {
        File directory;

        if (args.length > 0) {
            directory = new File(args[0]);
        } else {
            System.out.println("Error: Enter a directory path.");
            return;
        }

        DirectoryTreeToFile dirTreeToFile = new DirectoryTreeToFile();
        dirTreeToFile.listDirectoryTreeToFile(directory, 0);
    }
}
