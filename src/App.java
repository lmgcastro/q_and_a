import enums.QuestionsEnum;
import model.QAndA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private List<QAndA> questions;

    public static void main(String... args) {

        App app = new App();
        // populating questions list
        app.populateQuestions();

        Scanner sc = new Scanner(System.in);
        for (QAndA qAndA : app.questions) {
            System.out.print(qAndA.getQuestion());
            String line = sc.nextLine();
            Boolean answer = line.equals("yes") ? true : false;
            qAndA.setAnswer(answer);
        }

        System.out.println("---------- ANSWERS ----------");
        app.questions.stream().forEach(System.out::println);
    }

    private void populateQuestions() {
        // initializing questions variable
        this.questions = new ArrayList<>();
        for (QuestionsEnum questionEnum : QuestionsEnum.values()) {
            questions.add(new QAndA(questionEnum.question));
        }
    }
}
