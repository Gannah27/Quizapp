public class Questions
{
    private int num;
    private String Question;
    private  String option_a ;
    private String option_b ;
    private String option_c ;
    private String option_d;
    private char correct_option;

    public Questions(int num, String question, String option_a, String option_b, String option_c, String option_d, char result) {
        this.num = num;
        Question = question;
        this.option_a = option_a;
        this.option_b = option_b;
        this.option_c = option_c;
        this.option_d = option_d;
        this.correct_option = result;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getOption_a() {
        return option_a;
    }

    public void setOption_a(String option_a) {
        this.option_a = option_a;
    }

    public String getOption_b() {
        return option_b;
    }

    public void setOption_b(String option_b) {
        this.option_b = option_b;
    }

    public String getOption_c() {
        return option_c;
    }

    public void setOption_c(String option_c) {
        this.option_c = option_c;
    }

    public String getOption_d() {
        return option_d;
    }

    public void setOption_d(String option_d) {
        this.option_d = option_d;
    }

    public char getCorrect_option() {
        return correct_option;
    }

    public void setCorrect_option(char correct_option) {
        this.correct_option = correct_option;
    }
}
