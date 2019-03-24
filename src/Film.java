import java.util.Date;

public class Film {
    private String id;
    private String type;
    private String name;
    private String genre;
    private Date date;
    private String desk;
    private double rating;

    public Film(String id, String type, String name, String genre, Date date, String desk, double rating) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.genre = genre;
        this.date = date;
        this.desk = desk;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }
}
