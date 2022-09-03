package Adapter;

public class MKVplayer implements InterfaceVideo{
    @Override
    public void Videoplay(String filename) {
        System.out.println("Decoding " +filename+" file using MKV Player");
    }

    @Override
    public void Audioplay(String filename) {
        System.out.println("Playing audio from MKV file " +filename);
    }
}
