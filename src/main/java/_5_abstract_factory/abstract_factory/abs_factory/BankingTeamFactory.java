package _5_abstract_factory.abstract_factory.abs_factory;

import _5_abstract_factory.abstract_factory.abs_factory.banking.JavaDeveloper;
import _5_abstract_factory.abstract_factory.abs_factory.banking.BankingPM;
import _5_abstract_factory.abstract_factory.abs_factory.banking.QATester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
