package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("Sakib is Captain of Bangladesh Team",Priority.HIGH);
        Email email2 = new Email("Injuerd afif",Priority.MEDIUM);
        Email email3 = new Email("Planning in Current Situation in playing moment",Priority.LOW);
        EmailProcessor emailProcessor = new CaptainEmailProcess(new CoachEmailProcess(new BoardEmailProcessor()));
        emailProcessor.processEmail(email2);

    }
}
