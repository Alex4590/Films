import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.*;

public class MovieStorage {

    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        login(scan);
        searchFilm(scan);
    }


    private static void login(Scanner scan) throws SQLException {

        System.out.print("Ведите логин: ");
        String inputLogin = scan.next();

        System.out.print("Введите пароль: ");
        String inputPass = scan.next();

        PreparedStatement data = new PreparedStatement();
        ResultSet rs = data.getUsers();


        while (rs.next()) {

            String login = rs.getString("login");
            String password = rs.getString("password");

            if (login.equals(inputLogin) && password.equals(inputPass)) {
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
