class Student {
    private final String name;
    private int year;
    private BankAccount bankAccount;
    private static final int annualFees = 10000;

    public Student(String name, int year,BankAccount bankAccount) {
        this.name       = name;
        this.year       = year;
        this.bankAccount=bankAccount;
    }

    public String getDetails() {
        return "Name : "        + name           + '\n' +
                "Fees : "        + this.computeFees() ;
    }

    public int computeFees () {
        return Student.annualFees * year;
    }
}

class ResearchStudent extends Student {

    private static final int annualFees = 10000;
    private String researchArea;

    public ResearchStudent(String name, int year, String researchArea,BankAccount bankAccount) {
        super(name,year,bankAccount);
        this.researchArea       = researchArea;

    }
    public String getDetails(){
        return super.getDetails()+'\n'+ "Research Area : "+ researchArea;
    }



}

class phDStudent extends ResearchStudent {

    private static final int annualFees = 10000;
    private String thesisTitle;

    public phDStudent(String name, int year, String researchArea,String thesisTitle,BankAccount bankAccount) {
        super(name,year,researchArea,bankAccount);
        this.thesisTitle       = thesisTitle;

    }
    public String getDetails(){
        return super.getDetails() + '\n'+ "Thesis Title: "+ thesisTitle;
    }



}
class BankAccount{
    private int  balance;
    private int accountNumber;
    public BankAccount(int balance,int accountNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

}


public class Main {
    public static void main(String[] a) {
        BankAccount a1=new BankAccount(111,1000);
        BankAccount a2=new BankAccount(222,2000);
        BankAccount a3=new BankAccount(333,3000);
        Student s1 = new Student("Sujit", 2,a1);
        System.out.println(s1.getDetails());
        ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering",a2);
        System.out.println(s2.getDetails());
        phDStudent s3 = new phDStudent("hari", 5, "Software Engineering","kch",a3);
        System.out.println(s3.getDetails());
    }
}

/*
  WHAT HAVE WE LEARNED
  --------------------
  - Inheriting using extends
  - Initialising the super-class object using 'super' keyword in the sub-class's constructor.
  - The fact that the super-class's methods (e.g. getDetails) are also part of the sub-class.
*/