package acc;

import database.accounts.AccountsDatabase;

public abstract class Account {

    private String email;
    private String password;

    public Account(String email, String password) {
        this.email = email;
        this.password = password;

        AccountsDatabase.getInstance().add(this);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
