public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Enkapsulasi");
        // s1.getName();
        // s1.setMark("90");
        s1.setMark(90);
        System.out.println("s1Name is: " + s1.getName());
        System.out.println("s1Mark is: " + s1.getMark());
        // System.out.println("name and mark "+name +" "+mark);
        System.out.println("name and mark "+s1.getName() +" "+s1.getMark());
    }
}
