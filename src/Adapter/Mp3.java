package Adapter;

public class Mp3 implements InterfaceAudio{
    @Override
    public void play(String type, String filename) {
        System.out.println("Running Audio Song ......... :" +filename);
    }
}
