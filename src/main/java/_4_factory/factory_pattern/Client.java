package _4_factory.factory_pattern;


import _4_factory.factory_pattern.factory.CppDevFactory;
import _4_factory.factory_pattern.factory.DeveloperFactory;
import _4_factory.factory_pattern.factory.JavaDevFactory;
import _4_factory.factory_pattern.factory.PhpDeveloperFactory;

public class Client {
    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDevFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDevFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + "Unkown");
        }
    }

    public static void main(String[] args) {

        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();


//        Developer cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCode();
//
//        Developer javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeCode();
    }
}
