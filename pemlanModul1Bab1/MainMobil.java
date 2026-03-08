    // M HIKMAL AL-GHIFARY (255150700111030) - TI A
import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Mobil[] m = new Mobil[2];

        for (int i = 0; i < m.length; i++) {
            m[i] = new Mobil(); 
            
            System.out.println("===== Data Mobil ke " + (i + 1) + " =====");
            
            System.out.print("Masukkan kecepatan: ");
            m[i].setKecepatan(in.nextInt()); 

            System.out.print("Masukkan waktu (jam): ");
            m[i].setWaktu(in.nextDouble());

            in.nextLine(); 
            
            System.out.print("Masukkan Manufaktur: ");
            m[i].setManufaktur(in.nextLine());
            
            System.out.print("Nomor Plat: ");
            m[i].setNoPlat(in.nextLine());
            
            System.out.print("Masukkan Warna: ");
            m[i].setWarna(in.nextLine());

            System.out.println("=======================================");
            m[i].displayMessage();
            
            System.out.println("-------------------------");
        }

        System.out.println("Mobil pada objek m1 dirubah menjadi warna hijau");
        m[0].setWarna("Hijau");
        m[0].displayMessage();
    }
}