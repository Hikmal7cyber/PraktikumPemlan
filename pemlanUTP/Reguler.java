public class Reguler extends Member {

    public Reguler(String id, String nama) {
        super(id, nama);
    }

    public String getTipe() {
        return "Reguler";
    }

    public int hitungPembayaran(int hargaDasar, int sesi) {
        int subtotal = hargaDasar;

        if (sesi > 5) {
            int diskonSesi = subtotal / 10;
            subtotal = subtotal - diskonSesi;
        }

        int pajak = subtotal * 5 / 100;
        int total = subtotal + pajak;

        if (total < 0) {
            total = 0;
        }

        return total;
    }
}