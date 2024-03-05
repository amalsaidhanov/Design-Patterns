package _5_abstract_factory.abstract_factory.abs_factory.banking;


import _5_abstract_factory.abstract_factory.abs_factory.*;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("!!!creating SUPERBANK SYSTEM!!!");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
