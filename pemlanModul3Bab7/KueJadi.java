public class KueJadi extends Kue {
    private double jumlah;
    public KueJadi(){
        this.jumlah = 0.0;
    }
    public KueJadi(double jumlah){
        this.jumlah = jumlah;
    }
    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }
    public void setJumlah(double jumlah){
        this.jumlah = jumlah;
    }
    public double getJumlah(){
        return jumlah;
    }
    @Override
    public double hitungHarga(){
        return getHarga() * jumlah * 2;
    }
    @Override
    public String toString(){
        return "Nama kue: "+getNama() + ", Harga: Rp "+hitungHarga() + ", Harga satuan: Rp " + getHarga() + ", Jumlah: " + jumlah;
    }
}
