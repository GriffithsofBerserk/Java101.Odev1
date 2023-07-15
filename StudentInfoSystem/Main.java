package Java101OOP;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","905000000000");
        Teacher t2 = new Teacher("Graham Bell","FZK","0000");
        Teacher t3 = new Teacher("Mehmet Hoca","KMY","34234943");
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        Student s1 = new Student("Yaşar Duman","455345234",4,mat,fizik,kimya);
        Student s2 = new Student("Mehmet Bayram","3425345",4,mat,fizik,kimya);
        Student s3 = new Student("Ali Kefen","342434",4,mat,fizik,kimya);
        s3.addBulkExamNote(60,60,60,90,90,90);
        s3.isPass();
    }
}
