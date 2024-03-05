package _4_factory.factory_pattern.factory;

import _4_factory.factory_pattern.CppDeveloper;
import _4_factory.factory_pattern.Developer;

public class CppDevFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
