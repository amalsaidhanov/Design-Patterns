package _3_decorator.itdep_decorator_example;

public class BackendDeveloper implements ITDepartment{
    @Override
    public String makeWebsite() {
        return "BACKEND";
    }
}
