import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\khaul\\java files\\cobahapus");


        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

            for (File file : files) {
                if (!file.delete()) {
                    System.out.println("Gagal hapus file: " + file.getName());
                }
            }

            if (dir.delete()) {
                System.out.println("Direktori berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Folder tidak ditemukan.");
        }
    }
}
