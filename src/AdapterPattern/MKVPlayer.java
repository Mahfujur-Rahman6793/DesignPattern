package AdapterPattern;

public class MKVPlayer implements IVideo{
    @Override
    public void playAudio(String filename) {
        System.out.println("Audio is running from MKVPlayer :"+filename);
    }

    @Override
    public void playVideo(String filename) {
        System.out.println(" Decoding "+filename +"Play with MKVPlayer");
    }
}

class MP4Player implements IVideo{

    @Override
    public void playAudio(String filename) {
        System.out.println("Audio is running from MP4Player :"+filename);
    }

    @Override
    public void playVideo(String filename) {
        System.out.println(" Decoding "+filename +"Play with MP4Player");
    }
}