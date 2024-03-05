package _5_abstract_factory.abstract_factory.abs_factory.website;

import _5_abstract_factory.abstract_factory.abs_factory.*;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("!!!creating AUTION SITE SYSTEM!!!");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
