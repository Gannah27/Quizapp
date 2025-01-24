import java.sql.*;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database.setDbUser(scanner.next());
        Database.setDbPassword(scanner.next());
        Connection conn =Database.getConnection();
        QuestionService quest = new QuestionService();

        quest.insertQuestion(conn);
        quest.displayQuestion();
    }
}