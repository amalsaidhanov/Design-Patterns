package _5_abstract_factory.abstract_factory.abs_factory.banking;

import _5_abstract_factory.abstract_factory.abs_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
