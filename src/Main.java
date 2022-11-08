import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите логин");
            String login = scanner.nextLine();
            System.out.println("Введите пароль");
            String password = scanner.nextLine();

            User catchUser = getUserByLoginAndPassword(login, password);
            validateUser(catchUser);
            System.out.println("Доступ разрешен");
        }


    }

    public static User[] getUsers() {
        return new User[]{
                new User("BOSSOFTHEJYM", "jhon@gmail.com", "comeon", 24),
                new User("Billy", "kolya@mail.ru", "wecan", 19),
                new User("Van", "masha@google.com", "300bucks", 12)
        };

    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        for (User user : getUsers()) {
            if (user.checkLoginAndPassword(login, password)) {
                return user;
            }
        }
        throw new UserNotFoundException();
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException();
        }
    }

}
