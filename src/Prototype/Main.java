package Prototype;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("Valobasa","com");
        File file2 = file1.copy();
        file2.setFileName("Hate");
        file2.setFileExtension("net");
        System.out.println("File 1: "+file1);
        System.out.println("\n\n");
        System.out.println("File 2: "+file2);

    }
}
