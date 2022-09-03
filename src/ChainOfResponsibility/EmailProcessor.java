package ChainOfResponsibility;

import java.util.IllegalFormatCodePointException;

public interface EmailProcessor {
    void processEmail(Email email);
}
class CaptainEmailProcess implements EmailProcessor{
    private EmailProcessor nextEmailProcessor;
    CaptainEmailProcess(){

    }
    CaptainEmailProcess(EmailProcessor nextEmailProcessor){
        this.nextEmailProcessor = nextEmailProcessor;
    }
    @Override
    public void processEmail(Email email) {
        if (email.getPriority()==Priority.LOW){
            System.out.println(email.getMessage()+"\t by the captain......");
        }
        else if (nextEmailProcessor != null){
            nextEmailProcessor.processEmail(email);
        }
        else{
            System.out.println("Sorry this email is not handle");
        }


    }
}

class CoachEmailProcess implements EmailProcessor{
    private EmailProcessor nextEmailProcessor;
    CoachEmailProcess(){

    }
    CoachEmailProcess(EmailProcessor nextEmailProcessor){
        this.nextEmailProcessor = nextEmailProcessor;
    }

    @Override
    public void processEmail(Email email) {
        if (email.getPriority()==Priority.MEDIUM){
            System.out.println(email.getMessage()+"\t email handle by Coach");
        }
        else if(nextEmailProcessor !=null){
            nextEmailProcessor.processEmail(email);
        }
        else{
            System.out.println("Sorry,Email is not handled..........");
        }


    }
}
class BoardEmailProcessor implements EmailProcessor{
    private EmailProcessor nextEmailProcessor;
    BoardEmailProcessor(){

    }
    BoardEmailProcessor(EmailProcessor nextEmailProcessor){
        this.nextEmailProcessor = nextEmailProcessor;
    }


    @Override
    public void processEmail(Email email) {
        if (email.getPriority()==Priority.HIGH){
            System.out.println(email.getMessage()+"\t Email handled by Board.......");
        }
        else if (nextEmailProcessor !=null){
            nextEmailProcessor.processEmail(email);
        }
        else {
            System.out.println("Sorry, it is not possible to handle.............");
        }

    }
}
