package level1_exercise2;

import java.io.File;

public class MainEx2 {
    public static void main(String[] args) {
        File directory = new File(".." + File.separator);
        ShowDirectoryTree showDir = new ShowDirectoryTree();
        showDir.listDirectoryTree(directory, 0);
    }
}
