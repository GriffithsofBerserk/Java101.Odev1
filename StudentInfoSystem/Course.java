package Java101OOP;

public class Course {
    Teacher courseTeacher;
    String name;

    String code;
    String prefix;
    int note;
    int sozluNote;

    Course(String name,String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sozluNote = 0;
    }
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem Başarılı");
        }else{
            System.out.println("Akademisyeni bu dersi veremez!");
        }
    }
    public void printTeacher(){
        if (courseTeacher!=null){
            System.out.println(this.name + "dersinin Akademisyeni : "+courseTeacher.name);
        }else {
            System.out.println(this.name+"dersine Akademisyen atanmamıştır!");
        }
    }
}
