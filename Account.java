package entity;

public class Account {
    private int AccountNumber;
    private double balance;
    private String username;
    private String password;
    private long createdate;
    private int status;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCreatedate() {
        return createdate;
    }

    public void setCreatedate(long createdate) {
        this.createdate = createdate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Account() {
    }

    public Account(double balance, String username, String password, long createdate, int status) {
        this.balance = balance;
        this.username = username;
        this.password = password;
        this.createdate = createdate;
        this.status = status;
    }

    public boolean isValid(){
        if(username == null || username.length()<7){
            return false;
        }
        if(password == null || password.length()<7){
            return false;
        }
        return true;
    }
}
