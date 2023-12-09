package week4;
public class AccountDemo {
    public static void main(String[] args) {
        Account A1 = new Account(1,50000);
        Account A2 = new Account();

        A2.setBal(25000);
        A1.deposit(200);
        A1.displayDetails();
        A1.setId(12);
        A1.setBal(25000);
        A1.displayDetails();
        A1.withdraw(1000);
        System.out.println(A1.getBal()+","+ A1.getId());
    }
}