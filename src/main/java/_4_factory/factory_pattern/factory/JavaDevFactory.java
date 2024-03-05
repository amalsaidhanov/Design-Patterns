package _4_factory.factory_pattern.factory;

import _4_factory.factory_pattern.Developer;
import _4_factory.factory_pattern.JavaDeveloper;

public class JavaDevFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
