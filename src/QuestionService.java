public class QuestionService {
    Questions Quest[]= new Questions[5];

    public QuestionService() {
        Quest[0]= new Questions(1,"what are you ", "a", "b", "c", "d","a");
        Quest[1]= new Questions(2,"what are you ", "a", "b", "c", "d","a");
        Quest[2]= new Questions(3,"what are you ", "a", "b", "c", "d","a");
        Quest[3]= new Questions(4,"what are you ", "a", "b", "c", "d","a");
        Quest[4]= new Questions(5,"what are you ", "a", "b", "c", "d","a");
    }
    public void displayQuestion(){
        for(Questions Q : Quest ){
            System.out.println(Q.getQuestion());
            System.out.println();
        }
    }
    public void insertQuestion(){

    }
}
