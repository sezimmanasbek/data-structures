package polymorphism;

import static polymorphism.ParentClass.method2;

public class TestClass {
    public static void main(String[] args) {
        ParentClass cl = new SubClassA();
        cl.method();
        method2();

    }
}
