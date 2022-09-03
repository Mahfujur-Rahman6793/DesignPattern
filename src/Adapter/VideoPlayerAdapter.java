package Adapter;

public class VideoPlayerAdapter implements InterfaceAudio{
    InterfaceVideo media;
    public VideoPlayerAdapter(String type){
        media = VideoFactoryPlayer.getPlayer(type);
    }
    @Override
    public void play(String type, String filename) {
        media.Audioplay(filename);
    }
}
