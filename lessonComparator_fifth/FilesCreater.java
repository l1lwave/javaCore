package lessonComparator_fifth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilesCreater{
    private static final List<File> fileList = new ArrayList<>();

    public FilesCreater() {
        createFiles();
    }

    public List<File> getFileList() {
        return fileList;
    }

    public static void createFiles(){
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt", "file4.txt"};
        String[] fileContents = {
                "Hello, world! This is the first file. Isn't it exciting?",
                "Here is the second file- it contains commas, semicolons, and colons. see?",
                "Third file's text has questions? Exclamations! And of course, full stops.",
                "Finally, the fourth file... It has ellipses, parentheses (like this), and dashes—amazing!"
        };

        for (int i = 0; i < fileNames.length; i++) {
            File file = new File(fileNames[i]);
            try (FileWriter writer = new FileWriter(fileNames[i])) {
                writer.write(fileContents[i]);
                fileList.add(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
