package enums;

public enum QuestionsEnum {

    FIRST_QUESTION("Did you go to the gym today?"),
    SECOND_QUESTION("Do you like a finger in your ass?");

    public final String question;

    QuestionsEnum(String question) {
        this.question = question;
    }
}
