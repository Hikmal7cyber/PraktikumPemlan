    // M HIKMAL AL-GHIFARY (255150700111030) - TI A
public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double sekon;
    private double mps;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
        this.mps = rubahKecepatan(i);
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
        this.sekon = rubahSekon(waktu);
    }

    private double rubahSekon(double waktu) {
        return waktu * 3600;
    }

    private double rubahKecepatan(int kmh) {
        return kmh / 3.6;
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/h");
        System.out.println("Jarak yang dapat ditempuh: " + hitungJarak() + " km");
    }
}