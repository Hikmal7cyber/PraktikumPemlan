import java.util.ArrayList;
import java.util.Scanner;

public class GymSystem {
    private ArrayList<Member> members;

    public GymSystem() {
        members = new ArrayList<Member>();
    }

    public Member findMember(String id) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getId().equals(id)) {
                return members.get(i);
            }
        }
        return null;
    }

    public void addMember(String tipe, String id, String nama) {
        if (findMember(id) != null) {
            System.out.println("Member sudah terdaftar");
            return;
        }

        if (tipe.equals("REGULER")) {
            members.add(new Reguler(id, nama));
            System.out.println("Reguler " + id + " berhasil ditambahkan");
        } else if (tipe.equals("VIP")) {
            members.add(new Vip(id, nama));
            System.out.println("VIP " + id + " berhasil ditambahkan");
        }
    }

    public void topUp(String id, int jumlah) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }
        m.topUp(jumlah);
        System.out.println("Saldo " + id + ": " + m.getSaldo());
    }

    public void buy(String id, String layanan, int sesi) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }

        if (!layanan.equals("cardio") && !layanan.equals("yoga") && !layanan.equals("personal_training")) {
            System.out.println("Layanan tidak valid");
            return;
        }

        int hasil = m.buy(layanan, sesi);

        if (hasil == -1) {
            System.out.println("Saldo " + id + " tidak cukup");
        } else {
            System.out.println("Total bayar " + id + ": " + hasil);
            System.out.println("Saldo " + id + ": " + m.getSaldo());
        }
    }

    public void check(String id) {
        Member m = findMember(id);
        if (m == null) {
            System.out.println("Member tidak ditemukan");
            return;
        }
        System.out.println(m.getInfo());
    }

    public int count() {
        return members.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GymSystem gym = new GymSystem();

        int bnykPerintah = Integer.parseInt(in.nextLine().trim());

        for (int i = 0; i < bnykPerintah; i++) {
            String baris = in.nextLine().trim();
            String[] token = baris.split(" ");
            String perintah = token[0];

            if (perintah.equals("ADD")) {
                String tipe = token[1];
                String id = token[2];
                String nama = token[3];
                gym.addMember(tipe, id, nama);

            } else if (perintah.equals("TOPUP")) {
                String id = token[1];
                int jumlah = Integer.parseInt(token[2]);
                gym.topUp(id, jumlah);

            } else if (perintah.equals("BUY")) {
                String id = token[1];
                String layanan = token[2];
                int sesi = Integer.parseInt(token[3]);
                gym.buy(id, layanan, sesi);

            } else if (perintah.equals("CHECK")) {
                String id = token[1];
                gym.check(id);

            } else if (perintah.equals("COUNT")) {
                System.out.println("Total member: " + gym.count());
            }
        }

        in.close();
    }
}