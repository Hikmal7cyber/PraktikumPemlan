public class Mobil extends Kendaraan {
    private int jumlahkursi;

    public Mobil(String kode, String nama, double harga, int jumlahkursi) {
        super(kode, nama, harga);
        this.jumlahkursi = jumlahkursi;
    }

    public int getJumlahKursi() {
        return jumlahkursi;
    }

    public void setjumlahkursi(int jumlah) {
        this.jumlahkursi = jumlah;
    }

    @Override
    public void tampilinfo() {
        System.out.print("[MOBIL] ");
        super.tampilinfo();
        System.out.println(" | Kursi: " + jumlahkursi);
    }

    @Override
    public double hitungBiayaDasar(int lamaSewa) {
        double total = lamaSewa * getHargaSewaPerHari();
        if (jumlahkursi > 5) {
            total += 50000;
        }
        return total;
    }
}