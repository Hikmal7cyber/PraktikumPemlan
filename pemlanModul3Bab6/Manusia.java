public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true = laki
    private String nik;
    private boolean menikah;

    public Manusia() {
        this.nama = "";
        this.nik = "";
        this.jenisKelamin = true; 
        this.menikah = false; 
    }

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNik() {
        return this.nik;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public boolean getJenisKelamin() {
        return this.jenisKelamin;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public boolean getMenikah() {
        return this.menikah;
    }

    public double getTunjangan() {
        if (this.jenisKelamin && this.menikah) {
            return 25.0; 
        } else if (!this.jenisKelamin && this.menikah) {
            return 20.0; 
        } else {
            return 15.0; 
        } 
    }

    public double getPendapatan() { 
        return getTunjangan(); 
    }

    public String toString() {
        return "nama           : " + this.nama + "\n" +
               "nik            : " + this.nik + "\n" +
               "jenisKelamin   : " + (this.jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
               "pendapatan     : " + this.getPendapatan();
    }
}