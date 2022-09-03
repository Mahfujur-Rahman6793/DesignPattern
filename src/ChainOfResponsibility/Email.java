package ChainOfResponsibility;

public class Email {
    private String message;
    private Priority priority;
    Email(String message, Priority priority){
        this.message =message;
        this.priority = priority;
    }
    public String getMessage(){
        return message;
    }
    public Priority getPriority(){
        return priority;
    }
}
