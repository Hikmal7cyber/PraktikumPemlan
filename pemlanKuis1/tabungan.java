import java.util.*;

public class tabungan {
    static class Student {
        String nama;
        String tipe;
        int saldo;

        Student(String nama, String tipe) {
            this.nama = nama;
            this.tipe = tipe;
            this.saldo = 0;
        }
    }

    static class Reguler extends Student {
        Reguler(String nama) {
            super(nama, "REGULER");
        }
    }

    static class Beasiswa extends Student {
        Beasiswa(String nama) {
            super(nama, "BEASISWA");
        }
    }

    static List<Student> daftar = new ArrayList<>();

    static Student cariSiswa(String nama) {
        for (Student s : daftar) {
            if (s.nama.equals(nama)) {
                return s;
            }
        }
        return null;
    }

    static void create(String tipe, String nama) {
        if (cariSiswa(nama) != null) {
            System.out.println("Akun sudah terdaftar");
            return;
        }

        Student siswa;
        if (tipe.equals("REGULER")) {
            siswa = new Reguler(nama);
        } else {
            siswa = new Beasiswa(nama);
        }
        daftar.add(siswa);
        System.out.println(tipe + " " + nama + " berhasil dibuat");
    }

    static void simpan(String nama, int jumlah) {
        Student siswa = cariSiswa(nama);
        if (siswa == null) {
            System.out.println("Akun tidak ditemukan");
            return;
        }
        siswa.saldo += jumlah;
        System.out.println("Saldo " + siswa.nama + ": " + siswa.saldo);
    }

    static void take(String nama, int jumlah) {
        Student siswa = cariSiswa(nama);
        if (siswa == null) {
            System.out.println("Akun tidak ditemukan");
            return;
        }

        int bayar = jumlah;
        if (siswa.tipe.equals("BEASISWA")) {
            bayar = jumlah - 1000;
            if (bayar < 0) bayar = 0;
        }

        if (siswa.saldo < bayar) {
            System.out.println("Saldo " + siswa.nama + " tidak cukup");
            return;
        }

        siswa.saldo -= bayar;
        System.out.println("Saldo " + siswa.nama + ": " + siswa.saldo);
    }

    static void check(String nama) {
        Student siswa = cariSiswa(nama);
        if (siswa == null) {
            System.out.println("Akun tidak ditemukan");
            return;
        }
        System.out.println(siswa.nama + " | " + siswa.tipe + " | saldo: " + siswa.saldo);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().trim().split(" ");
            String perintah = input[0];

            if (perintah.equals("CREATE")) {
                create(input[1], input[2]);
            } else if (perintah.equals("SAVE")) {
                simpan(input[1], Integer.parseInt(input[2]));
            } else if (perintah.equals("TAKE")) {
                take(input[1], Integer.parseInt(input[2]));
            } else if (perintah.equals("CHECK")) {
                check(input[1]);
            }
        }

        in.close();
    }
}