package level1_exercise2;

import java.io.File;

public class MainEx2 {
    public static void main(String[] args) {

        File directory;

        if (args.length > 0) {
            directory = new File(args[0]);
        } else {
            System.out.println("Error: Enter a directory path.");
            return;
        }

        ShowDirectoryTree showDir = new ShowDirectoryTree();
        showDir.listDirectoryTree(directory, 0);
    }
}
