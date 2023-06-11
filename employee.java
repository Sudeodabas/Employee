public class employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        double tax=0;
        if(salary<1000){
            tax=0;
        }
        else{
            tax+=(salary*3)/100;
        }
        return tax;
    }
    public int bonus(){
        int bonus=0;
        if(workHours>40){
            bonus=(workHours-40)*30;
        }
        return bonus;
    }
    public double raiseSalary(){
        int year=2021;
        double raise=0;
        if(year-hireYear<10){
            raise=(salary*5)/100;
        }
        else if (year-hireYear<9&&year-hireYear<20) {
            raise=(salary*10)/100;
        } else if (year-hireYear>19) {
            raise=(salary*15)/100;
        }
        return raise;
    }
    public void toStringg(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç tarihi: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş artışı: "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: "+(salary-tax()+bonus()));
        System.out.println("Toplam maaş: "+(salary+raiseSalary()));
        System.out.println("-------------------------------------------------------");
    }
}
