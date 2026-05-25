import java.util.ArrayList;
import java.util.Collections;

public class Tugas2 {
    public static void main(String[] args) {
        ArrayList<Integer> tinggiTimA = new ArrayList<>();
        ArrayList<Integer> beratTimA = new ArrayList<>();
        tinggiTimA.add(168); beratTimA.add(50);
        tinggiTimA.add(170); beratTimA.add(60);
        tinggiTimA.add(165); beratTimA.add(56);
        tinggiTimA.add(168); beratTimA.add(55);
        tinggiTimA.add(175); beratTimA.add(60);
        tinggiTimA.add(170); beratTimA.add(70);
        tinggiTimA.add(169); beratTimA.add(66);
        tinggiTimA.add(165); beratTimA.add(56);
        tinggiTimA.add(168); beratTimA.add(72);
        tinggiTimA.add(169); beratTimA.add(56);

        ArrayList<Integer> tinggiTimB = new ArrayList<>();
        ArrayList<Integer> beratTimB = new ArrayList<>();
        tinggiTimB.add(170); beratTimB.add(66);
        tinggiTimB.add(167); beratTimB.add(60);
        tinggiTimB.add(165); beratTimB.add(59);
        tinggiTimB.add(166); beratTimB.add(58);
        tinggiTimB.add(168); beratTimB.add(58);
        tinggiTimB.add(172); beratTimB.add(71);
        tinggiTimB.add(172); beratTimB.add(68);
        tinggiTimB.add(171); beratTimB.add(68);
        tinggiTimB.add(171); beratTimB.add(65);
        tinggiTimB.add(166); beratTimB.add(60);

        Collections.sort(tinggiTimA);
        Collections.sort(beratTimA);
        Collections.sort(tinggiTimB);
        Collections.sort(beratTimB);

        System.out.println("=== SOAL 2B: PENCARIAN TINGGI BADAN DI TIM B ===");
        cariData(tinggiTimB, 168);
        cariData(tinggiTimB, 160);

        System.out.println("\n=== SOAL 2C: PENCARIAN BERAT BADAN DI TIM A ===");
        cariData(beratTimA, 56);
        cariData(beratTimA, 53);

        System.out.println("\n=== SOAL 2D: KESAMAAN ELEMEN ANTARA TIM A DAN TIM B ===");
        boolean statusTinggi = Collections.disjoint(tinggiTimA, tinggiTimB);
        boolean statusBerat = Collections.disjoint(beratTimA, beratTimB);

        if (!statusTinggi) {
            System.out.println("Ada pemain di Tim A yang mempunyai TINGGI BADAN yang sama dengan pemain di Tim B.");
        } else {
            System.out.println("Tidak ada pemain di Tim A yang mempunyai TINGGI BADAN yang sama dengan pemain di Tim B.");
        }

        if (!statusBerat) {
            System.out.println("Ada pemain di Tim A yang mempunyai BERAT BADAN yang sama dengan pemain di Tim B.");
        } else {
            System.out.println("Tidak ada pemain di Tim A yang mempunyai BERAT BADAN yang sama dengan pemain di Tim B.");
        }
    }

    private static void cariData(ArrayList<Integer> list, int key) {
        int index = Collections.binarySearch(list, key);
        System.out.print("Mencari nilai " + key + " -> ");
        if (index >= 0) {
            int frekuensi = Collections.frequency(list, key);
            System.out.println("Ada pada index: " + index + ". Total: " + frekuensi);
        } else {
            System.out.println("Tidak ada. Total: 0");
        }
    }
}