import java.util.*;

public class siswa {
    static class Vehicle {
        String kode;
        String tipe;
        String nama;
        int harga;
        boolean tersedia;

        Vehicle(String kode, String tipe, String nama, int harga) {
            this.kode = kode;
            this.tipe = tipe;
            this.nama = nama;
            this.harga = harga;
            this.tersedia = true;
        }
    }

    static class Car extends Vehicle {
        Car(String kode, String nama, int harga) {
            super(kode, "CAR", nama, harga);
        }
    }

    static class Bike extends Vehicle {
        Bike(String kode, String nama, int harga) {
            super(kode, "BIKE", nama, harga);
        }
    }

    static List<Vehicle> daftar = new ArrayList<>();

    static Vehicle cariKendaraan(String kode) {
        for (Vehicle v : daftar) {
            if (v.kode.equals(kode)) {
                return v;
            }
        }
        return null;
    }

    static void add(String tipe, String kode, String nama, int harga) {
        if (cariKendaraan(kode) != null) {
            System.out.println("Kendaraan sudah terdaftar");
            return;
        }

        Vehicle v;
        if (tipe.equals("CAR")) {
            v = new Car(kode, nama, harga);
        } else {
            v = new Bike(kode, nama, harga);
        }
        daftar.add(v);
        System.out.println(tipe + " " + kode + " berhasil ditambahkan");
    }

    static void rent(String kode, int hari, boolean adaPromo) {
        Vehicle v = cariKendaraan(kode);
        if (v == null) {
            System.out.println("Kendaraan tidak ditemukan");
            return;
        }
        if (!v.tersedia) {
            System.out.println("Kendaraan sedang disewa");
            return;
        }

        int total = v.harga * hari;
        if (adaPromo) {
            int potongan = v.tipe.equals("CAR") ? 20000 : 10000;
            total -= potongan;
            if (total < 0) total = 0;
        }

        v.tersedia = false;
        System.out.println("Total sewa " + kode + ": " + total);
    }

    static void returnKendaraan(String kode) {
        Vehicle v = cariKendaraan(kode);
        if (v == null) {
            System.out.println("Kendaraan tidak ditemukan");
            return;
        }
        if (v.tersedia) {
            System.out.println("Kendaraan belum disewa");
            return;
        }

        v.tersedia = true;
        System.out.println(kode + " berhasil dikembalikan");
    }

    static void detail(String kode) {
        Vehicle v = cariKendaraan(kode);
        if (v == null) {
            System.out.println("Kendaraan tidak ditemukan");
            return;
        }

        String status = v.tersedia ? "TERSEDIA" : "DISEWA";
        System.out.println(v.kode + " | " + v.tipe + " | " + v.nama + " | harga: " + v.harga + " | status: " + status);
    }

    static void count() {
        System.out.println("Total kendaraan: " + daftar.size());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().trim().split(" ");
            String perintah = input[0];

            if (perintah.equals("ADD")) {
                add(input[1], input[2], input[3], Integer.parseInt(input[4]));
            } else if (perintah.equals("RENT")) {
                boolean adaPromo = input.length > 3 && input[3].equalsIgnoreCase("PROMO");
                rent(input[1], Integer.parseInt(input[2]), adaPromo);
            } else if (perintah.equals("RETURN")) {
                returnKendaraan(input[1]);
            } else if (perintah.equals("DETAIL")) {
                detail(input[1]);
            } else if (perintah.equals("COUNT")) {
                count();
            }
        }

        in.close();
    }
}   