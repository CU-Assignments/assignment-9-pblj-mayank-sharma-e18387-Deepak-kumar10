public class TestTransaction {
    public static void main(String[] args) {
        BankService bankService = new BankServiceImpl();
        try {
            bankService.transferMoney(1, 2, 500);
            System.out.println("Transaction completed successfully.");
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}