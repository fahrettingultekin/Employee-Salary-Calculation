package practicum.java.ebebek;

/**
 *
 * @author Fahrettin
 */
public class Employee {

    /**
     * net sonuclar almak icin double ve float
     * kullanmaktan kacinsam da
     * maas artis hesaplamasinda dogru sonuc almak icin double kullandim
     */
    
    private final String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {
        double tax=0;
        if (getSalary() > 1000) {
            tax = (3*getSalary())/100;
            
        }
        return tax;
    }

    public int bonus() {
        int bonus=0;
        if (getWorkHours() > 40) {
            bonus  = (getWorkHours() - 40) * 30;
            
        }
        return bonus;
    }

    public double raiseSalary() {
        double raiseSalary = this.getSalary() - tax() + bonus();
        if ((2021 - getHireYear()) < 10) {
          raiseSalary = ((5 * raiseSalary) / 100);
        }
        else if ((2021-getHireYear())>9 && (2021-getHireYear())<20){
           raiseSalary = ((10 * raiseSalary) / 100);
        }
        else if((2021-getHireYear())>19){
            raiseSalary = ((15 * raiseSalary) / 100);
        }
        return raiseSalary;
        
    }
    @Override
    public String toString(){
        return "Name: " + getName() + "\nSalary: " + getSalary() + 
                "\nWork Hours: " + getWorkHours() +"\nHire Year: " + getHireYear() ;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the workHours
     */
    public int getWorkHours() {
        return workHours;
    }

    /**
     * @param workHours the workHours to set
     */
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    /**
     * @return the hireYear
     */
    public int getHireYear() {
        return hireYear;
    }

    /**
     * @param hireYear the hireYear to set
     */
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

}
