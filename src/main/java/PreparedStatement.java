import java.sql.*;

public class PreparedStatement {


    private void createTable() {
        Connection con = null;
        Statement stmt = null;
        try {
            DriverManager.registerDriver(new org.h2.Driver());
            con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "root", "");
            stmt = con.createStatement();
            stmt.execute(
                    "create table movie_users ( " +
                            "id number(10) primary key," +
                            "login varchar2(100)," +
                            "name varchar2(250)," +
                            "password varchar2(100))");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }

    private void createData() {
        Connection con = null;
        Statement stmt = null;
        try {
            DriverManager.registerDriver(new org.h2.Driver());
            con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "root", "");
            stmt = con.createStatement();
            stmt.executeUpdate("insert into movie_users(id,login,name,password) values('1', 'Alex4590', 'Alex', '12345')");
            stmt.executeUpdate("insert into movie_users(id,login,name,password) values('2', 'Anton10', 'Anton', '12345')");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }


    public ResultSet getUsers() {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            DriverManager.registerDriver(new org.h2.Driver());
            con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from  movie_users");

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return rs;
    }


}
