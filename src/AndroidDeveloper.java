public class AndroidDeveloper extends Programmer {

    private String lang;

    public AndroidDeveloper(String name, int age, Work working, Office office, String lang) {
        super(name, age, working, office);
        this.lang = lang;

    }

    public String getLang() {
        return lang;
    }
    public  final void getData(String lang){
        System.out.println("язык разработчика "+ lang);
    }
    public  void getData( ){
        System.out.println("это андроид разработчик");

    }
}
