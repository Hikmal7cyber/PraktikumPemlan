import java.io.File;
import java.util.Scanner;

public class HapusFolder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan path direktori yang akan dihapus: ");
        String pathDir = input.nextLine();
        
        File folder = new File(pathDir);
        
        if (folder.exists() && folder.isDirectory()) {
            File[] daftarFile = folder.listFiles();
            if (daftarFile != null) {
                for (File f : daftarFile) {
                    f.delete(); 
                }
            }
            
            if (folder.delete()) {
                System.out.println("Direktori dan semua file di dalamnya berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.err.println("Path tidak ditemukan atau bukan direktori!");
        }
        input.close();
    }
}