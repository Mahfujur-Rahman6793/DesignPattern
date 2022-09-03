package AdapterPattern;

public class AudioPlayer implements IAudio{
    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("Mp3")){
            new Mp3().play(type ,filename);
        }
        else{
            IAudio audio = new VideoPlayerAdapter(type);
            audio.play(type, filename);
        }

    }
}
