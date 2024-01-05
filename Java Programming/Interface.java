interface FirstInterface{
    public void myFirstMethod();
}
interface SecoundInterface{
    public void mySecondMethod();
}

class DemoClass implements FirstInterface,SecoundInterface{
    public void myFirstMethod(){
          System.out.println("First interface method");
    }

    public void mySecondMethod(){
          System.out.println("Second interface method");
    }
}

/**
 * Interface
 */
public class Interface {

    public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myFirstMethod();
    myObj.mySecondMethod();
    }
}