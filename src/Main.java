import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database.setDbUser(scanner.next());
        Database.setDbPassword(scanner.next());
        Connection conn =Database.getConnection();
        String query = "Select* from auth";
        System.out.println("Enter Username");
        String user = scanner.next();
        System.out.println("Enter Password");
        String pass = scanner.next();
        try(Statement stat= conn.createStatement(); ResultSet res = stat.executeQuery(query)) {
            while (res.next()){
                if(user.equals(res.getString("username")) && pass.equals(res.getString("password"))){
                    System.out.println("Welcome user let's start your Quiz");
                }else{
                    System.out.println("Wrong Credentials");
                    return;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        QuestionService quest = new QuestionService();

        quest.insertQuestion(conn);
        quest.displayQuestion();
    }
}