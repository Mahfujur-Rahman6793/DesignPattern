package Adapter;

public class AudioPlayer implements InterfaceAudio{
    InterfaceAudio audio;


    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("mp3")){
            new Mp3().play(type,filename);
        }
        else{
            audio =new VideoPlayerAdapter(type);
            audio.play(type, filename);
        }
    }

}
