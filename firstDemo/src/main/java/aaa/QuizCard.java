package aaa;

;

/**
 * @author wujiaojiao
 * @create 2018-04-16 下午5:35
 **/
public class QuizCard {
    private String question;
    private String answer;
    public  QuizCard(String p,String a){
        question=p;
        answer=a;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
