public class UserNotFoundException extends Exception{
    public UserNotFoundException() {
        super("Нет такого пользователя");
    }
}
