package all.reflection;

public class StartReflection {
    public void start(){
        ReadClass readClass = new ReadClass();
        TestClass testClass = new TestClass("oldValue");
        readClass.read(testClass);
        ShowClassInfo showClassInfo = new ShowClassInfo(readClass.getSomeClass());
        SetField setField = new SetField(readClass.getSomeClass(), testClass);

        showClassInfo.showFields();
        showClassInfo.showConstructor();
        showClassInfo.showMethod();

        testClass.printText();
        setField.setField("text", "newValue");
        testClass.printText();
    }
}
