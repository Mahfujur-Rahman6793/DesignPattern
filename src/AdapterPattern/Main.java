package AdapterPattern;



public class Main {
    public static void main(String[] args) {
        AudioPlayer audio=new AudioPlayer();
        audio.play("mp3","Kabhi jo badal.mp3");
        System.out.println("----");

        audio.play("mkv", "xyz.mkv");

        System.out.println("----");

        audio.play("mp4","abc.mp4");
    }
}
