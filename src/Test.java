public class Test {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("cagatay","555","trh");
        Teacher t2 = new Teacher("ali","222","fzk");
        Teacher t3 = new Teacher("veli","111","bio");

        Course tarih = new Course("tarih","101","trh");
        tarih.addTeacher(t1);
        Course fizik = new Course("fizik","202","fzk");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("biyoloji","303","bio");
        biyoloji.addTeacher(t3);


        Student s1 = new Student(tarih,fizik,biyoloji,"cagatay","555","4");
        s1.addBulkExamNote(80,70,68);
        s1.isPass();

    }
}