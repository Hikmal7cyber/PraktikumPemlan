public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut != 0);
    }

    //menyederhanakan bilangan rasional
    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }

        int pblPos = (pembilang < 0) ? -pembilang : pembilang;
        int pybPos = (penyebut < 0) ? -penyebut : penyebut;

        A = (pblPos < pybPos) ? pybPos : pblPos;
        B = (pblPos < pybPos) ? pblPos : pybPos;

        for (; B != 0; ) {
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /= A;
        penyebut /= A;
    }

    public double Cast() {
        return (penyebut == 0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    //oprator >
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    //operator <, <=, >=
    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean lessThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean moreThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    //operator Unary- ---> A = -A
    public void negasi() {
        pembilang = -pembilang;
    }

    //operator unary += 
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
        Sederhana();
    }

    // Method baru untuk operasi pengurangan (-)
    public void minus(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
        Sederhana();
    }

    // Method baru untuk operasi perkalian (*)
    public void multiply(Rasional A) {
        pembilang *= A.pembilang;
        penyebut *= A.penyebut;
        Sederhana();
    }

    // Method baru untuk operasi pembagian (/)
    public void divide(Rasional A) {
        pembilang *= A.penyebut;
        penyebut *= A.pembilang;
        Sederhana();
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}