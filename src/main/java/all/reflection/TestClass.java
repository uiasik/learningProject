package all.reflection;

public class TestClass {
    private String text;

    public TestClass(String text) {
        this.text = text;
    }

    public void printText(){
        System.out.println(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
