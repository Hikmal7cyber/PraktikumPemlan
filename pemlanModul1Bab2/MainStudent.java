import java.util.Scanner;   
public class MainStudent {
    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);

        // System.out.print("Masukkan jumlah siswa: ");
        // int n = in.nextInt();
        // in.nextLine(); 
        // Student[] students = new Student[n];

        // for (int i = 0; i < n; i++) {
        //     System.out.print("Masukkan nama siswa ke-"+(i+1)+": ");
        //     String name = in.nextLine();
        //     System.out.print("Masukkan alamat siswa ke-"+(i+1)+": ");
        //     String address = in.nextLine();
        //     System.out.print("Masukkan umur siswa ke-"+(i+1)+": ");
        //     int age = in.nextInt();
        //     System.out.print("Masukkan nilai matematika siswa ke-"+(i+1)+": ");
        //     int mathGrade = in.nextInt();
        //     System.out.print("Masukkan nilai bahasa inggris siswa ke-"+(i+1)+": ");
        //     int englishGrade = in.nextInt();
        //     System.out.print("Masukkan nilai ipa siswa ke-"+(i+1)+": ");
        //     int scienceGrade = in.nextInt();
        //     in.nextLine();

        //     students[i] = new Student(name, address, age);
        //     students[i].setMath(mathGrade);
        //     students[i].setEnglish(englishGrade);
        //     students[i].setScience(scienceGrade);

        //     System.out.println("======================");
        //     students[i].statusAkhir();
        //     students[i].displayMessage();
        //     System.out.println("======================");
        //}

        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.statusAkhir();
        anna.displayMessage();

        //menggunakan constructor lain
        System.out.println("======================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.statusAkhir();
        chris.displayMessage();

        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("======================");
        anna = new Student("anna", "Batu", 18);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.statusAkhir();
        anna.displayMessage();

        //siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("======================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.statusAkhir();
        chris.displayMessage();

        System.out.println("======================");
        Student hikmal = new Student(90, 10, 20);
        hikmal.setName("Hikmal");
        hikmal.setAddress("Malang");
        hikmal.setAge(20);
        hikmal.statusAkhir();
        hikmal.displayMessage();

        System.out.println("======================");
        Student.tampilkanJumlahSiswa();
    }
}