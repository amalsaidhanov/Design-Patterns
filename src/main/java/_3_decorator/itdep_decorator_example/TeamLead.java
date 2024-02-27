package _3_decorator.itdep_decorator_example;


public class TeamLead extends DecoratorForITDev {

    public TeamLead(ITDepartment itDepartment) {
        super(itDepartment);
    }
    public String checkTheWebSite() {
        System.out.println("Let's check It");
        if (super.makeWebsite().equals("BACKEND FRONTEND"))
            return ":Всё четко";
        else
            return ":Вам пизда";
    }
    @Override
    public String makeWebsite() {
        System.out.println();
        return super.makeWebsite() + " " +checkTheWebSite();
    }

    /////////////////////////
    public static void annonceRule(){
        System.out.println("In my team! the workflow is as follows:\n1- FRONTEND, first\n2- the backend, second");
    }
}
