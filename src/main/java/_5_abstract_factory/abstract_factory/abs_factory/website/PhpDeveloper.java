package _5_abstract_factory.abstract_factory.abs_factory.website;

import _5_abstract_factory.abstract_factory.abs_factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Writed Code");
    }
}
