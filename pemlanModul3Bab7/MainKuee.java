public class MainKuee {
    public static void main(String[] args){
        Kue[] kueArray = new Kue[20];
        kueArray[0] = new KuePesanan("Kue Coklat", 50000, 1.5);
        kueArray[1] = new KuePesanan("Kue Keju", 60000, 2.0);
        kueArray[2] = new KueJadi("Kue Ulang Tahun", 150000, 3);
        kueArray[3] = new KueJadi("Putri Salju", 80000, 5);
        kueArray[4] = new KuePesanan("Kue Strawberry", 55000, 1.0);
        kueArray[5] = new KuePesanan("Kue Durian", 70000, 2.5);
        kueArray[6] = new KueJadi("Kue Brownies", 120000, 4);
        kueArray[7] = new KueJadi("Kue Lapis",  90000, 6);
        kueArray[8] = new KuePesanan("Kue Red Velvet",  65000, 1.2);
        kueArray[9] = new KuePesanan("Kue Pandan", 45000, 1.8);
        kueArray[10] = new KueJadi("Kue Keju", 100000, 2);
        kueArray[11] = new KueJadi("Kue Coklat", 110000, 3);
        kueArray[12] = new KuePesanan("Kue Tiramisu", 75000, 1.3);
        kueArray[13] = new KuePesanan("Kue Karamel", 60000, 1.7);
        kueArray[14] = new KueJadi("Kue Apel", 85000, 4);
        kueArray[15] = new KueJadi("Kue Mangga", 90000, 5);
        kueArray[16] = new KuePesanan("Kue Lemon", 50000, 1.4);
        kueArray[17] = new KuePesanan("Kue Blueberry", 55000, 1.6);
        kueArray[18] = new KueJadi("Kue Coklat Keju", 130000, 3);
        kueArray[19] = new KueJadi("Kue Red Velvet", 140000, 4);

        double totalHargaPesanan = 0.0;
        double totalHargaJadi = 0.0;
        double totalBeratPesanan = 0.0;
        double totalKueJadi = 0.0;
        double hargaTermahal = 0.0;
        String namaKueTermahal = null;
        double beratKueTermahal = 0.0;

        System.out.println("===== DAFTAR KUE : =====");
        System.out.println("KUE PESANAN:");
        for (int i = 0; i < kueArray.length; i++) {
            if (kueArray[i] instanceof KuePesanan) {
                KuePesanan kue = (KuePesanan) kueArray[i];
                System.out.println(kue.toString());
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += kue.getBerat();
                if (kue.hitungHarga() > hargaTermahal) {
                    hargaTermahal = kue.hitungHarga();
                    namaKueTermahal = kue.getNama();
                    beratKueTermahal = kue.getBerat();
                }
            }
        }
        System.out.println();

        System.out.println("KUE JADI:");
        for (int i = 0; i < kueArray.length; i++) {
            if (kueArray[i] instanceof KueJadi) {
                KueJadi kue = (KueJadi) kueArray[i];
                System.out.println(kue.toString());
                totalHargaJadi += kue.hitungHarga();
                totalKueJadi+= kue.getJumlah();
                if (kue.hitungHarga() > hargaTermahal) {
                    hargaTermahal = kue.hitungHarga();
                    namaKueTermahal = kue.getNama();
                    beratKueTermahal = kue.getJumlah();
                }
            }
        }
        System.out.println();

        System.out.println("===== Informasi Semua Kue =====");
        
        // b
        System.out.println("Total Harga Semua Kue: " + (totalHargaPesanan + totalHargaJadi));
        // c
        System.out.println("Total Harga Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Pesanan: " + totalBeratPesanan);
        // d
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Kue Jadi: " + totalKueJadi);
        // e
        System.out.println("Kue dengan harga termahal: Nama Kue: " + namaKueTermahal + ", Harga: " + hargaTermahal + ", Berat: " + beratKueTermahal);
    }
}
