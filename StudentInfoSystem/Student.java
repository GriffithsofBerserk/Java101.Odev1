package Java101OOP;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;
    Student(String name,String stuNo, int classes, Course mat,Course fizik,Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik,int kimya,int sozluNote1, int sozluNote2, int sozluNote3){
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (sozluNote1>=0 && sozluNote1<=100){
            this.mat.sozluNote = sozluNote1;
        }
        if (sozluNote2>=0 && sozluNote2<=100){
            this.fizik.sozluNote = sozluNote2;
        }
        if (sozluNote3>=0 && sozluNote3<=100){
            this.kimya.sozluNote = sozluNote3;
        }


    }
    public void isPass(){
        if(this.mat.sozluNote == 0 || this.fizik.sozluNote==0 || this.kimya.sozluNote==0) {
            System.out.println("Sözlü notları tam olarak girilmemiş");
        }
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        }
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }

    }
    public void calcAverage(){
        this.average = ((this.fizik.note*0.8)+(this.fizik.sozluNote*0.2) + (this.kimya.note*0.8+this.kimya.sozluNote*0.2)+(this.mat.note*0.8+this.mat.sozluNote*0.2))/3;
    }
    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }
    public void printNote(){
        System.out.println("=====================");
        System.out.println("Öğrenci : "+this.name);
        System.out.println("Matematik Notu : "+this.mat.note);
        System.out.println("Fizik Notu : "+this.fizik.note);
        System.out.println("Kimya Notu : "+this.kimya.note);
        System.out.println("Matematik Sözlü Notu : "+this.mat.sozluNote);
        System.out.println("Fizik Sözlü Notu : "+this.fizik.sozluNote);
        System.out.println("Kimya Sözlü Notu : "+this.kimya.sozluNote);
    }
}
