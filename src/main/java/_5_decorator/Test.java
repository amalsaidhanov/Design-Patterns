package _5_decorator;

public class Test {

    public static void main(String[] args) {

        TeamLead.annonceRule();

        ITDepartment goodRealisationItDep = new TeamLead(new FrontendDeveloper(new BackendDeveloper()));
        System.out.println(goodRealisationItDep.makeWebsite());

        ITDepartment badRealisationItDep = new FrontendDeveloper(new TeamLead(new BackendDeveloper()));
        System.out.println(badRealisationItDep.makeWebsite());


    }
}
