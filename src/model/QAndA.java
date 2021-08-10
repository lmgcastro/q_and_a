package model;

public class QAndA {

    private final String YES = "yes";
    private final String NO = "no";
    private final String YES_OR_NO = "[yes/no]";
    private String question;
    private Boolean answer;

    public QAndA(String question) {
        this.question = question;
    }

    public QAndA(String question, Boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return String.format("%s %s: ", question, YES_OR_NO);
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        String yesOrNo = this.answer ? YES : NO;
        return String.format("%s: %s", this.question, yesOrNo);
    }
}
