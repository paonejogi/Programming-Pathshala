public class Modifiers {
    final int x =10;
    final double PI = 3.147;
    
    static void staicMethod(){
        System.out.println("Static method canbe called without creating the objects!");
    }

    public void publicMethod(){
        System.out.println("Public methods can be called only by creating the objects!");
    }

    public static void main(String[] args) {
        
        Modifiers firstObject = new Modifiers();
        // firstObject.x =10; throws error because final!
        System.out.println(firstObject.PI);

        staicMethod();
        //publicMethod();
        firstObject.publicMethod();

    }
    
}
