package lessonComparator_fifth;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FilesCreater filesCreater = new FilesCreater();
        List<File> fileList = filesCreater.getFileList();
        System.out.println(fileList);

        for (File file : fileList) {
            System.out.println(file.getName() + ": " + count(file));
        }

        Comparator<File> comp = Comparator.comparingInt(Main::count);

        fileList.sort(comp);
        System.out.println(fileList);
    }

    public static int count(File file) {
        String punctuation = "{,.-?! }";
        int punctuationCount = 0;
        try {
            String content = Files.readString(file.toPath());

            for (char c : content.toCharArray()) {
                if (punctuation.indexOf(c) != -1) {
                    punctuationCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return punctuationCount;
    }
}

