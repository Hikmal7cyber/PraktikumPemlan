import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(){
        super();
        this.gaji = 0.0;
        this.tahunMasuk = LocalDate.now();
        this.jumlahAnak = 0;
    }

    public Pekerja(double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.gaji =  gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji(){
        return gaji;
    }

    public  LocalDate getTahunMasuk(){
        return tahunMasuk;
    }

    public int getJumlahAnak(){
        return jumlahAnak;
    }

    public double getBonus(){
        int lamaKerja = Period.between(tahunMasuk, LocalDate.now()).getYears();

        if (lamaKerja  < 5){
            return gaji * 0.05;
        }
        else if (lamaKerja <= 10){
            return gaji * 0.1;
        }
        else return gaji * 0.15;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

    @Override
    public String toString(){
        return super.toString() +
        "\nTahun Masuk : " + tahunMasuk.getDayOfMonth() + " " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() +
        "\nJumlah Anak : " + jumlahAnak +
        "\nGaji : " + gaji;
    }

}