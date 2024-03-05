package _5_abstract_factory.abstract_factory.abs_factory;


public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();

}
