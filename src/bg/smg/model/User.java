package bg.smg.model;

import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Account> BankAccounts;


    public User(String username, String password, List<Account> bankAccounts) {
        this.username = username;
        this.password = password;
        BankAccounts = bankAccounts;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Account> getBankAccounts() {
        return BankAccounts;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBankAccounts(List<Account> bankAccounts) {
        BankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", BankAccounts=" + BankAccounts +
                '}';
    }
}
