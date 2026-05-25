import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Atlet {
    int tinggi;
    int berat;
    String asalTim;

    public Atlet(int tinggi, int berat, String asalTim) {
        this.tinggi = tinggi;
        this.berat = berat;
        this.asalTim = asalTim;
    }

    @Override
    public String toString() {
        return "Atlit [" + asalTim + "] -> Tinggi: " + tinggi + " cm, Berat: " + berat + " kg";
    }
}

class UrutTinggiAsc implements Comparator<Atlet> {
    public int compare(Atlet p1, Atlet p2) {
        return p1.tinggi - p2.tinggi;
    }
}

class UrutBeratDesc implements Comparator<Atlet> {
    public int compare(Atlet p1, Atlet p2) {
        return p2.berat - p1.berat;
    }
}

class UrutTinggi implements Comparator<Atlet> {
    public int compare(Atlet p1, Atlet p2) {
        return p1.tinggi - p2.tinggi;
    }
}

class UrutBerat implements Comparator<Atlet> {
    public int compare(Atlet p1, Atlet p2) {
        return p1.berat - p2.berat;
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        ArrayList<Atlet> timA = new ArrayList<>();
        timA.add(new Atlet(168, 50, "Tim A"));
        timA.add(new Atlet(170, 60, "Tim A"));
        timA.add(new Atlet(165, 56, "Tim A"));
        timA.add(new Atlet(168, 55, "Tim A"));
        timA.add(new Atlet(175, 60, "Tim A"));
        timA.add(new Atlet(170, 70, "Tim A"));
        timA.add(new Atlet(169, 66, "Tim A"));
        timA.add(new Atlet(165, 56, "Tim A"));
        timA.add(new Atlet(168, 72, "Tim A"));
        timA.add(new Atlet(169, 56, "Tim A"));

        ArrayList<Atlet> timB = new ArrayList<>();
        timB.add(new Atlet(170, 66, "Tim B"));
        timB.add(new Atlet(167, 60, "Tim B"));
        timB.add(new Atlet(165, 59, "Tim B"));
        timB.add(new Atlet(166, 58, "Tim B"));
        timB.add(new Atlet(168, 58, "Tim B"));
        timB.add(new Atlet(172, 71, "Tim B"));
        timB.add(new Atlet(172, 68, "Tim B"));
        timB.add(new Atlet(171, 68, "Tim B"));
        timB.add(new Atlet(171, 65, "Tim B"));
        timB.add(new Atlet(166, 60, "Tim B"));

        ArrayList<Atlet> gabunganSemua = new ArrayList<>();
        gabunganSemua.addAll(timA);
        gabunganSemua.addAll(timB);

        System.out.println("=== SOAL 1A: URUT TINGGI BADAN (ASCENDING) ===");
        Collections.sort(gabunganSemua, new UrutTinggiAsc());
        for (Atlet p : gabunganSemua) {
            System.out.println(p);
        }

        System.out.println("\n=== SOAL 1B: URUT BERAT BADAN (DESCENDING) ===");
        Collections.sort(gabunganSemua, new UrutBeratDesc());
        for (Atlet p : gabunganSemua) {
            System.out.println(p);
        }

        System.out.println("\n=== SOAL 1C: MAX & MIN DARI MASING-MASING TIM ===");
        Atlet tertinggiA = Collections.max(timA, new UrutTinggi());
        Atlet terendahA = Collections.min(timA, new UrutTinggi());
        Atlet terberatA = Collections.max(timA, new UrutBerat());
        Atlet teringanA = Collections.min(timA, new UrutBerat());

        Atlet tertinggiB = Collections.max(timB, new UrutTinggi());
        Atlet terendahB = Collections.min(timB, new UrutTinggi());
        Atlet terberatB = Collections.max(timB, new UrutBerat());
        Atlet teringanB = Collections.min(timB, new UrutBerat());

        System.out.println("[Tim A] Tinggi Max: " + tertinggiA.tinggi + " cm | Min: " + terendahA.tinggi + " cm");
        System.out.println("[Tim A] Berat Max: " + terberatA.berat + " kg | Min: " + teringanA.berat + " kg");
        System.out.println("[Tim B] Tinggi Max: " + tertinggiB.tinggi + " cm | Min: " + terendahB.tinggi + " cm");
        System.out.println("[Tim B] Berat Max: " + terberatB.berat + " kg | Min: " + teringanB.berat + " kg");

        System.out.println("\n=== SOAL 1D: COPY TIM B KE TIM C ===");
        List<Atlet> timC = Arrays.asList(new Atlet[timB.size()]);
        Collections.copy(timC, timB);
        
        System.out.println("Isi anggota dari Tim C (Hasil Copy):");
        for (Atlet p : timC) {
            System.out.println(p);
        }
    }
}