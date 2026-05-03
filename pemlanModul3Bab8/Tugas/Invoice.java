package Tugas;

public class Invoice implements Payable {

    private String namaProduk;
    private int jumlahBarang;
    private int hargaSatuan;

    public Invoice(String namaProduk, int jumlahBarang, int hargaSatuan) {
        this.namaProduk = namaProduk;
        this.jumlahBarang = jumlahBarang;
        this.hargaSatuan = hargaSatuan;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    @Override
    public int getPayableAmount() {
        return jumlahBarang * hargaSatuan;
    }

    @Override
    public String toString() {
        return "  - " + namaProduk + " (" + jumlahBarang + " x Rp" + hargaSatuan + ") = Rp" + getPayableAmount();
    }
}
