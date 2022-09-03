package Adapter;

public class Mp4Player implements InterfaceVideo{
    @Override
    public void Videoplay(String filename) {
        System.out.println("Decoding " +filename+" file using Mp4 Player");
    }

    @Override
    public void Audioplay(String filename) {
        System.out.println("Playing audio from Mp4 file " +filename);

    }
}
