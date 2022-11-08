public class User {


    private String login;
    private String password;
    private String email;
    private int age;

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public User(String login, String email, String password, int age) {
        this.age =age;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public boolean checkLoginAndPassword(String login, String password){
        return(this.login.equals(login)&&this.password.equals(password));
    }

}
