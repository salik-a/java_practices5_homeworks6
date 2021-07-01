public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public int tax(){
        int tax;
        if (salary<1000)
            tax=0;
        else
            tax= (int) (salary*0.03);
        return tax;
    }
    public int bonus(){
        int bonus;
        if(workHours<40)
            bonus=0;
        else
            bonus=(workHours-40)*30;
        return bonus;
    }
    public int raiseSalary(){
        int year=2021-hireYear;
        int raise;
        if (year<10)
            raise= (int) (salary*0.05);
        else if(year>=10 && year<20)
            raise=(int) (salary*0.1);
        else
            raise=(int) (salary*0.15);
        return raise;
    }

    public void print(){
        int salary2= salary+bonus()-tax();
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Work Hours : "+workHours);
        System.out.println("Hired Year : "+hireYear);
        System.out.println("Tax : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Salary Increase : "+raiseSalary());
        System.out.println("Salary with bonus and tax : "+salary2);
        System.out.println("Last salary : "+(salary+raiseSalary()));
    }



}
