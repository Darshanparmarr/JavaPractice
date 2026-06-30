public class User {
    private String name;
    private String upiId;
    private BankAccount bankAccount;

    public User(String name, String upiId, BankAccount bankAccount) {
        this.name = name;
        this.upiId = upiId;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void checkBalance() {
        System.out.println(name + "Balance Rs. " + bankAccount.getBalance());
    }

}
