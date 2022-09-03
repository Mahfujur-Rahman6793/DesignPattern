package AdapterPattern;

public class AudioPlayerAdapter implements IVideo {
    IAudio media;
    AudioPlayerAdapter(){
        media = new Mp3();
    }

    @Override
    public void playAudio(String filename) {
        System.out.println("Generate Some Pattern......");
    }

    @Override
    public void playVideo(String filename) {
        media.play("", filename);
    }
}
