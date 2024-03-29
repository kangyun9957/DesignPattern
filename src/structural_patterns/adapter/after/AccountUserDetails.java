package structural_patterns.adapter.after;

public class AccountUserDetails implements UserDetails{

    private Account account;

    public AccountUserDetails(Account account){
        this.account = account;
    }
    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
