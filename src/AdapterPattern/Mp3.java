package AdapterPattern;

public class Mp3 implements IAudio{
    @Override
    public void play(String type, String filename) {
        System.out.println("Running Audio song .........."+filename);
    }
}
