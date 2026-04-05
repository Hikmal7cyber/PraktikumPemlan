public class Manager extends Pekerja {
    private String departemen;

    public Manager(){
        super();
        this.departemen = "departemen belum ditentukan";
    }

    public Manager(String dept, double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = dept;
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    public String getDepartemen(){
        return departemen;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + (getGaji() * 0.1);
    }

    @Override
    public String toString(){
        return super.toString() +
        "\nDepartemen : " + departemen;
    }

}