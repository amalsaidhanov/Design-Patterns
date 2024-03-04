package _4_factory.factory_pattern;


public class Client {
    public static void main(String[] args) {

        Developer cppDeveloper = new CppDeveloper();
        cppDeveloper.writeCode();

        Developer javaDeveloper = new JavaDeveloper();
        javaDeveloper.writeCode();
    }
}
