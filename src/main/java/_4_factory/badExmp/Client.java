package _4_factory.badExmp;

public class Client {
    public static void main(String[] args) {

        CppDeveloper cppDeveloper = new CppDeveloper();
        cppDeveloper.writeCppCode();

        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.writeJavaCode();
    }
}
