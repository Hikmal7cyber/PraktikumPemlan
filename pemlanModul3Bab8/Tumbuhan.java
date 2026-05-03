public class Tumbuhan implements MakhlukHidup,Identitas{
    private String nama;
    private int umur;
    
    public Tumbuhan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai fotosintesis");
    }

    @Override
    public void berjalan() {
        System.out.println("Tidak bisa berjalan");
    }

    @Override
    public void bersuara() {
        System.out.println("Tidak bisa bersuara");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama saya: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);
    }

}
