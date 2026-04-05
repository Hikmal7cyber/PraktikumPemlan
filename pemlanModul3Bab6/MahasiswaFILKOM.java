public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM() {
        super();
        this.nim = "";
        this.ipk = 0.0;
    }
    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jk, boolean menikah) {
        super(nama, nik, jk, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getIpk() {
        return this.ipk;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return this.nim;
    }

    public String getStatus() {
        String angkatan = this.nim.substring(0, 2); 
        char prodi = this.nim.charAt(6); 
        String prodiStr = "";
        switch(prodi) {
            case '2': 
            prodiStr = "Teknik Informatika"; 
            break; 
            case '3': 
            prodiStr = "Teknik Komputer"; 
            break; 
            case '4': 
            prodiStr = "Sistem Informasi"; 
            break; 
            case '6': 
            prodiStr = "Pendidikan Teknologi Informasi"; 
            break; 
            case '7': 
            prodiStr = "Teknologi Informasi"; 
            break; 
            default: 
            prodiStr = "Prodi tidak diketahui"; 
            break;
        }
        return prodiStr + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (this.ipk >= 3.5) {
            return 75.0;
        }
        if (this.ipk >= 3.0) {
            return 50.0;
        }
        return 0.0;
    }

    @Override
    public double getPendapatan() { 
        return super.getPendapatan() + getBeasiswa(); 
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "nim            : " + this.nim + "\n" +
               "ipk            : " + this.ipk + "\n" +
               "status         : " + this.getStatus();
    }
}