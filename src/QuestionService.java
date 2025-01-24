import java.sql.*;
import java.util.Scanner;

public class QuestionService {
    Questions Quest[]= new Questions[5];

    public void displayQuestion(){
        Scanner sc= new Scanner(System.in);
        Score soc= new Score();
        for(Questions Q : Quest ){
            System.out.println("Q. "+ Q.getNum()+ " " + Q.getQuestion());
            System.out.println("a."+Q.getOption_a()+" b."+Q.getOption_b()+" c."+
                    Q.getOption_c()+" d."+ Q.getOption_d());
            char ans = sc.next().charAt(0);
            if(ans==Q.getCorrect_option()){
                soc.points ++;
            }
        }
        System.out.println("Your Score is "+ soc.points +" !");

    }
    public void insertQuestion(Connection conn){
        String query= "select* from questions";

        try (Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int curr=id-1;
                String question = resultSet.getString("question");
                String optionA = resultSet.getString("option_a");
                String optionB = resultSet.getString("option_b");
                String optionC = resultSet.getString("option_c");
                String optionD = resultSet.getString("option_d");
                char correctOption = resultSet.getString("correct_option").charAt(0);
                if (Quest[curr] == null) {
                    Quest[curr] = new Questions(id,question,optionA,optionB,optionC,optionD,correctOption);
                }

            }} catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
