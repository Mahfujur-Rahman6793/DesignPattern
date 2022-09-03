package Adapter;

public class AudioPlayerAdapter implements InterfaceVideo {
    InterfaceAudio media ;

    AudioPlayerAdapter(){
        media = new Mp3();
    }
    @Override
    public void Videoplay(String filename) {
        System.out.println("Generate Some Pattern......");
    }

    @Override
    public void Audioplay(String filename) {
        media.play("", filename);
    }
}
