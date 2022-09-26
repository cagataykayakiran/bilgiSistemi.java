public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo();
            System.out.println("***********");
        }else {
            System.out.println("uyuşmuyor");
        }

    }

    void printTeacherInfo(){
        this.teacher.printTeacher();
    }


}
