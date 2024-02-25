package _5_decorator;

public class BackendDeveloper implements ITDepartment{
    @Override
    public String makeWebsite() {
        return "BACKEND";
    }
}
