public class User {

    private String username;
    private String password="123";

    public User(String username, String password) {
        this.username = username.toLowerCase();
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username.toLowerCase();
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean CheckPass(String password){
        if(password.equals("123")){
            return true;
        }
        else {
            return false;
        }

    }public void ChangePass(String old, String neww) {

        if (!this.password.equals(old)) {
            System.out.println("Köhnə parol yanlışdır!");
            return;
        }

        if (neww.length() < 8) {
            System.out.println("Yeni parol minimum 8 simvoldan ibarət olmalıdır!");
            return;
        }

        this.password = neww;
        System.out.println("Parol uğurla dəyişdirildi.");
    }
    }


