import java.util.Scanner;

public class Films {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        login(scan);

        searchFilm(scan);
    }


    private static void login(Scanner scan) {

        System.out.print("Ведите логин: ");
        String inputLogin = scan.next();

        System.out.print("Введите пароль: ");
        String inputPass = scan.next();

        Data data = new Data();
        User[] users = data.getUser();


        for (User user : users) {

            if (inputLogin.equals(user.getLogin()) && inputPass.equals(user.getPassword()) ) {

                System.out.println("Вы успешно авторизовались");
                break;
            } else {
                System.out.println("Логин или пароль не верны");
                System.exit(0);
            }
        }

    }

    private static void searchFilm(Scanner scan) {
        System.out.println("Введите название фильма: ");
        String inputFilmName = scan.next();

        Data data = new Data();
        Film[] films = data.getFilms();

        for(Film film : films) {
            if (inputFilmName.equals(film.getName())) {
                System.out.println("Название фильма: " + film.getName());
            }
        }
    }
}
