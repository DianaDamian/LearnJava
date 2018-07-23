public class BankAccount {
   private int accNumber;
   private int balance;
   private String custName;
   private String email;
   private int phoneNumber;


   public void setAccNumber(int accNumber){
       this.accNumber= accNumber;
   }

   public int getAccNumber(){
       return this.accNumber;
   }

    public void setBalance(int balance){
        this.balance= balance;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setCustName(String custName){
        this.custName= custName;
    }

    public String getCustName(){
        return this.custName;
    }




}
