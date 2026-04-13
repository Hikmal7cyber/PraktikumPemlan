public class Vip extends Member {

    public Vip(String id, String nama) {
        super(id, nama);
    }

    public String getTipe() {
        return "VIP";
    }

    public int hitungPembayaran(int hargaDasar, int sesi) {
        int subtotal = hargaDasar;

        if (sesi > 5) {
            int diskonSesi = subtotal / 10;
            subtotal = subtotal - diskonSesi;
        }

        int diskonVIP = hargaDasar * 15 / 100;
        subtotal = subtotal - diskonVIP;

        int pajak = subtotal * 5 / 100;
        int total = subtotal + pajak;

        if (total < 0) {
            total = 0;
        }

        return total;
    }
}