import java.sql.*;
public class QuestionService {
    Questions Quest[]= new Questions[5];

    public void displayQuestion(){
        for(Questions Q : Quest ){
            System.out.println(Q.getQuestion());
            System.out.println();
        }
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
