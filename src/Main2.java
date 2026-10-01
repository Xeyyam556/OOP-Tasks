void main() {

    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter your username: ");
    String username=scanner.nextLine();
    System.out.print("Enter your password: ");
    String password=scanner.nextLine();

    User user=new User(username,password);

    System.out.print("Enter your old password: ");
    String oldPass = scanner.nextLine();
    System.out.print("Enter your new password.: ");
    String newPass = scanner.nextLine();

    user.ChangePass(oldPass, newPass);

    System.out.println("New password: " + user.getPassword());
    System.out.println(user.getUsername());
}