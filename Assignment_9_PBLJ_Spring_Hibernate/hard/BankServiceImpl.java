import org.springframework.transaction.annotation.Transactional;

public class BankServiceImpl implements BankService {

    private AccountDao accountDao;
    private TransactionDao transactionDao;

    @Transactional
    public void transferMoney(int fromAccountId, int toAccountId, double amount) {
        Account fromAccount = accountDao.getAccount(fromAccountId);
        Account toAccount = accountDao.getAccount(toAccountId);

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        accountDao.updateAccount(fromAccount);
        accountDao.updateAccount(toAccount);

        Transaction transaction = new Transaction();
        transaction.setFromAccountId(fromAccountId);
        transaction.setToAccountId(toAccountId);
        transaction.setAmount(amount);
        transactionDao.saveTransaction(transaction);
    }

    // Setter methods for accountDao and transactionDao
}