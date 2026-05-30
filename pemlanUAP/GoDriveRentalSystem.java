import java.util.ArrayList;
import java.util.Scanner;

public class GoDriveRentalSystem {
    private ArrayList<Kendaraan> daftarkendaraan;

    public GoDriveRentalSystem() {
        this.daftarkendaraan = new ArrayList<>();
    }

    public void tambahkendaraan(Kendaraan k) {
        daftarkendaraan.add(k);
        System.out.println("[INFO] Kendaraan berhasil ditambahkan.");
    }

    public void tampilkanDaftarkendaraan() {
        if (daftarkendaraan.isEmpty()) {
            System.out.println("Belum ada armada kendaraan.");
            return;
        }
        System.out.println("\n=== DAFTAR ARMADA GODRIVE ===");
        for (int i = 0; i < daftarkendaraan.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarkendaraan.get(i).tampilinfo();
        }
    }

    public void sewakendaraan(String kode, int lamaSewa) throws KendaraanTidakTersediaException {
        Kendaraan target = null;
        for (Kendaraan k : daftarkendaraan) {
            if (k.getkodekendaraan().equalsIgnoreCase(kode)) {
                target = k;
                break;
            }
        }

        if (target == null) {
            throw new KendaraanTidakTersediaException("Kendaraan dengan kode " + kode + " tidak ditemukan!");
        }

        if (!target.isTersedia()) {
            throw new KendaraanTidakTersediaException("Kendaraan sedang disewa atau tidak tersedia!");
        }

        Scanner inputSewa = new Scanner(System.in);
        System.out.print("Apakah penyewa merupakan member VIP? (y/n): ");
        String jawaban = inputSewa.nextLine();
        boolean apakahVIP = jawaban.equalsIgnoreCase("y");

        double biayaDasar = target.hitungBiayaDasar(lamaSewa);
        double diskonDurasi = 0;
        double diskonVIP = 0;

        if (lamaSewa > 7) {
            diskonDurasi = 0.05 * biayaDasar;
        }

        double subtotal = biayaDasar - diskonDurasi;

        if (apakahVIP) {
            diskonVIP = 0.10 * subtotal;
        }

        double totalAkhir = subtotal - diskonVIP;
        target.setTersedia(false);

        System.out.println("\n=== TRANSAKSI SEWA GODRIVE ===");
        System.out.println("Kendaraan Berhasil Disewa!");
        System.out.println("Unit                : " + target.getNamakendaraan());
        System.out.println("Lama Sewa           : " + lamaSewa + " hari");
        System.out.println("Biaya Dasar + Fitur : Rp" + (int)biayaDasar);
        
        if (diskonDurasi > 0) {
            System.out.println("Diskon Sewa > 7 Hari: Rp" + (int)diskonDurasi);
        }
        if (apakahVIP) {
            System.out.println("Diskon Member VIP   : Rp" + (int)diskonVIP);
        }
        System.out.println("TOTAL BIAYA AKHIR   : Rp" + (int)totalAkhir);
    }

    public void kembalikankendaraan(String kode) {
        Kendaraan target = null;
        for (Kendaraan k : daftarkendaraan) {
            if (k.getkodekendaraan().equalsIgnoreCase(kode)) {
                target = k;
                break;
            }
        }

        if (target == null) {
            System.out.println("[ERROR] Kendaraan tidak ditemukan.");
            return;
        }

        if (target.isTersedia()) {
            System.out.println("[INFO] Kendaraan sudah ada di garasi.");
            return;
        }

        target.setTersedia(true);
        System.out.println("[INFO] Kendaraan " + target.getNamakendaraan() + " berhasil dikembalikan.");
    }
}