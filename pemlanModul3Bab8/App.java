import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;

        System.out.print("===== PENDATAAN MAKHLUK HIDUP =====\n");
        System.out.print("1. Manusia\n");
        System.out.print("2. Hewan\n");
        System.out.print("3. Tumbuhan\n");
        System.out.print("Pilih jenis makhluk hidup (1/2/3): ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama manusia: ");
                nama = input.next();
                System.out.print("Masukkan umur manusia: ");
                umur = input.nextInt();
                Manusia manusia = new Manusia(nama, umur);
                manusia.tampilkanNama();
                manusia.tampilkanUmur();
                manusia.makan();
                manusia.berjalan();
                manusia.bersuara();
                break;
            case 2:
                System.out.print("Masukkan nama hewan: ");
                nama = input.next();
                System.out.print("Masukkan umur hewan: ");
                umur = input.nextInt();
                Hewan hewan = new Hewan(nama, umur);
                hewan.tampilkanNama();
                hewan.tampilkanUmur();
                hewan.makan();
                hewan.berjalan();
                hewan.bersuara();
                break;
            case 3:
                System.out.print("Masukkan nama tumbuhan: ");
                nama = input.next();
                System.out.print("Masukkan umur tumbuhan: ");
                umur = input.nextInt();
                Tumbuhan tumbuhan = new Tumbuhan(nama, umur);
                tumbuhan.tampilkanNama();
                tumbuhan.tampilkanUmur();
                tumbuhan.makan();
                tumbuhan.berjalan();
                tumbuhan.bersuara();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
        }
}
