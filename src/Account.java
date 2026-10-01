public class Account {
    private Integer id;
    private Long balance;

    public Account(Integer id, Long balance) {
        this.id = id;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
    public void Deposit(Long amount){
        if (this.balance>0){
            this.balance=balance+amount;
        }else {
            System.out.println("Error");
        }
    }
    public void WithDraw(Long amount){
        if (this.balance>0){
            this.balance=balance-amount;
        }else {
            System.out.println("Error");
        }
    }
}
