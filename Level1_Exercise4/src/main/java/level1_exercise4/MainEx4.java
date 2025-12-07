package level1_exercise4;

import java.io.File;

public class MainEx4 {

    public static void main( String[] args ) {
        WriteAndReadTxtFile writeAndRead = new WriteAndReadTxtFile();

        if (args.length == 0) {
            System.out.println("\n--- Create Directory Tree List ---\n");

            File directory = new File(".." + File.separator);
            writeAndRead.listDirectoryTreeToFile(directory, 0);
        } else if (args.length == 1) {
            System.out.println("\n--- Reading Txt File ---\n");

            String filePath = args[0];

            WriteAndReadTxtFile.readTxtFile(filePath);
        } else {
            System.err.println("Error: invalid path.");
        }

    }
}
