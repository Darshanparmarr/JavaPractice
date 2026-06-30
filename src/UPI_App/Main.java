public class Main{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123", 5000);
        BankAccount acc2 = new BankAccount("456", 3000);

        User abhay = new User("Abhay", "abhay@upi", acc1);
        User rahul = new User("Rahul",  "rahul@upi", acc2);

        UPIServices upiServices = new UPIServices();
        upiServices.registerUser(abhay);
        upiServices.registerUser(rahul);

        abhay.checkBalance();
        rahul.checkBalance();

        upiServices.sendMoney(abhay.getUpiId(), rahul.getUpiId(), 5001);
        
        abhay.checkBalance();
        rahul.checkBalance();

    }
} 