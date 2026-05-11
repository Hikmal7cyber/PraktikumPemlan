import java.io.File;
import java.util.Scanner;

public class DaftarFile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan path direktori: ");
        String pathDir = input.nextLine();
        
        File direktori = new File(pathDir);
        
        if (direktori.exists() && direktori.isDirectory()) {
            String[] daftarNama = direktori.list();
            
            if (daftarNama != null && daftarNama.length > 0) {
                System.out.println("Daftar file/folder di dalam direktori tersebut:");
                for (String nama : daftarNama) {
                    System.out.println("- " + nama);
                }
            } else {
                System.out.println("Direktori kosong.");
            }
        } else {
            System.err.println("Error: Path tidak ditemukan atau bukan merupakan direktori!");
        }
        
        input.close();
    }
}