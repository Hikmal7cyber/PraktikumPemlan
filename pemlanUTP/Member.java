public abstract class Member {
    private String id;
    private String nama;
    private int saldo;

    public Member(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.saldo = 0;
    }

    public void topUp(int jumlah) {
        saldo += jumlah;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getInfo() {
        return id + " | " + nama + " | " + getTipe() + " | saldo: " + saldo;
    }

    public int buy(String layanan, int sesi) {
        int harga = 0;

        if (layanan.equals("cardio")) {
            harga = 20000;
        } else if (layanan.equals("yoga")) {
            harga = 25000;
        } else if (layanan.equals("personal_training")) {
            harga = 40000;
        } else {
            return -2;
        }

        int hargaDasar = harga * sesi;
        int total = hitungPembayaran(hargaDasar, sesi);

        if (saldo < total) {
            return -1;
        }

        saldo -= total;
        return total;
    }

    public abstract String getTipe();
    public abstract int hitungPembayaran(int hargaDasar, int sesi);
}