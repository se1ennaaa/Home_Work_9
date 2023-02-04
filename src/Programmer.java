public class Programmer {
    private String name;
    private int age;

    private Work working;
    private Office office;

    public Programmer(String name, int age, Work working, Office office) {
        this.name = name;
        this.age = age;
        this.working = working;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Office getOffice() {
        return office;
    }

    public Work getWorking() {
        return working;
    }
}
