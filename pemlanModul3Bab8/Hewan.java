public class Hewan implements MakhlukHidup,Identitas{
    private String nama;
    private int umur;
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai empat kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya keras");
    }

    @Override
    public void tampilkanNama() {
    }

    @Override
    public void tampilkanUmur() {
    }

}
