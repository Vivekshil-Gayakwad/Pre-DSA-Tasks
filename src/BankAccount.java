//1.	Create a BankAccount class using private variables and getters/setters.
//2.	Create a Student class with encapsulated data members.

public class BankAccount {
    private long accountNo = 432567895678l;
    private String IFSC = "SBI1107";

    public long getAccountNo(){
        return accountNo;
    }

    public void setAccountNo(long accountNo){
        this.accountNo = accountNo;
    }

    public long getIFSC(){
        return accountNo;
    }

    public void setIFSC(String IFSC){
        this.IFSC = IFSC;
    }

}
