package level1_exercise1;

import java.io.File;

public class MainEx1 {
    public static void main(String[] args) {
        File directory = new File(args[0]);
        ShowSortedDirectory showDir = new ShowSortedDirectory();
        showDir.listDirectory(directory);

    }
}
