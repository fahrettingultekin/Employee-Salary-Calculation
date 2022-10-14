package practicum.java.ebebek;

/**
 *
 * @author Fahrettin
 * 
 */
public class Main {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee("Fahrettin", 1500, 45, 2011);
        Employee employee2 = new Employee("Günes", 9900, 30, 2015);
        
        //Calisan bilgilerinin gosterimi için foreach kullanımı
        Employee[] employees = {employee1, employee2};

        for (Employee employee : employees) {
            System.out.println("-------------");
            
            //Calisan niteliklerinin gosterimi icin toString methodu cagirildi
            System.out.println(employee.toString());
            
            System.out.println("Tax: " + employee.tax());
            System.out.println("Bonus: " + employee.bonus());
            System.out.println("Raise Salary: " + employee.raiseSalary());
            System.out.println("Salary with bonus and tax: " + (employee.bonus() - employee.tax() + employee.getSalary()));
            System.out.println("Total Salary: " + (employee.getSalary() + employee.bonus()));
        }
    }

}
