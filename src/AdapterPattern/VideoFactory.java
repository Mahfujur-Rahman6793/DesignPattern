package AdapterPattern;

public class VideoFactory {
    public static IVideo getPlayer(String type){
        IVideo player = null;
        if (type.equalsIgnoreCase("mp4")){
            player = new MP4Player();
        }
        else if(type.equalsIgnoreCase("MKV")){
            player = new MKVPlayer();
        }

        return player;
    }
}
