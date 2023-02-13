public class InheritanceChallenge {
    public static void main(String[] args) {
        Employee tim=new Employee("tim", "11/11/1985","01/01/2020" );
        System.out.println(tim);
        System.out.println("Age= "+ tim.getAge());
        System.out.println("Pay= "+tim.collectPay());
        SalariedEmployee joy=new SalariedEmployee("joy", "11/11/1989","01/01/2020", 3500 );
        System.out.println(joy);
        System.out.println("Age= "+ joy.getAge());
        System.out.println("Pay= "+joy.collectPay());
        System.out.println("Joy`s Peycheck = " + joy.collectPay());
        joy.retire();
        System.out.println("Joy`s Pension Check= "+joy.collectPay());
        HourlyEmployee mary=new HourlyEmployee("mary", "11/11/1989","01/01/2020", 15 );
        System.out.println(mary);
        System.out.println("Age= "+ mary.getAge());
        System.out.println("Mary`s Peycheck = " + mary.collectPay());
        System.out.println(mary.getDoublePay());
    }
}
     class Worker {
       private String name;
      private  String birthDate;
      protected  String endDate;
        public Worker(){
}
       public  Worker(String name, String birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }
        public int getAge(){
            int currentYear=2023;
            int birthYear=Integer.parseInt(birthDate.substring(6));
            return (currentYear-birthYear);
        }

        public double collectPay(){
            return 0.0;
        }

        public void terminate(String endDate){
            this.endDate=endDate;
        }

         @Override
         public String toString() {
             return "Worker{" +
                     "name='" + name + '\'' +
                     ", birthDate='" + birthDate + '\'' +
                     ", endDate='" + endDate + '\'' +
                     '}';
         }
     }
      class Employee extends Worker{
        private long employeeId;
        private String hireDate;
        private static int employeeNo=1;
        public Employee(){
        }

          public Employee(String name, String birthDate,  String hireDate) {
              super(name, birthDate);
              this.employeeId = Employee.employeeNo++;
              this.hireDate = hireDate;
          }

          @Override
          public String toString() {
              return "Employee{" +
                      "employeeId=" + employeeId +
                      ", hireDate='" + hireDate + '\'' +
                      "} " + super.toString();
          }
      }


    class SalariedEmployee extends Employee{
private double annualSalary;
private boolean isRetired;

        public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
            super(name, birthDate, hireDate);
            this.annualSalary = annualSalary;
        }
        @Override
        public double collectPay(){
          double paycheck=annualSalary/26;
          double adjustedPay=(isRetired) ? 0.9*paycheck:paycheck;
          return (int) adjustedPay;
        }

        public void retire(){
            terminate("12/12/2025");
            isRetired=true;
        }

    }

class HourlyEmployee extends Employee{
private double hourlyRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyRate) {
        super(name, birthDate, hireDate);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double collectPay(){
        return 40*hourlyRate;
    }
    public double getDoublePay(){
        return 2*collectPay();
    }
}


