package _5_decorator;

public class FrontendDeveloper extends DecoratorForITDev {
    public FrontendDeveloper(ITDepartment itDepartment) {
        super(itDepartment);
    }

    public String makeFrontend() {
        return "FRONTEND";
    }

    @Override
    public String makeWebsite() {
        return super.makeWebsite() + " "+ makeFrontend();
    }
}
