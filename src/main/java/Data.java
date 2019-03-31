import java.util.Date;

public class Data {

    private Film[] films = new Film[] {
            new Film("1","фильм","Джанго","драма",new Date(),"Эксцентричный охотник за головами, также известный как «Дантист» промышляет отстрелом самых опасных преступников", 7.1),
            new Film("2","фильм","Донни Браско","драма",new Date(),"Нью-Йорк, 1978 год. Агент ФБР Джо Пистоне получает новое задание: внедриться в одну из преступных группировок Бруклина.", 7.9),
            new Film("3","фильм","Жестокий романс","мелодрама",new Date(),"Действие разворачивается на берегу Волги в вымышленном провинциальном городке Бряхимове в 1877-1878 годах.", 8.1),
    };

    private User[] users = new User[] {
            new User("Alex45","Alex","12345"),
            new User("Anton10","Anton","1234"),
    };

    public  Film[] getFilms() {
        return films;
    }

    public  User[] getUser() {
        return users;
    }

}
