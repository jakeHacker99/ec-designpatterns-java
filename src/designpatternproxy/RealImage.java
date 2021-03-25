package designpatternproxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    @Override
    public void display() {
        System.out.println("Diplaying "+ fileName);
        System.out.println("");
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading "+ fileName +" ...");
    }
}
