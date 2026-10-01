void main() {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter your id: ");
    int id=scanner.nextInt();
    System.out.print("Enter your balance: ");
    long balance=scanner.nextInt();

    Account account=new Account(id, balance);

    System.out.print("Enter the deposit: ");
    long deposit=scanner.nextInt();
    account.Deposit(deposit);
    System.out.println(account.getBalance());
    System.out.println("Enter the amount you want to withdraw: ");
    long withdraw=scanner.nextInt();
    account.WithDraw(withdraw);
    System.out.println(account.getBalance());
}