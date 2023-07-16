package Java101OOP;

public class Employee {
    String nameSurname;
    double salary;
    int workHours;
    int hireYear;
    public Employee(String nameSurname,double salary, int workHours, int hireYear){
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        double vergi = 0;
        if (this.salary>1000){
            vergi = (this.salary*3)/100;
        }
        return vergi;
    }
    public double bonus(){
        double bns =0;
        if (this.workHours>40){
            for (int i =1;i<=this.workHours-40;i++){
                bns = i*30;
            }
        }
        return bns;
    }
    public double raiseSalary(){
        double maasArtisi = 0;
        if (2021-this.hireYear<10){
            maasArtisi = (this.salary*5)/100;
            double newMaas = maasArtisi+this.salary;
        }else if (2021-this.hireYear>9 && 2021-this.hireYear<20){
            maasArtisi = (this.salary*10)/100;
            double newMaas = maasArtisi+this.salary;
        }else if (2021-this.hireYear>19){
            maasArtisi = (this.salary*15)/100;
            double newMaas = maasArtisi+this.salary;
        }
        return maasArtisi;
    }
     public void ToString(){
        System.out.println("Adı : " + this.nameSurname);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : "+ tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+ (this.salary+bonus()-tax()));
        System.out.println("Toplam Maaş : "+ (this.salary+raiseSalary()));
    }
}
