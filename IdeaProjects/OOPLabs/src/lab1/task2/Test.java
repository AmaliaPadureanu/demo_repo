package lab1.task2;

public class Test {
    public static void main(String[] args) {
        Course courseTest = new Course();
        courseTest.setTitle("Math");
        courseTest.setDescription("Learning math");

        Student[] stu = new Student[5];

        stu[0]  = new Student();
        stu[0].setName("Gigel");
        stu[0].setYear(1);

        stu[1] = new Student();
        stu[1].setName("Costel");
        stu[1].setYear(4);

        stu[2] = new Student();
        stu[2].setName("Maricica");
        stu[2].setYear(1);

        stu[3] = new Student();
        stu[3].setName("Marcel");
        stu[3].setYear(3);

        stu[4] = new Student();
        stu[4].setName("Georgel");
        stu[4].setYear(2);

        courseTest.filterYear(3, stu);

        Student s1 = new Student();
        s1.setName("Marian Sefu");
        s1.setYear(3);

        Student s2 = new Student();
        s2.setName("Marian Sefu");
        s2.setYear(3);

        System.out.println(s1.equals(s2));


    }

}
