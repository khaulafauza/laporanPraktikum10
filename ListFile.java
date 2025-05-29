import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        File dir = new File("java files");

        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                System.out.println("Daftar file:");
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            }
        } else {
            System.out.println("Bukan direktori.");
        }
    }
}
