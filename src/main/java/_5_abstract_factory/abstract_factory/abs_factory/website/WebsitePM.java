package _5_abstract_factory.abstract_factory.abs_factory.website;

import _5_abstract_factory.abstract_factory.abs_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("website PM manages project");
    }
}
