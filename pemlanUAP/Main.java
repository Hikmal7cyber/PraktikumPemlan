import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GoDriveRentalSystem sistem = new GoDriveRentalSystem();
        Scanner input = new Scanner(System.in);
        int pilihanMenu = 0;

        sistem.tambahkendaraan(new Mobil("MBL01", "Toyota Avanza", 350000, 7));
        sistem.tambahkendaraan(new Mobil("MBL02", "Daihatsu Sigra", 300000, 5));
        sistem.tambahkendaraan(new Motor("MTR01", "Honda Vario", 80000, "Matik"));

        do {
            System.out.println("\n====== MENU GO DRIVE RENTAL SYSTEM ======");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Daftar Armada");
            System.out.println("3. Sewa Kendaraan");
            System.out.println("4. Kembalikan Kendaraan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                pilihanMenu = Integer.parseInt(input.nextLine());
                
                switch (pilihanMenu) {
                    case 1:
                        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
                        String jenis = input.nextLine();
                        System.out.print("Masukkan kode kendaraan: ");
                        String kode = input.nextLine();
                        System.out.print("Masukkan nama kendaraan: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan harga sewa per hari: ");
                        double harga = Double.parseDouble(input.nextLine());

                        if (jenis.equalsIgnoreCase("mobil")) {
                            System.out.print("Masukkan kapasitas kursi: ");
                            int kursi = Integer.parseInt(input.nextLine());
                            sistem.tambahkendaraan(new Mobil(kode, nama, harga, kursi));
                        } else if (jenis.equalsIgnoreCase("motor")) {
                            System.out.print("Masukkan jenis transmisi (Matik/Manual): ");
                            String transmisi = input.nextLine();
                            sistem.tambahkendaraan(new Motor(kode, nama, harga, transmisi));
                        } else {
                            System.out.println("[ERROR] Jenis kendaraan tidak valid.");
                        }
                        break;

                    case 2:
                        sistem.tampilkanDaftarkendaraan();
                        break;

                    case 3:
                        System.out.print("Masukkan kode kendaraan: ");
                        String kodeSewa = input.nextLine();
                        System.out.print("Masukkan durasi sewa (hari): ");
                        int durasi = Integer.parseInt(input.nextLine());

                        sistem.sewakendaraan(kodeSewa, durasi);
                        break;

                    case 4:
                        System.out.print("Masukkan kode kendaraan: ");
                        String kodeKembali = input.nextLine();
                        sistem.kembalikankendaraan(kodeKembali);
                        break;

                    case 5:
                        System.out.println("Keluar dari sistem.");
                        break;

                    default:
                        System.out.println("Pilihan salah.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Input harus berupa angka.");
            } catch (KendaraanTidakTersediaException e) {
                System.out.println("\n[EXCEPTION] " + e.getMessage());
            } catch (Exception e) {
                System.out.println("[ERROR] Terjadi kendala: " + e.getMessage());
            }
        } while (pilihanMenu != 5);

        input.close();
    }
}