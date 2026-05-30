public class Motor extends Kendaraan {
    private String jenisTransmisi;

    public Motor(String kode, String nama, double harga, String jenisTransmisi) {
        super(kode, nama, harga);
        this.jenisTransmisi = jenisTransmisi;
    }

    public String getJenisTransmisi() {
        return jenisTransmisi;
    }

    public void setJenisTransmisi(String jenis) {
        this.jenisTransmisi = jenis;
    }

    @Override
    public void tampilinfo() {
        System.out.print("[MOTOR] ");
        super.tampilinfo();
        System.out.println(" | Transmisi: " + jenisTransmisi);
    }

    @Override
    public double hitungBiayaDasar(int lamaSewa) {
        double total = lamaSewa * getHargaSewaPerHari();
        if (jenisTransmisi.equalsIgnoreCase("Matik")) {
            total += (10000 * lamaSewa);
        }
        return total;
    }
}