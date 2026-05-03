package Tugas;

public class Employee implements Payable {

    private int nomorKaryawan;
    private String namaKaryawan;
    private int gajiPokok;
    private Invoice[] daftarBelanja;

    public Employee(int nomorKaryawan, String namaKaryawan, int gajiPokok, Invoice[] daftarBelanja) {
        this.nomorKaryawan = nomorKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.gajiPokok = gajiPokok;
        this.daftarBelanja = daftarBelanja;
    }

    public int getNomorKaryawan() {
        return nomorKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public Invoice[] getDaftarBelanja() {
        return daftarBelanja;
    }

    public int totalTagihanBelanja() {
        int total = 0;
        for (Invoice tagihan : daftarBelanja) {
            total += tagihan.getPayableAmount();
        }
        return total;
    }

    // Gaji bersih 
    @Override
    public int getPayableAmount() {
        return gajiPokok - totalTagihanBelanja();
    }

    @Override
    public String toString() {
        return "Karyawan #" + nomorKaryawan + " - " + namaKaryawan;
    }
}
