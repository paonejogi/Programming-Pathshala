public class Constructer {
    
    String modelName;
    int capacity;

    //Constructer used define obj intaial values and created when obj created

    public Constructer(String input, int num){
        //modelName = "Default Bike: ";
       modelName = input;
        capacity = 50; 
    }

    public static void main(String[] args) {
        Constructer firstObject = new Constructer("Volvo",2500);
    String defaultName = firstObject.modelName;
    System.out.println(defaultName+ " " + firstObject.capacity);
    }

}
