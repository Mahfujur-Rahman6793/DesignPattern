package Adapter;

public class VideoFactoryPlayer {

    public static InterfaceVideo getPlayer(String type){
        InterfaceVideo player = null;
        if (type.equalsIgnoreCase("Mp4")){
            player = new Mp4Player();
        }
        else if (type.equalsIgnoreCase("MKV")){
            player = new MKVplayer();
        }
        return player;
    }
}
