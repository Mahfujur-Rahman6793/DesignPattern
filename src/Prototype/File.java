package Prototype;

public class File {
    private String fileName;
    private String fileExtension;

    public File(String fileName, String fileExtension){
        this.fileName = fileName;
        this.fileExtension = fileExtension;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public File copy(){
        File file =new File(this.fileName, this.fileExtension);
        return file;
    }
    public String toString(){
        return this.fileName +"."+this.fileExtension;
    }


}
