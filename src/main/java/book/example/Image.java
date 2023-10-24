package book.example;

public class Image implements Element {
    public String ImageName;

    public Image(String ImageName) {
        this.ImageName = ImageName;
    }

    public void print() {
        System.out.println("Image with name : " + ImageName);
    }

    @Override
    public void add(Element a) {

    }

    @Override
    public Element get(int nr) {
        return null;
    }

    @Override
    public void remove(Element a) {

    }
}