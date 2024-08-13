import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Which is best langugage for cp", "java", "cpp", "python", "C#", "cpp");
        questions[1] = new Question(2, "Which language is known for its simplicity?", "python", "java", "C++", "C#",
                "python");
        questions[2] = new Question(3, "Which language is primarily used for web development?", "javascript", "python",
                "java", "C#", "javascript");
        questions[3] = new Question(4, "Which language is often used for system programming?", "C", "C++", "java",
                "python", "C++");
        questions[4] = new Question(5, "Which language is strongly typed?", "java", "python", "javascript", "C#",
                "java");

    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question id: " + q.getId());
            System.out.println(q.getQuestion());

            String[] options = { q.getOpt1(), q.getOpt2(), q.getOpt3(), q.getOpt4() };
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }
            selection[i] = sc.nextLine();
        }
        sc.close();
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your Score is: " + score);
    }
}
