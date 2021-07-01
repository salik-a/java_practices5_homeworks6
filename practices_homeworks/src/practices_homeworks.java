import java.util.Random;
import java.util.Scanner;

public class practices_homeworks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println();
        System.out.println("---------------------------Practice1--------------------------------");
        System.out.println();
        System.out.println("---------------------------Student Information System--------------------------------");
        System.out.println();


        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();


         


        /*

        System.out.println();
        System.out.println("---------------------------Practice2--------------------------------");
        System.out.println();
        System.out.println("---------------------------Boxing Play--------------------------------");
        System.out.println();


        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();

         */

        /*
        System.out.println();
        System.out.println("---------------------------Homework1--------------------------------");
        System.out.println();
        System.out.println("---------------------------Salary Calculator Program--------------------------------");
        System.out.println();

        Employee employee =new Employee("Kemal",2000,45,1985);
        employee.print();
         */


    }
}
