package Tugas;

public class Koperasi{
    public static void main(String[] args) {

        Invoice[] belanjaAgus = {
            new Invoice("Beras 5kg", 2, 65000),
            new Invoice("Minyak Goreng", 3, 20000),
            new Invoice("Sabun Mandi", 5, 8000)
        };

        Invoice[] belanjaSari = {
            new Invoice("Gula Pasir 1kg", 4, 14000),
            new Invoice("Teh Celup", 2, 12000)
        };

        Employee karyawan1 = new Employee(1001, "Agus Santoso", 4500000, belanjaAgus);
        Employee karyawan2 = new Employee(1002, "Sari Dewi", 3800000, belanjaSari);

        Payable[] semuaKaryawan = { karyawan1, karyawan2 };

        System.out.println("====================================================");
        System.out.println("     LAPORAN GAJI BULANAN - KOPERASI NV. MENEER     ");
        System.out.println("====================================================");

        for (Payable p : semuaKaryawan) {

            Employee pegawai = (Employee) p;

            System.out.println("\n" + pegawai);
            System.out.println("  Gaji Pokok     : Rp" + pegawai.getGajiPokok());
            System.out.println("  Detail Belanja di Koperasi:");

            for (Invoice inv : pegawai.getDaftarBelanja()) {
                Payable itemBelanja = inv; 
                System.out.println(inv + " --> Tagihan: Rp" + itemBelanja.getPayableAmount());
            }

            System.out.println("  Total Tagihan  : Rp" + pegawai.totalTagihanBelanja());
            System.out.println("  Gaji Diterima  : Rp" + pegawai.getPayableAmount());
            System.out.println("----------------------------------------------------");
        }
    }
}
