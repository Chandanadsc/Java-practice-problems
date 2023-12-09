package week4;

public class Account {
    private int id,bal;
    Account(){}
    Account(int id , int bal){
        this.id = id;
        this.bal = bal;
    }
    void setId(int id){
        this.id = id;
    }

    public void setBal(int bal){
    	this.bal=bal;
    }
    public int getId(){return this.id;}
    public int getBal(){return this.bal;}
    public void withdraw(int amount){this.bal=this.bal-amount;}
    public void deposit(int amount){this.bal=this.bal+amount;}
    public void displayDetails()
    {
      System.out.println("id = "+this.id+","+this.bal);
    }
    }