package structural_patterns.adapter.after;



public class AccountService {
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public Account createNewAccount(Account account) {
        return new Account();
    }

    public void updateAccount(Account account) {

    }
}
