import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        // 1. TEST CASE MANUSIA
        Manusia a = new Manusia();
        a.setNama("Manusia A");
        a.setNik("111");
        a.setJenisKelamin(true);
        a.setMenikah(true);
        System.out.println(a.toString()); 
        System.out.println();

        Manusia b = new Manusia();
        b.setNama("Manusia B");
        b.setNik("112");
        b.setJenisKelamin(false);
        b.setMenikah(true);
        System.out.println(b.toString());
        System.out.println();

        Manusia c = new Manusia();
        c.setNama("Manusia C");
        c.setNik("113");
        c.setMenikah(false);
        System.out.println(c.toString());
        System.out.println();

        // 2. TEST CASE MAHASISWA FILKOM
        MahasiswaFILKOM hikmal = new MahasiswaFILKOM();
        hikmal.setNama("M Hikmal AG");
        hikmal.setNik("1234");
        hikmal.setJenisKelamin(true);
        hikmal.setMenikah(false);
        hikmal.setNim("255150700111030"); 
        hikmal.setIpk(3.89);
        System.out.println(hikmal.toString());
        System.out.println();

        // 3. TEST CASE PEKERJA
        // a. 2 tahun, 2 anak
        Pekerja p1 = new Pekerja();
        p1.setNama("Pekerja 1");
        p1.setNik("331");
        p1.setJenisKelamin(true);
        p1.setMenikah(true);
        p1.setGaji(1000);
        p1.setTahunMasuk(LocalDate.of(2024, 1, 1)); 
        p1.setJumlahAnak(2);
        System.out.println(p1.toString());
        System.out.println();

        // b. 9 tahun
        Pekerja p2 = new Pekerja();
        p2.setNama("Pekerja 2");
        p2.setNik("332");
        p2.setJenisKelamin(true);
        p2.setMenikah(true);
        p2.setGaji(1000);
        p2.setTahunMasuk(LocalDate.of(2017, 1, 1));
        p2.setJumlahAnak(0);
        System.out.println(p2.toString());
        System.out.println();

        // c. 20 tahun, 10 anak
        Pekerja p3 = new Pekerja();
        p3.setNama("Pekerja 3");
        p3.setNik("333");
        p3.setJenisKelamin(true);
        p3.setMenikah(true);
        p3.setGaji(1000);
        p3.setTahunMasuk(LocalDate.of(2006, 1, 1));
        p3.setJumlahAnak(10);
        System.out.println(p3.toString());
        System.out.println();

        // 4. TEST CASE MANAJER
        Manager mgr = new Manager();
        mgr.setNama("Pak Anton");
        mgr.setNik("441");
        mgr.setJenisKelamin(true);
        mgr.setMenikah(true);
        mgr.setGaji(7500);
        mgr.setTahunMasuk(LocalDate.of(2011, 1, 1));
        mgr.setJumlahAnak(0);
        mgr.setDepartemen("IT");
        System.out.println(mgr.toString());
    }
}