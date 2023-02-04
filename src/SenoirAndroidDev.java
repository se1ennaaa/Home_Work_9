public final class SenoirAndroidDev extends AndroidDeveloper{

    private int experience;

    public SenoirAndroidDev(String name, int age, Work working, Office office, String lang, int experience) {
        super(name, age, working, office, lang);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public void getData() {
        super.getData();
        System.out.println("это сеньер разработчик");
    }
}
