 
public class Inheritence {
    
    protected String brand = "FORD";
    public void honk(){
        System.out.println("Peep peeeeeee pee!");
    }
}

class myCar extends Inheritence{
    protected String model = "Enduver";

    public static void main(String[] args) {
        myCar myCarObj = new myCar();
        myCarObj.honk();
        System.out.println(myCarObj.brand);
        System.out.println(myCarObj.model);
    }
}
