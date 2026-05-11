import java.io.File;
import java.util.Scanner;

public class UkuranFile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan path atau nama file: ");
        String namaFile = input.nextLine();
        
        File file = new File(namaFile); 
        
        if (file.exists() && file.isFile()) { 
            double bytes = file.length(); 
            
            if (bytes < 1024 * 1024) { 
                double kb = bytes / 1024;
                System.out.printf("Ukuran file: %.2f KB\n", kb);
            } else { 
                double mb = bytes / (1024 * 1024);
                System.out.printf("Ukuran file: %.2f MB\n", mb);
            }
        } else {
            System.err.println("Error: File tidak ditemukan atau path salah!");
        }
        
        input.close();
    }
}