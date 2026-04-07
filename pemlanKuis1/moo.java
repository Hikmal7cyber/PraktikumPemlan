import java.util.*;

public class moo {
    static String inputNama(Scanner sc) {
        while (true) {
            String nama = sc.nextLine().trim();
            if (!nama.isEmpty() && cekNama(nama)) return nama;
            System.out.println("Mooo! Nama sapi harus pakai huruf, bukan angka atau simbol!");
        }
    }

    static boolean cekNama(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c) || c > 127) return false;
        }
        return true;
    }

    static int inputBerat(Scanner sc) {
        while (true) {
            try {
                int berat = Integer.parseInt(sc.nextLine().trim());
                if (berat >= 1) return berat;
                System.out.println("Sapi astral? Masukkan berat yang valid dulu, bestie!");
            } catch (NumberFormatException e) {
                System.out.println("Sapi astral? Masukkan berat yang valid dulu, bestie!");
            }
        }
    }

    static String inputLayanan(Scanner sc) {
        while (true) {
            String layanan = sc.nextLine().trim().toLowerCase();
            if (layanan.equals("spa") || layanan.equals("potong_kuku") || layanan.equals("grooming")) {
                return layanan;
            }
            System.out.println("Pilih spa, potong_kuku, atau grooming! Sapi kamu mau dirawat apa, sih?");
        }
    }

    static String inputKelas(Scanner sc) {
        while (true) {
            String kelas = sc.nextLine().trim().toLowerCase();
            if (kelas.equals("reguler") || kelas.equals("vip")) return kelas;
            System.out.println("Pilih reguler atau vip! Sapi kamu mau treatment sultan atau biasa aja?");
        }
    }

    static int getHargaLayanan(String layanan) {
        if (layanan.equals("spa")) {
            return 8000;
        } else if (layanan.equals("potong_kuku")) {
            return 6000;
        } else if (layanan.equals("grooming")) {
            return 10000;
        }
        return 0;
    }

    static double hitungTotal(int berat, String layanan, String kelas) {
        double biayaDasar = berat * getHargaLayanan(layanan);
        double diskon = (berat > 30) ? biayaDasar * 0.10 : 0;
        double tambahanVip = kelas.equals("vip") ? biayaDasar * 0.20 : 0;
        double subtotal = biayaDasar - diskon + tambahanVip;
        double pajak = subtotal * 0.08;
        return subtotal + pajak;
    }

    static void cetakStruk(String nama, int berat, String layanan, String kelas) {
        double biayaDasar = berat * getHargaLayanan(layanan);
        double diskon = (berat > 30) ? biayaDasar * 0.10 : 0;
        double tambahanVip = kelas.equals("vip") ? biayaDasar * 0.20 : 0;
        double subtotal = biayaDasar - diskon + tambahanVip;
        double pajak = subtotal * 0.08;

        boolean gratis = nama.equals("Moo") || nama.equals("Mooo") || nama.equals("Moooo");
        double total = gratis ? 0 : subtotal + pajak;

        System.out.println("============= NOTA KLINIK SAPI =============");
        System.out.println("Nama Sapi: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jenis Layanan: " + layanan);
        System.out.println("Kelas: " + kelas);
        System.out.println("Biaya Dasar: Rp " + biayaDasar);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Biaya Tambahan VIP: Rp " + tambahanVip);
        System.out.println("Subtotal: Rp " + subtotal);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Total Biaya: Rp " + total);
        System.out.println("============================================");

        if (gratis) {
            System.out.println("Terima kasih, " + nama + " ! Sapi spesial memang beda perlakuan~");
        } else {
            System.out.println("Terima kasih, " + nama + " ! Semoga sapinya makin glow up.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama = inputNama(in);
        int berat = inputBerat(in);
        String layanan = inputLayanan(in);
        String kelas = inputKelas(in);

        cetakStruk(nama, berat, layanan, kelas);

        in.close();
    }
}