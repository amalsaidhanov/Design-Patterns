package _5_abstract_factory.abstract_factory.abs_factory;

import _5_abstract_factory.abstract_factory.abs_factory.website.ManualTester;
import _5_abstract_factory.abstract_factory.abs_factory.website.PhpDeveloper;
import _5_abstract_factory.abstract_factory.abs_factory.website.WebsitePM;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
