public abstract class Kendaraan {
    private String kodekendaraan;
    private String namakendaraan;
    private double hargaSewaPerHari;
    private boolean isTersedia;

    public Kendaraan(String kode, String nama, double hargaSewa) {
        this.kodekendaraan = kode;
        this.namakendaraan = nama;
        this.hargaSewaPerHari = hargaSewa;
        this.isTersedia = true;
    }

    public String getkodekendaraan() {
        return kodekendaraan;
    }

    public void setkodekendaraan(String kode) {
        this.kodekendaraan = kode;
    }

    public String getNamakendaraan() {
        return namakendaraan;
    }

    public void setNamakendaraan(String nama) {
        this.namakendaraan = nama;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    public void setHargaSewaPerHari(double harga) {
        this.hargaSewaPerHari = harga;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void setTersedia(boolean status) {
        this.isTersedia = status;
    }

    public void tampilinfo() {
        System.out.print("Kode: " + kodekendaraan + " | Nama: " + namakendaraan + " | Tarif: Rp" + (int)hargaSewaPerHari + "/hari | Status: " + (isTersedia ? "Tersedia" : "Tidak Tersedia"));
    }

    public abstract double hitungBiayaDasar(int lamaSewa);
}