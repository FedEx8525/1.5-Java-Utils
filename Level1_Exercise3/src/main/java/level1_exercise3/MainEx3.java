package level1_exercise3;

import java.io.File;

public class MainEx3 {
    public static void main(String[] args) {
        DirectoryTreeToFile dirTreeToFile = new DirectoryTreeToFile();
        File directory = new File(".." + File.separator);
        dirTreeToFile.listDirectoryTreeToFile(directory, 0);
    }
}
