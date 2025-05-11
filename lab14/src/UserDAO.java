import javax.xml.crypto.Data;
import java.sql.*;

public class UserDAO {
    public boolean authenticateUser(String username, String pin, String role) throws SQLException {
        String sql = "Select * from users where username = ? AND pin = ? AND role = ?";
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, username);
            stmt.setString(2, pin);
            stmt.setString(3, role);

            ResultSet rs = stmt.executeQuery();

            return rs.next();
        }
    }

    public void addUser(String username, String pin) throws SQLException{
        String sql = "INSERT INTO users (username, pin, role, balance) VALUES (?, ?, 'user', 0)";
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, username);
            stmt.setString(2, pin);

            stmt.executeUpdate();

            System.out.println("Użytkownik dodany!");
        }
    }

    public void deposit(String username, double amount) throws SQLException{
        String sql = "Update users Set balance = balance + ? Where username = ?";
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setDouble(1, amount);
            stmt.setString(2, username);

            stmt.executeUpdate();

            System.out.println("Wpłata zakończona sukcesem!");
        }
    }

    public void withdraw(String username, double amount) throws SQLException{
        String checkSql = "Select balance From users Where username = ?";
        String updateSql = "Update users Set balance = balance - ? Where username = ?";

        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement checkStmt = con.prepareStatement(checkSql)){
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();

            if(rs.next() && rs.getDouble("balance") >= amount){
                try(PreparedStatement updateStmt = con.prepareStatement(updateSql)){
                    updateStmt.setDouble(1, amount);
                    updateStmt.setString(2, username);

                    System.out.println("Wypłata zakończona sukcesem!");
                }
            }else{
                System.out.println("Brak wystarczającej ilości środków na koncie");
            }

        }
    }

    public void changePin(String username, String newPin) throws SQLException{
        String sql = "Update users Set pin = ? Where username = ?";
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, newPin);
            stmt.setString(2, username);

            stmt.executeUpdate();

            System.out.println("Zmiana hasła udała się");
        }
    }

    public void showBalance(String username) throws SQLException{
        String sql = "Select balance from users where username = ?";
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                System.out.println("Twoje saldo: "+ rs.getDouble("balance")+ "PLN");
            }else{
                System.out.println("Brak środków na koncie");
            }
        }
    }
}
