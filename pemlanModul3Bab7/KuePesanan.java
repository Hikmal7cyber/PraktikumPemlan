public class KuePesanan extends Kue {
    private double berat;
    public KuePesanan(){
        super();
        this.berat = 0.0;
    }
    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }
    public void setBerat(double berat){
        this.berat = berat;
    }
    public double getBerat(){
        return berat;
    }
    @Override
    public double hitungHarga(){
        return getHarga() * berat;
    }
    @Override
    public String toString(){
        return "Nama Kue: "+getNama() + ", Harga: Rp "+hitungHarga() + ", Harga satuan: Rp "+getHarga()+", Berat: "+berat+ " kg";
    }
}
