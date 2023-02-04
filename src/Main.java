public class Main {
    public static void main(String[] args) {
        AndroidDeveloper androidDeveloper= new AndroidDeveloper("djone",32, Work.MANAGER,new Office("hjbc"),"Java");
        SenoirAndroidDev senoirAndroidDev = new SenoirAndroidDev("leo",23,Work.NEVDEV,new Office("nvk"),"Kotlin",2);
        SenoirAndroidDev senoirAndroid = new SenoirAndroidDev("div",22,Work.NEVDEV,new Office("jfn"), "Java",5);

        System.out.println("AndroidDevName "+androidDeveloper.getName()+"\nAge" + androidDeveloper.getAge()+" \nWorking"+androidDeveloper.getWorking()+"\nOffice Address"+androidDeveloper.getOffice().getAddress()+"\nlang"+androidDeveloper.getLang());
        System.out.println("SenoirAndroidDev"+senoirAndroidDev.getName()+"\nAge" + senoirAndroidDev.getAge()+"\n Working"+senoirAndroidDev.getWorking()+"\nOffice Address"+senoirAndroidDev.getOffice().getAddress()+"\nlang"+senoirAndroidDev.getLang());
        System.out.println("senoirAndroidDev"+senoirAndroid.getName()+"\nAge" + senoirAndroid.getAge()+" \nWorking"+senoirAndroid.getWorking()+"\nOffice Address"+senoirAndroid.getOffice().getAddress()+"\nlang"+senoirAndroid.getLang());

        androidDeveloper.getData();
        androidDeveloper.getData();
        androidDeveloper.getData("kotlin");
        senoirAndroid.getData();
        senoirAndroidDev.getData();



    }
}