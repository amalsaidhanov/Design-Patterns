package _3_decorator.itdep_decorator_example;

public class DecoratorForITDev implements ITDepartment{

    ITDepartment itDepartment;

    public DecoratorForITDev(ITDepartment itDepartment) {
        this.itDepartment = itDepartment;
    }

    @Override
    public String makeWebsite() {
        return itDepartment.makeWebsite();
    }
}
