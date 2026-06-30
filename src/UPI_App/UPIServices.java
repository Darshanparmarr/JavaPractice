import java.util.HashMap;
import java.util.Map;

public class UPIServices {

    private Map<String, User> map = new HashMap<>();

    public void registerUser(User user) {
        map.put(user.getUpiId(), user);
    }

    public void sendMoney(String senderUpi, String receiverUpi, double amount) {
        User senderUser = map.get(senderUpi);
        User receiverUser = map.get(receiverUpi);

        Boolean success = senderUser.getBankAccount().debit(amount);
        if (!success) {
            Transaction t = new Transaction(amount, receiverUser, senderUser, "FAILED");
            t.printTransaction();
        } else {
            receiverUser.getBankAccount().credit(amount);
            Transaction t = new Transaction(amount, receiverUser, senderUser, "SUCCESS");
            t.printTransaction();
        }
    }
    
}