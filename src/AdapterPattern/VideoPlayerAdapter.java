package AdapterPattern;

public class VideoPlayerAdapter implements IAudio{
    IVideo media;
    VideoPlayerAdapter(String type) {
        media = VideoFactory.getPlayer(type);

    }
    @Override
    public void play(String type, String filename) {
        System.out.println("You can write method body in your own way");
        media.playAudio(filename);

    }
}
