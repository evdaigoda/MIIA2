package Ann.com;

public class Scoring {
    public static void main(String[] args) {
        Student ann = new Student("Ann", 95, 88);
        Student jerry = new Student("Jerry", 60, 75);
        GraduateStudent tiffany = new GraduateStudent("Tiffany", 55, 69, 87);
        ann.print();
        jerry.print();
        tiffany.print();
    }
}
